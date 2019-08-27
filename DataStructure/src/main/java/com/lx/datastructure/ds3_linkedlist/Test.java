package com.lx.datastructure.ds3_linkedlist;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
//        linkedList.add(new Node(1,"su"));
//        linkedList.add(new Node(2,"lang"));
//        linkedList.add(new Node(3,"xuan"));

        linkedList.addByOrder(new Node(2,"lang"));
        linkedList.addByOrder(new Node(3,"xuan"));
        linkedList.addByOrder(new Node(1,"su"));

//        linkedList.list();
//        linkedList.delete(4);
//        linkedList.delete(3);

        linkedList.update(new Node(3,"haha"));

        linkedList.list();

        System.out.println(linkedList.length());
//        System.out.println(linkedList.getNode(3));
        System.out.println("开始反转");
        linkedList.reserveLinkedList();
        linkedList.list();
        System.out.println("反序打印");
        linkedList.reversePrint();

    }
}
