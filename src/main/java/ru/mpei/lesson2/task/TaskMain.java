package ru.mpei.lesson2.task;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("First task", TaskType.NEW);

        task.setTaskType(TaskType.IN_PROGRESS);

        System.out.println(task);
    }
}
