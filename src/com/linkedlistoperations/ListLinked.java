package com.linkedlistoperations;

public class ListLinked {
    Node head;
   public class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }

    }
    // Add method
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        ListLinked ll = new ListLinked();
        ll.addFirst("70");
        ll.addFirst("30");
        ll.addFirst("56");
        ll.printList();

    }
}
