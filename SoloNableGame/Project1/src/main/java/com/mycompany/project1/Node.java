package com.mycompany.project1;

public class Node<T> {
    T data;
    Node <T> nextNode;
    Node <T> child;
    

    public Node(T data) {
        this.data = data;
        nextNode = null;
        child = null;
    }

}
