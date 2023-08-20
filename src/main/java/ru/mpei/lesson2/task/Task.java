package ru.mpei.lesson2.task;

import java.util.Objects;

public class Task {
    private final String name;
    private TaskType taskType;

    public Task(String name, TaskType taskType) {
        this.name = name;
        this.taskType = taskType;
    }

    public String getName() {
        return name;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && taskType == task.taskType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, taskType);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", taskType=" + taskType +
                '}';
    }
}
