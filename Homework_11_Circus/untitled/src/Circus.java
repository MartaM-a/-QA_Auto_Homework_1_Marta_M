import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Circus<T> {
    private List<T> performers = new ArrayList<>();

    public void addPerformer(T performer) {
        performers.add(performer);
    }

    public void removePerformer(T performer) {
        performers.remove(performer);
    }

    public List<T> listPerformers() {
        return performers;
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (T performer : performers) {
                writer.write(performer.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String act = parts[1];
                int experience = Integer.parseInt(parts[2]);
                performers.add((T) new CircusPerformer(name, act, experience));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
