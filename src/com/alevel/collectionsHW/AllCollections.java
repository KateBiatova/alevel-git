package com.alevel.collectionsHW;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class AllCollections {

    public static void makeArrayList(int count, int iter, PrintWriter outputfile) throws FileNotFoundException {
        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();
        Set<Integer> myHashSet = new HashSet<>();
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>();
        Set<Integer> myTreeSet = new TreeSet<>();

        long start = System.nanoTime();
        long end = 0;

        System.out.println(" ");
        System.out.println("Lets start to add the elements!");
        outputfile.println();
        outputfile.println("Lets start to add the elements!");

        //add to ArrayList
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myArrayList.add(i);
        }
        end = System.nanoTime() - start;
        System.out.println("ArrayList takes: " + end);
        outputfile.println("ArrayList takes: " + end);

        //add to LinkedList
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myLinkedList.add(i);
        }
        end = System.nanoTime() - start;
        System.out.println("LinkedList takes: " + end);
        outputfile.println("LinkedList takes: " + end);

        //add to HashSet
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myHashSet.add(i);
        }
        end = System.nanoTime() - start;
        System.out.println("HashSet takes: " + end);
        outputfile.println("HashSet takes: " + end);

        //add to LinkedHashSet
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myLinkedHashSet.add(i);
        }
        end = System.nanoTime() - start;
        System.out.println("LinkedHashSet takes: " + end);
        outputfile.println("LinkedHashSet takes: " + end);

        //add to TreeMap
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myTreeSet.add(i);
        }
        end = System.nanoTime() - start;
        System.out.println("TreeSet takes: " + end);
        outputfile.println("TreeSet takes: " + end);

        System.out.println(" ");
        System.out.println("Lets start to delete!");

        outputfile.println();
        outputfile.println("Lets start to delete!");

        Iterator<Integer> iteratorArrayList = myArrayList.iterator();
        Iterator<Integer> iteratorLinkedList = myLinkedList.iterator();
        Iterator<Integer> iteratorHashSet = myHashSet.iterator();
        Iterator<Integer> iteratorLinkedHashSet = myLinkedHashSet.iterator();
        Iterator<Integer> iteratorTreeSet = myTreeSet.iterator();

        //remove from ArrayList
        start = System.nanoTime();
        while (iteratorArrayList.hasNext()){
            iteratorArrayList.next();
            iteratorArrayList.remove();
        }
        end = System.nanoTime() - start;
        System.out.println("ArrayList takes: " + end);
        outputfile.println("ArrayList takes: " + end);

        //remove from LinkedList
        start = System.nanoTime();
        while (iteratorLinkedList.hasNext()){
            iteratorLinkedList.next();
            iteratorLinkedList.remove();
        }
        end = System.nanoTime() - start;
        System.out.println("LinkedList takes: " + end);
        outputfile.println("LinkedList takes: " + end);

        //remove from HashSet
        start = System.nanoTime();
        while (iteratorHashSet.hasNext()){
            iteratorHashSet.next();
            iteratorHashSet.remove();
        }
        end = System.nanoTime() - start;
        System.out.println("HashSet takes: " + end);
        outputfile.println("HashSet takes: " + end);

        //remove from LinkedHashSet
        start = System.nanoTime();
        while (iteratorLinkedHashSet.hasNext()){
            iteratorLinkedHashSet.next();
            iteratorLinkedHashSet.remove();
        }
        end = System.nanoTime() - start;
        System.out.println("LinkedHashSet takes: " + end);
        outputfile.println("LinkedHashSet takes: " + end);

        //remove from TreeMap
        start = System.nanoTime();
        while (iteratorTreeSet.hasNext()){
            iteratorTreeSet.next();
            iteratorTreeSet.remove();
        }
        end = System.nanoTime() - start;
        System.out.println("TreeSet takes: " + end);
        outputfile.println("TreeSet takes: " + end);
    }
}
