package oop.lesson08.LinkedListOfTasks;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class TaskManager {

    // Inner Task class
    public static class Task {
        String name;
        int priority;
        boolean completed;

        // Constructor initializes task properties
        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
            this.completed = false;
        }

        // Returns formatted task info
        @Override
        public String toString() {
            return "Task{name='" + name + "', priority=" + priority + ", completed=" + completed + "}";
        }
    }

    private LinkedList<Task> tasks = new LinkedList<>();

    // Adds a task to the LinkedList
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Removes a task by name
    public void removeTask(String name) {
        tasks.removeIf(task -> task.name.equals(name));
    }

    // Marks a task as completed
    public void markTaskCompleted(String name) {
        for (Task task : tasks) {
            if (task.name.equals(name)) {
                task.completed = true;
            }
        }
    }

    // Displays all tasks using a loop
    public void displayAllTasks() {
        System.out.println("All Tasks:");
        for (Task task : tasks) {
            System.out.println("  " + task);
        }
    }

    // Displays only completed tasks using a loop
    public void displayCompletedTasks() {
        System.out.println("Completed Tasks:");
        for (Task task : tasks) {
            if (task.completed) {
                System.out.println("  " + task);
            }
        }
    }

    // Sorts tasks by priority
    public void sortTasksByPriority() {
        Collections.sort(tasks, Comparator.comparingInt(t -> t.priority));
    }
}
