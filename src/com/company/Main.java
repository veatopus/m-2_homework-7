package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LineLengthComparator lineLengthComparator = new LineLengthComparator();
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        Iterator<String> iteratorA;
        Iterator<String> iteratorB;

        arrayFilling(a, 5);
        print(a);

        arrayFilling(b, 5);
        print(b);

        Collections.reverse(b);

        iteratorA = a.iterator();
        iteratorB = b.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            c.add(iteratorA.next());
            c.add(iteratorB.next());
        }

        print(c);
        
        c.sort(lineLengthComparator);

        print(c);
    }

    public static void arrayFilling(Collection<String> collection, int quantity) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= quantity; i++) {
            System.out.println("введите новый элемент кллекции");
            collection.add(scanner.nextLine());
        }
    }

    public static void print(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();

        System.out.println("______________________________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("______________________________________");
    }
}
