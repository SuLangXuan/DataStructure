package com.lx.datastructure.ds3_linkedlist;

/**
 * 链表的一个节点
 */
public class Node {

    public int no;
    public String name;
    public Node next;

    public Node() {
    }

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", next="  +
                '}';
    }
}
