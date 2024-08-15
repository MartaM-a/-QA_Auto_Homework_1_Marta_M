import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circus<CircusPerformer> circus = new Circus<>();

        // Add performers
        while (true) {
            System.out.println("Do you want to add a performer? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                CircusPerformer performer = CircusPerformer.createPerformer();
                circus.addPerformer(performer);
            } else {
                break;
            }
        }

        // Save to file
        circus.saveToFile("circusPerformers.txt");

        // Load from file
        Circus<CircusPerformer> loadedCircus = new Circus<>();
        loadedCircus.loadFromFile("circusPerformers.txt");

        // Display loaded performers
        for (CircusPerformer performer : loadedCircus.listPerformers()) {
            System.out.println(performer.getInfo());
        }

        // Use reflection to run methods annotated with @RunImmediately
        for (CircusPerformer performer : loadedCircus.listPerformers()) {
            for (Method method : performer.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(RunImmediately.class)) {
                    RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                    int times = annotation.times();
                    for (int i = 0; i < times; i++) {
                        try {
                            System.out.println(method.invoke(performer));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }

}



