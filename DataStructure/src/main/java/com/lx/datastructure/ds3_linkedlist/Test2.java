package com.lx.datastructure.ds3_linkedlist;

import java.util.Stack;

/**
 * 合并两个有序的单链表，合并之后的链表依然有序【课后练习.】
 */
public class Test2 {

    public static void main(String[] args) {
        //todo 创建两个有序的单链表

        SingleLinkedList linkedList1 = new SingleLinkedList();
        SingleLinkedList linkedList2 = new SingleLinkedList();
        SingleLinkedList linkedList3 = new SingleLinkedList();

        linkedList1.addByOrder(new Node(1,"su"));
        linkedList1.addByOrder(new Node(5,"lang"));
        linkedList1.addByOrder(new Node(9,"xuan"));

        linkedList2.addByOrder(new Node(2,"aa"));
        linkedList2.addByOrder(new Node(4,"bb"));
        linkedList2.addByOrder(new Node(7,"cc"));


        Node newHead = new Node();
        Stack<Node> stack = new Stack<Node>();

        Node temp1 = linkedList1.head.next;

        while (true){
            if (temp1 == null) break;
            System.out.println(temp1);
//            linkedList3.addByOrder(temp1);
            stack.add(temp1);



            temp1 = temp1.next;
        }

        System.out.println("=============");
        Node temp2 = linkedList2.head.next;

        while (true){
            if (temp2 == null) break;
            System.out.println(temp2);
            stack.add(temp2);
            temp2 = temp2.next;
        }


        System.out.println("=-============");

        while (stack.size()>0){
//            System.out.println(stack.pop());
            linkedList3.addByOrder(stack.pop());
        }
        linkedList3.list();
    }

}
