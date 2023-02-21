package com.linkedlistoperations;

import org.w3c.dom.Node;

public class LinkedList {
    Node head;
    class Node{
        String inputNode;
        Node next;
        Node(String inputNode){
            this.inputNode = inputNode;
            this.next = null;
        }

    }
    // Add method
    public void addFirst(String inputNode){
        Node newNode = new Node(inputNode);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("70");
        linkedList.addFirst("30");
        linkedList.addFirst("56");

    }
}
