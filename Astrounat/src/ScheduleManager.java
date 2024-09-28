import java.util.*;
import java.util.logging.Logger;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private static final Logger logger = Logger.getLogger(ScheduleManager.class.getName());

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    // Singleton instance
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    // Add a new task after validating
    public void addTask(Task task) {
        if (isTaskValid(task)) {
            tasks.add(task);
            tasks.sort(Comparator.comparing(Task::getStartTime)); // Sort by start time
            logger.info("Task added: " + task);
            System.out.println("Task added successfully.");
        } else {
            System.out.println("Error: Task conflicts with an existing task.");
        }
    }

    // Check for time overlap
    private boolean isTaskValid(Task newTask) {
        for (Task task : tasks) {
            if (isTimeOverlap(task, newTask)) {
                return false;
            }
        }
        return true;
    }

    // Time overlap check
    private boolean isTimeOverlap(Task task1, Task task2) {
        return (task1.getStartTime().compareTo(task2.getEndTime()) < 0) &&
               (task2.getStartTime().compareTo(task1.getEndTime()) < 0);
    }

    // Remove task
    public void removeTask(String description) {
        boolean removed = tasks.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
        if (removed) {
            System.out.println("Task removed successfully.");
            logger.info("Task removed: " + description);
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    // View all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            tasks.forEach(System.out::println);
        }
    }

    // View tasks by priority
    public void viewTasksByPriority(String priority) {
        tasks.stream()
             .filter(task -> task.getPriority().equalsIgnoreCase(priority))
             .forEach(System.out::println);
    }

    // Mark a task as completed
    public void markTaskCompleted(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.markCompleted();
                System.out.println("Task marked as completed.");
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }
}
