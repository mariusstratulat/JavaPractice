package com.java.collections.practice.comparator.comparable;

import java.time.LocalDate;

public class Examples {
    public static void main(String[] args) {

    }

    static class Employee implements Comparable<Employee> {

        private int id;
        private String name;
        private double salary;
        private LocalDate joiningDate;

        @Override
        public int compareTo(Employee o) {
            return 0;
        }
    }
}
