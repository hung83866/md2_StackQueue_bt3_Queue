package com.company;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int key) {
        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
        } else {
            this.rear.link = temp;
            this.rear = temp;
        }
    }

    public Node deQueue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = this.front.link;
        if (this.front == null) {
            this.front = this.rear = null;
        }
        return temp;
    }
    public void displayQueue(){
        Node temp = front;
        while (temp!=null){
            System.out.println(temp.getData());
            temp = temp.link;
        }
    }

    class Node {
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node link) {
            this.data = data;
            this.link = link;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
