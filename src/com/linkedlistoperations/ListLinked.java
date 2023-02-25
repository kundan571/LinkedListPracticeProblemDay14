package com.linkedlistoperations;

public class ListLinked {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // Append method
    public void append(int data) {
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
    public void insertAt(int data, int pos) {
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
    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty: ");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
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
    public int search(int element){
        int index = 0;
        Node current = head;
        if(head == null){
            System.out.println("List is empty: ");
            return -1;
        }
        while (current != null){
            if (current.data == element){
               return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        ListLinked ll = new ListLinked();
        ll.append(56);
        ll.append(70);
        ll.printList();
        ll.insertAt(30, 1);
        ll.printList();
      //  ll.deleteLast();
        //ll.printList();
       int ans = ll.search(30);
       if (ans == -1){
           System.out.println("element not found in List: ");
       }
       else {
           System.out.println("Element Found at: " + ans);
       }


    }
}
