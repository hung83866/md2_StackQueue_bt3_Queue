package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue ints = new Queue();
        ints.enQueue(14);
        ints.enQueue(22);
        ints.enQueue(-6);
        ints.displayQueue();
        System.out.println("--------------------");
        ints.deQueue();
        ints.displayQueue();
        System.out.println("--------------------");
        ints.deQueue();
        ints.displayQueue();
        System.out.println("--------------------");
        ints.enQueue(9);
        ints.enQueue(20);
        ints.displayQueue();
    }
}
