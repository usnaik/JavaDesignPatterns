package com.usn.patterns.builder.task;

import java.util.Date;

public class MainTest {

    public static void main(String[] args) {
        Task task1 = new TaskBuilder(5).setDescription("Hello Desc").setSummary("Test Summary").build();
        System.out.println(task1);

        Task task2 = new TaskBuilder(1).setDescription("World Desc").setDueDate(new Date()).build();
        System.out.println(task2);

        Task task3 = new TaskBuilder(3).setDone(true).build();
        System.out.println(task3);
        
    }

}