package com.java.collections.practice.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Examples {
    public static void main(String[] args) {

        // Ex1 - create hashmap and add key-value pairs to it
        Map<String, Integer> numberMapping = new HashMap<>();

        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);

        // Ex 2 - access keys from hashmap
        Map<String,String> userCityMapping = new HashMap<>();

        // Check if a HashMap is empty
        System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());

        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        System.out.println("userCityMapping HashMap : " + userCityMapping);

        // Find the size of a HashMap
        System.out.println("We have the city information of " + userCityMapping.size() + " users");

        String userName = "Steve";

        if(userCityMapping.containsKey(userName)) {
            String city = userCityMapping.get(userName);
            System.out.println(userName + " lives in " + city);
        } else {
            System.out.println("City details not found for user " + userName);
        }

        // Ex 3 - EntryKeySetValues example

        Map<String, String> countryISOCodeMapping = new HashMap<>();

        countryISOCodeMapping.put("India", "IN");
        countryISOCodeMapping.put("United States of America", "US");
        countryISOCodeMapping.put("Russia", "RU");
        countryISOCodeMapping.put("Japan", "JP");
        countryISOCodeMapping.put("China", "CN");

        // HashMap's entry set
        Set<Map.Entry<String,String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();

        System.out.println("countryISOCode entries : " + countryISOCodeEntries);

        // HashMap's key set
        Set<String> countries = countryISOCodeMapping.keySet();

        System.out.println("countries: " + countries);

        // HashMap's values
        Collection<String> isoCodes = countryISOCodeMapping.values();

        System.out.println("isoCodes: " + isoCodes);

    }
}
