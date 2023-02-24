package com.linkedlistoperations;

public class ListLinked {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    // Append method
    public void append(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    // Insert at any position
    public void insertAt(String data, int pos) {
        Node insertNode = new Node(data);
        // if list is empty
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node previousNode = head;
        for (int i = 0; i < pos - 1; i++) {
            previousNode = previousNode.next;
        }
        insertNode.next = previousNode.next;
        previousNode.next = insertNode;

    }
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty: ");
            return;
        }
        else {
            Node temp = head;
            head = head.next;
            return;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListLinked ll = new ListLinked();
        ll.append("56");
        ll.append("70");
        ll.printList();
        ll.insertAt("30", 1);
        ll.printList();
        ll.deleteFirst();
        ll.printList();

    }
}
