package org.example;
import java.util.Scanner;


/**
 * static nested class
 * example_1
 */


class ArrayCalc {

    // static nested class
    public static class MinMaxPair {
        private int min;
        private int max;

        public MinMaxPair(int first, int second) {
            this.min = first;
            this.max = second;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
    }

    // find min and max elements
    public static MinMaxPair findMinMax(int[] array) {

        // write your code
        int min = 1000;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if(array[i] < min)  min = array[i];
            if(array[i] > max)  max = array[i];
        }

        return new MinMaxPair(min, max);
    }
}
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input array
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayCalc.MinMaxPair p = ArrayCalc.findMinMax(array);

        System.out.println("min = " + p.getMin());
        System.out.println("max = " + p.getMax());
    }
}

/**
 * static fields
 * example_2
 */

//public class StaticInitOrderExample {
//
//    static int field = 30; // the first assignment
//
//    static {
//        field = 50; // the second assignment
//    }
//}

/**
 * Initialization block
 * example_3
 */

//class ArrayInitExample {
//
//    private int[] array;
//
//    {
//        System.out.println("Before the constructor");
//
//        array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i * i;
//        }
//    }
//
//    public void print() {
//        for (int num : array) {
//            System.out.printf("%d ", num);
//        }
//    }
//}
//
//public class UsingArrayExample {
//    public static void main(String args[]) {
//        ArrayInitExample obj = new ArrayInitExample();
//        obj.print();
//    }
//}

/**
 * Nested_classes_
 * example_4
 */
//
//public class Main {
//    public static void main(String[] args) {
//        // write your code
//        IPhone154.PrototypeIPhone154 prototypeIPhone154 = new IPhone154.PrototypeIPhone154();
//        prototypeIPhone154.printMinCost();
//    }
//}
//
//class IPhone154 {
//
//    static double minCost = initCost();
//
//    static class PrototypeIPhone154 {
//
//        void printMinCost() {
//
//            System.out.println("The min cost of IPhone154 should be: $" + minCost);
//        }
//    }
//
//    private static double initCost() {
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        return scanner.nextDouble();
//    }
//}

/**
 * Nested_classes_
 * example_5
 */
//class Vehicle {
//
//    // vehicle of your dream
//
//    class Engine {
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//    }
//}
//public class EnjoyVehicle {
//    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        Vehicle.Engine engine = vehicle.new Engine();
//        engine.start();
//    }
//}

/**
 * Nested_classes
 * example_6
 */

//class Vehicle {
//
//    private String name;
//
//    // create constructor
//
//    public Vehicle(String name) {
//        this.name = name;
//    }
//
//    class Engine {
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//
//    }
//
//    // create class Body
//    class Body {
//        private String color;
//
//        public Body(String color) {
//            this.color = color;
//        }
//
//        void printColor() {
//            System.out.println("Vehicle " + Vehicle.this.name + " has " + this.color + " body.");
//            //Vehicle Dixi has red body.
//
//        }
//
//    }
//}
//
//class Main {
//
//    public static void main(String[] args) {
//
//        Vehicle vehicle = new Vehicle("Dixi");
//        Vehicle.Body body = vehicle.new Body("red");
//        body.printColor();
//    }
//}

/**
 * Nested_classes
 * example_7
 */
//
//class ChristmasTree {
//
//    private String color;
//
//    public ChristmasTree(String color) {
//        this.color = color;
//    }
//
//    // create method putTreeTopper()
//    void putTreeTopper(String colorTr){
//        ChristmasTree christmasTree = new ChristmasTree(this.color);
//        TreeTopper treeTopper = christmasTree.new TreeTopper(colorTr);
//        treeTopper.sparkle();
//    }
//
//    class TreeTopper {
//
//        private String color;
//
//        public TreeTopper(String color) {
//            this.color = color;
//        }
//
//        // create method sparkle()
//        void sparkle(){
//            //Sparkling silver tree topper looks stunning with green Christmas tree!
//            System.out.println("Sparkling "+this.color+" tree topper looks stunning with "
//                    +ChristmasTree.this.color+" Christmas tree!");
//
//        }
//    }
//}

/**
 * Nested_classes
 * example_8
 */
//
//class Pumpkin {
//
//    private boolean forHalloween;
//
//    public Pumpkin(boolean forHalloween) {
//        this.forHalloween = forHalloween;
//    }
//
//    // create method addCandle()
//    void addCandle(){
//        if (forHalloween == true){
//            Candle candle = new Candle();
//            candle.burning();
//        }
//        else System.out.println("We don't need a candle.");
//    }
//
//    class Candle {
//
//        void burning() {
//            System.out.println("The candle is burning! Boooooo!");
//        }
//    }
//}

