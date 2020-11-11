package com.hw1;
import com.hw1.Q1.Stackulator;
import com.hw1.Q2.BinarySearch;
import com.hw1.Q2.BinarySearchRecursive;
import com.hw1.Q2.LinearSearch;
import com.hw1.Q3.Functions;
import com.hw1.Q3.Stopwatch;
import com.hw1.Q5.Bubblesort;
import com.hw1.Q5.MergeSortTop;
import com.hw1.Q5.QuickSort;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        //---------------
        //Problem 1
        //---------------

        String[] expression1 = new String[]{"(", "(", "4", "+", "1", ")", "+", "3", ")"};   //test 1
        String[] expression2 = new String[]{"(", "2", "+", "2", ")"};                       //test 2
        String[] expression3 = new String[]{"(", "(", "5", "-", "1", ")", "/", "2", ")"};   //test 3
	    Stackulator.main(expression1);
	    Stackulator.main(expression2);
	    Stackulator.main(expression3);
        String[] expression4 = new String[]{"(", "2", "^", "2", ")"}; // 2^2
        String[] expression5 = new String[]{"(", "sqrt", "4", ")"}; // sqrt4
        String[] expression6 = new String[]{"(", "floor", "5.6", ")"}; // floor2
        Stackulator.main(expression4);
        Stackulator.main(expression5);
        Stackulator.main(expression6);
        String[] expresion7 = new String[]{"2", "+", "2", "2"}; //does not work
        Stackulator.main(expresion7);


        //---------------
        //Problem 2
        //---------------

        //first I generated the data, three sizes

        int[] data1 = IntStream.generate( () -> new Random().nextInt(100)).limit(100).toArray();
        int[] data1sorted = IntStream.generate( () -> new Random().nextInt(100)).limit(100).toArray();
        Arrays.sort(data1sorted);
        int[] data2 = IntStream.generate( () -> new Random().nextInt(10000)).limit(10000).toArray();
        int[] data2sorted = IntStream.generate( () -> new Random().nextInt(10000)).limit(10000).toArray();
        Arrays.sort(data2sorted);
        int[] data3 = IntStream.generate( () -> new Random().nextInt(100000)).limit(100000).toArray();
        int[] data3sorted = IntStream.generate( () -> new Random().nextInt(100000)).limit(100000).toArray();
        Arrays.sort(data3sorted);

        //the next 60 lines are all the tests for question two


        for (int i : data1)      //testing linear search with data 1
        {
            LinearSearch.rank(i, data1sorted);
        }
        System.out.println("Linear step count 1:");
        System.out.println(LinearSearch.linearsteps);

        for (int i : data2) //testing linear search with data 2
        {
            LinearSearch.rank(i, data2sorted);
        }
        System.out.println("Linear step count 2:");
        System.out.println(LinearSearch.linearsteps);

        for (int i : data3) //testing linear search with data 3
        {
            LinearSearch.rank(i, data3sorted);
        }
        System.out.println("Linear step count 3:");
        System.out.println(LinearSearch.linearsteps);


        for (int i : data1)      //testing Binary search with data 1
        {
            BinarySearch.rank(i, data1sorted);
        }
        System.out.println("Binary step count 1:");
        System.out.println(BinarySearch.binarysteps);

        for (int i : data2) //testing Binary search with data 2
        {
            BinarySearch.rank(i, data2sorted);
        }
        System.out.println("Binary step count 2:");
        System.out.println(BinarySearch.binarysteps);

        for (int i : data3) //testing Binary search with data 3
        {
            BinarySearch.rank(i, data3sorted);
        }
        System.out.println("Binary step count 3:");
        System.out.println(BinarySearch.binarysteps);


        for (int i : data1)      //testing BSR search with data 1
        {
            BinarySearchRecursive.rank(i, data1sorted);
        }
        System.out.println("Binary Recursive step count 1:");
        System.out.println(BinarySearchRecursive.binaryrecursivesteps);

        for (int i : data2) //testing BSR search with data 2
        {
            BinarySearchRecursive.rank(i, data2sorted);
        }
        System.out.println("Binary Recursive step count 2:");
        System.out.println(BinarySearchRecursive.binaryrecursivesteps);

        for (int i : data3) //testing BSR search with data 3
        {
            BinarySearchRecursive.rank(i, data3sorted);
        }
        System.out.println("Binary Recursive step count 3:");
        System.out.println(BinarySearchRecursive.binaryrecursivesteps);


        //---------------
        //Problem 3
        //---------------

        //we first run the three functions and then we print out how long they ran
        double linearResult = Functions.linear();
        double quadraticResult = Functions.quadratic();
        double cubicResult = Functions.cubic();
        System.out.println("Linear Result:");
        System.out.println(linearResult);
        System.out.println("Quadratic Result:");
        System.out.println(quadraticResult);
        System.out.println("Cubic Result:");
        System.out.println(cubicResult);

        //--------------
        //Problem 5
        //--------------

        //create data and arrays

        int[] dataone = new int[100];
        int[] datatwo = new int[1000];
        int[] datathree = new int[10000];
        int[] datafour = new int[100000];
        int[] datafive = new int[250000];

        Integer[] arrayone = Arrays.stream(dataone).boxed().toArray(Integer[]::new);
        Integer[] arraytwo = Arrays.stream(dataone).boxed().toArray(Integer[]::new);
        Integer[] arraythree = Arrays.stream(dataone).boxed().toArray(Integer[]::new);
        Integer[] arrayfour = Arrays.stream(dataone).boxed().toArray(Integer[]::new);
        Integer[] arrayfive = Arrays.stream(dataone).boxed().toArray(Integer[]::new);

        Stopwatch Bubblesortsw = new Stopwatch();
        Bubblesort.main(dataone);
        double b1 = Bubblesortsw.elapsedTime();
        Stopwatch Bubblesortsw2 = new Stopwatch();
        Bubblesort.main(datatwo);
        double b2 = Bubblesortsw2.elapsedTime();
        Stopwatch Bubblesortsw3 = new Stopwatch();
        Bubblesort.main(datathree);
        double b3 = Bubblesortsw3.elapsedTime();
        Stopwatch Bubblesortsw4 = new Stopwatch();
        Bubblesort.main(datafour);
        double b4 = Bubblesortsw4.elapsedTime();
        Stopwatch Bubblesortsw5 = new Stopwatch();
        Bubblesort.main(datafive);
        double b5 = Bubblesortsw5.elapsedTime();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        Stopwatch Mergesortsw = new Stopwatch();
        MergeSortTop.sort(arrayone);
        double m1 = Mergesortsw.elapsedTime();
        Stopwatch Mergesortsw2 = new Stopwatch();
        MergeSortTop.sort(arraytwo);
        double m2 = Mergesortsw2.elapsedTime();
        Stopwatch Mergesortsw3 = new Stopwatch();
        MergeSortTop.sort(arraythree);
        double m3 = Mergesortsw3.elapsedTime();
        Stopwatch Mergesortsw4 = new Stopwatch();
        MergeSortTop.sort(arrayfour);
        double m4 = Mergesortsw4.elapsedTime();
        Stopwatch Mergesortsw5 = new Stopwatch();
        MergeSortTop.sort(arrayfive);
        double m5 = Mergesortsw5.elapsedTime();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);

        Stopwatch Quicksortsw = new Stopwatch();
        QuickSort.sort(arrayone);
        double q1 = Quicksortsw.elapsedTime();
        Stopwatch Quicksortsw2 = new Stopwatch();
        QuickSort.sort(arraytwo);
        double q2 = Quicksortsw2.elapsedTime();
        Stopwatch Quicksortsw3 = new Stopwatch();
        QuickSort.sort(arraythree);
        double q3 = Quicksortsw3.elapsedTime();
        Stopwatch Quicksortsw4 = new Stopwatch();
        QuickSort.sort(arrayfour);
        double q4 = Quicksortsw4.elapsedTime();
        Stopwatch Quicksortsw5 = new Stopwatch();
        QuickSort.sort(arrayfive);
        double q5 = Quicksortsw5.elapsedTime();
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(q4);
        System.out.println(q5);

        //int[] data1 = IntStream.generate( () -> new Random().nextInt(10)).limit(10).toArray();
    }
}
