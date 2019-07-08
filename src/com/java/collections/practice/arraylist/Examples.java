package com.java.collections.practice.arraylist;

import java.util.*;

public class Examples {
    public static void main(String[] args) {
        /* Access elements from ArrayList */

        List<String> topCompanies = new ArrayList<>();

        topCompanies.add("Amazon");
        topCompanies.add("Microsoft");
        topCompanies.add("IBM");
        topCompanies.add("Google");
        topCompanies.add("Apple");

        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        topCompanies.set(4, "Facebook");

        System.out.println("Modified top companies list: " + topCompanies);

        System.out.println("########################");

        /* Sorting an ArrayList using Collections.sort() method */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before : " + numbers);

        Collections.sort(numbers);

        System.out.println("After : " + numbers);
        System.out.println("########################");

        /* ArrayList Iterator Remove example */
        List<Integer> numbers1 = new ArrayList<>();

        numbers1.add(13);
        numbers1.add(18);
        numbers1.add(25);
        numbers1.add(40);

        Iterator<Integer> itNums = numbers1.iterator();

        while(itNums.hasNext()) {
            Integer num = itNums.next();

            if(num % 2 != 0) {
                itNums.remove();
            }
        }

        System.out.println(numbers1);
        System.out.println("########################");

        /* ArrayList object sort example */

        List<Person> people = new ArrayList<>();
        people.add(new Person("Mike", 47));
        people.add(new Person("John", 30));
        people.add(new Person("Lisa", 28));
        people.add(new Person("Jenna", 35));

        System.out.println("Person List : " + people);

        // Sort People by their Age
        people.sort((person1, person2) -> {
            return person1.getAge() - person2.getAge();
        });

        // A more concise way of writing the above sorting function
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted Person List by Age : " + people);

        // You can also sort using Collections.sort() method by passing the custom Comparator
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name : " + people);

        System.out.println("########################");

        /* ArrayList sort example */

        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names : " + names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        // The above sort() method call can also be written simply using lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));

        // Following is an even more concise solution
        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + names);

        System.out.println("########################");

        /* Creating an ArrayList of String */
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals);

        System.out.println("########################");

        /* Create ArrayList from collection */
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        // Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);


        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);

        /* Search elements in ArrayList */
        List<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Alice");
        names2.add("Bob");
        names2.add("Steve");
        names2.add("John");
        names2.add("Steve");
        names2.add("Maria");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " + names2.contains("Bob"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Steve\": " + names2.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names2.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"John\" : " + names2.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" : " + names2.lastIndexOf("Bill"));
    }

    static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
