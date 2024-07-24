import com.exemplee.mployees.newversion.Developer;
import com.exemplee.mployees.newversion.Designer;
import com.exemplee.mployees.newversion.Employee;
import com.exemplee.mployees.newversion.Manager;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Halya", 20, 30000),
                new Developer("Valya", 19, 22000),
                new Designer("Kolya", 21, 18000)
        };

        for (Employee employee : employees) {
            employee.performJob();
            employee.describeRole();
            employee.describeRole("Additional Info");
            System.out.println();
        }
    }
}