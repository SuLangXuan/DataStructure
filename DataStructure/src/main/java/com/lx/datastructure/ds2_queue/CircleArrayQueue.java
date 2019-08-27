package com.lx.datastructure.ds2_queue;

/**
 * 这是一个利用数组是实现的环形队列
 *
 *  队列特点： 先进先出
 *
 *  默认给该队列的最后一位预留，
 *  maxsize： 表示该队列的最大存储
 *  start:  表示指向该环形队列的第一个数据  初始值为0
 *  end :  指向该环形队列的最后一个数据（预留的前一个数据） 初始值为0
 *
 */

public class CircleArrayQueue {
    private int start;
    private int end;
    private int maxsize;
    private int arr[];

    public CircleArrayQueue(int maxsize) {
        this.maxsize = maxsize+1;
        arr = new int[this.maxsize];
    }

    /**
     * 判断当前队列是否满了
     */
    public boolean isFull(){
        return (end+1) % maxsize == start;
    }

    /**
     * 判断当前队列是否为空
     */
    public boolean isEmpty(){
        return start == end;
    }

    /**
     * 向队列添加数据
     */
    public void addData(int num){
        if (isFull()){
            System.out.println("队列已经满了");
            return;
        }
        arr[end]=num;
        end = (end + 1) % maxsize;
        System.out.println();
    }

    /**
     * 求当前队列的有效数据
     */
    public int getQueueSize(){
        return (end + maxsize - start) % maxsize;
    }

    /**
     * 展示队列数据
     */
    public void showQueue(){
        if (isEmpty()) {
            System.out.println("队列空的，没有数据~~");
            return;
        }
        System.out.println("队列数据如下:");
        for (int i = start; i < start+getQueueSize(); i++) {
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }

    /**
     * 从队列中获取数据
     */
    public int getQueueData(){
        if (isEmpty()){
//            end = 0;
//            start = 0;
            throw new RuntimeException("队列为空，不能获取数据");
        }
        int num = arr[start];
        start = (start+1) % maxsize;
        System.out.println();
        return num;
    }




}
