package com.demo.ms.dsa;

import java.util.Stack;

class LinkedListNode {
    int value;
    LinkedListNode next;

    LinkedListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class ReverseLinkedListStack {
    static LinkedListNode head = null;

    public void push(int value) {
        LinkedListNode newLinkedListNode = new LinkedListNode(value);
        newLinkedListNode.next = head;
        head = newLinkedListNode;
    }

    static void reverseList() {
        Stack<LinkedListNode> stack = new Stack<>();
        LinkedListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        if (!stack.isEmpty()) {
            head = stack.pop();
            temp = head;
        }

        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;

    }

    public void printList() {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedListStack list = new ReverseLinkedListStack();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.printList();
        reverseList();
        list.printList();
    }
}
