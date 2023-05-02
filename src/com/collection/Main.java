package com.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList studentAList = new ArrayList<>();
        studentAList.add("Hardeek");
        studentAList.add("Yash");
        studentAList.add("Mihir");
        studentAList.add("Suresh");
        studentAList.add("Rakesh");
        System.out.println("ArrayList containing list of students = ");
        ListIterator arrayItr = studentAList.listIterator();
        while (arrayItr.hasNext()) {
            String eachStudent = (String) arrayItr.next();
            System.out.println(eachStudent);
        }

        System.out.println("-----------------------------");
        HashSet studentHashSet = new HashSet();
        studentHashSet.add("Hardeek");
        studentHashSet.add("Hardeek");
        studentHashSet.add("Yash");
        studentHashSet.add("Mihir");
        studentHashSet.add("Suresh");
        studentHashSet.add("Rakesh");
        System.out.println("HashSet removes the duplicate and uses hashtable here is the list of students = ");
        Iterator hashSetItr = studentHashSet.iterator();
        while (hashSetItr.hasNext()) {
            String eachStudent = (String) hashSetItr.next();
            System.out.println(eachStudent);
        }
        System.out.println("------------------------------");


        HashMap studentHashMap = new HashMap();
        studentHashMap.put(1,"Hardeek");
        studentHashMap.put(2,"Hardeek");
        studentHashMap.put(6,"Yash");
        studentHashMap.put(1,"Mihir");
        studentHashMap.put(7,"Suresh");
        studentHashMap.put(8,"Suresh");
        System.out.println("HashMap cant have duplicate keys here is the list of students = ");
        Iterator hashMapItr = studentHashMap.entrySet().iterator();
        while (hashMapItr.hasNext()) {
            Map.Entry eachStudent = (Map.Entry) hashMapItr.next();
            System.out.println(eachStudent);
        }
        System.out.println("------------------------------");

        TreeSet studentTreeSet = new TreeSet();
        studentTreeSet.add("Hardeek");
        studentTreeSet.add("Hardeek");
        studentTreeSet.add("Yash");
        studentTreeSet.add("Mihir");
        studentTreeSet.add("Suresh");
        studentTreeSet.add("Rakesh");
        System.out.println("TreeSet sorts the element and removes duplicate here is the list of students = ");
        Iterator hashTreeSetItr = studentTreeSet.iterator();
        while (hashTreeSetItr.hasNext()) {
            String eachStudent = (String) hashTreeSetItr.next();
            System.out.println(eachStudent);
        }

        System.out.println("------------------------------");


        TreeMap studentTreeMap = new TreeMap();
        studentTreeMap.put(1,"Hardeek");
        studentTreeMap.put(2,"Hardeek");
        studentTreeMap.put(6,"Yash");
        studentTreeMap.put(1,"Mihir");
        studentTreeMap.put(7,"Suresh");
        studentTreeMap.put(8,"Suresh");
        System.out.println("HashMap cant have duplicate keys here is the list of students = ");
        Iterator treeMapItr = studentTreeMap.entrySet().iterator();
        while (treeMapItr.hasNext()) {
            Map.Entry eachStudent = (Map.Entry) treeMapItr.next();
            System.out.println(eachStudent);
        }
    }


}