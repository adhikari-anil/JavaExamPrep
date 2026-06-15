
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class PastYear {

    public static class Employee {

        final int id;
        final String name;
        final int age;
        final double salary;
        final String role;

        public Employee(int id, String name, double salary, String role, int age) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.role = role;
            this.age = age;
        }

        public String toFileFormat() {
            return id + "," + name + "," + salary + "," + age + "," + role;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter your name sir: ");
        Scanner input1 = new Scanner(System.in);
        String Name = input1.nextLine();

        System.out.println("Enter your Age sir: ");
        Scanner input2 = new Scanner(System.in);
        int Age = Integer.parseInt(input2.nextLine());

        System.out.println("Enter your Role sir: ");
        Scanner input3 = new Scanner(System.in);
        String role = input3.nextLine();

        Employee emp1 = new Employee(1, Name, Age, role, 50000);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("emp.doc"))) {
            writer.write(emp1.toFileFormat());
            System.out.println("Employee objects have been written to emp.doc");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
