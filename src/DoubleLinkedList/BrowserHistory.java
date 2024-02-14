package DoubleLinkedList;

import java.util.Objects;

public class BrowserHistory {

    class Node{
        String webPage;
        Node next;
        Node previous;

        public Node(String webPage) {
            this.webPage = webPage;
        }
    }

    Node head = new Node("NULL");
    Node tail = new Node("NULL");
    Node current;

    public BrowserHistory(String homepage) {
        Node current = new Node(homepage);

        head.next = current;
        current.previous = head;

        current.next = tail;
        tail.previous = current;
    }

    public void visit(String url) {
        Node newNode = new Node(url);

        if (current == null) {
            Node previous = tail.previous;

            previous.next = newNode;
            newNode.previous = previous;

            newNode.next = tail;
            tail.previous = newNode;
        }else {
            current.next = newNode;
            tail.previous = newNode;
            newNode.next = tail;
            newNode.previous = current;
        }

        current = null;
    }

    public String back(int steps) {
        if (current == null)
            current = tail.previous;
        while (steps > 0 && current.previous != null && !Objects.equals(current.previous.webPage, "NULL")){
            current = current.previous;
            steps--;
        }
        return current.webPage;
    }

    public String forward(int steps) {

        if (current == null)
            return tail.previous.webPage;

        while (steps > 0 && current.next != null &&!Objects.equals(current.next.webPage, "NULL")){
            current = current.next;
            steps--;
        }
        return current.webPage;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

