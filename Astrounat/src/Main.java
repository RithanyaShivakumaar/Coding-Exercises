import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAstronaut Daily Schedule Organizer");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Mark Task Completed");
            System.out.println("5. View Tasks by Priority");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter start time (HH:mm): ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time (HH:mm): ");
                    String endTime = scanner.nextLine();
                    System.out.print("Enter priority (High, Medium, Low): ");
                    String priority = scanner.nextLine();
                    Task task = TaskFactory.createTask(description, startTime, endTime, priority);
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task description to remove: ");
                    String removeDesc = scanner.nextLine();
                    manager.removeTask(removeDesc);
                    break;
                case 3:
                    manager.viewTasks();
                    break;
                case 4:
                    System.out.print("Enter task description to mark as completed: ");
                    String completeDesc = scanner.nextLine();
                    manager.markTaskCompleted(completeDesc);
                    break;
                case 5:
                    System.out.print("Enter priority (High, Medium, Low): ");
                    String viewPriority = scanner.nextLine();
                    manager.viewTasksByPriority(viewPriority);
                    break;
                case 6:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
