package com.lx.datastructure.ds3_linkedlist;

/**
 * 这是一个单向链表的实现
 */
public class SingleLinkedList {

    public Node head;

    public SingleLinkedList() {
        //先创建一个头节点
        this.head = new Node();
    }

    // todo 获取链表中的个数

    /**
     * 求链表中的有效个数
     */
    public int length(){
        Node temp = head;
        if (head.next == null) return 0;
        int length = 0;
        while (true){
            if (temp.next == null)break;
            if (temp.next != null) length++;
            temp = temp.next;
        }
        return length;
    }


    // todo 查找单链表中的倒数第k个结点 【新浪面试题】
    public Node getNode(int index){
        //判断如果链表为空，返回null
        if(head.next == null) {
            return null;//没有找到
        }
        int length = length();
        if(index <=0 || index > length) {
            return null;
        }
        Node temp = head.next;
        for (int i = 0; i<length-index;i++){
            temp = temp.next;
        }
        return temp;
    }

    //todo 单链表的反转【腾讯面试题，有点难度】

    /**
     * 单链表的反转
     */
    public void reserveLinkedList(){
        //1.如果链表为空并且链表数量为1，直接返回
        if (head.next == null || head.next.next == null){
            return;
        }

        //当前节点
        Node cur = head.next;
        //当前节点的下一个节点
        Node next = null;
        //新链表的头
        Node newHead = new Node();
        while (cur != null){
            next = cur.next;
            cur.next = newHead.next;
            newHead.next = cur;
            cur = next;
        }
        head.next = newHead.next;
    }


//    todo 增加

    /**
     * 向单向链表的最后添加一个节点
     */
    public void add(Node node){
        Node temp = head;
        //todo: 找到最后一个节点
        while (true){
            if (temp.next == null) break;
            temp = temp.next;
        }
        temp.next = node;
    }

    /**
     * 向单向链表中根据编号大小添加一个节点
     */
    public void addByOrder(Node node){
        Node temp = head;
        boolean flag = false; //todo 标识链表中是否已经存在对应的节点
        //todo 按编号顺序添加节点
        while (true){
            //todo 已经是最后一个节点了返回没有找到
            if (temp.next == null) break;
            if (node.no<temp.next.no) break;
            if (node.no == temp.next.no){//todo 对应编号的节点已经存在
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag){
            System.out.printf("准备插入的英雄的编号 %d 已经存在了, 不能加入\n", node.no);
        }else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    // todo 删除

    /**
     * 删除单向链表中的一个节点
     */
    public void delete(int no){

        Node temp = head;
        boolean flag = false; //todo 标识链表中是否已经存在对应的节点
        while (true){
            //todo 已经是最后一个节点了返回没有找到
            if (temp.next == null) break;
            if (temp.next.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag){
            temp.next = temp.next.next;
        }else {
            System.out.printf("准备删除的英雄的编号 %d 不存在, 不能删除\n", no);
        }

    }


    // todo 修改
    public void update(Node node){
        Node temp = head;
        boolean flag = false; //todo 标识链表中是否已经存在对应的节点
        while (true){
            //todo 已经是最后一个节点了返回没有找到
            if (temp.next == null) break;
            if (temp.next.no == node.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag){
            temp.next = node;
            node.next = temp.next.next;
        }else {
            System.out.printf("准备修改的英雄的编号 %d 不存在, 不能修改\n", node.no);
        }
    }


    // todo 查询




    /**
     * 遍历单向链表中的全部节点
     */
    public void list(){
        if (head.next == null){
            System.out.println("当前链表为空");
            return;
        }
        Node temp = head;
        while (true){
            if (temp.next == null) break;
            temp = temp.next;
            System.out.println(temp);
        }

    }

}


