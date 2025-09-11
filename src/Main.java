public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);

        System.out.println("\n--- Manager Information ---");
        manager.displayInfo();
        manager.work();
        System.out.println("Salary: " + manager.calculateSalary());

        System.out.println("\n--- Developer Information ---");
        developer.displayInfo();
        developer.work();
        System.out.println("Salary: " + developer.calculateSalary());

        System.out.println("\n--- Intern Information ---");
        intern.displayInfo();
        intern.work();
        System.out.println("Salary: " + intern.calculateSalary());
    }
}
