package com.datastructure.demo;

import java.util.Scanner;

public class QueueArray {
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        char k;
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;

        while (loop){
            k=scanner.next().charAt(0);
            switch (k){
                case 'a':
                    queue.showQueue();
                    break;
                case 'b':
                    try {
                        Scanner scanner1=new Scanner(System.in);
                        int data=scanner.nextInt();
                        queue.setData(data);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'c':
                    try {
                        int data=queue.getData();
                        System.out.printf("%d\n",data);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 'd':
                    queue.headQueue();
                    break;
                default:
                    loop=false;
                    return;
            }
        }

    }
}
class Queue{
    private  int rear;  //定义尾结点
    private int front;
    private int maxSize;
    private int[] array;
    //初始化队列
     public  Queue(int arrMaxSize){
        maxSize=arrMaxSize;
        array=new int[maxSize];
        rear=-1;
        front=-1;
    }
    //判断队列是否为满
    public boolean isFull(){
        return rear==maxSize-1;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return rear==front;

    }
    //在队列里插入元素
    public void setData(int data){
        if(isFull()){
            throw new RuntimeException("队列已满，无数据");
        }
        rear++;
        array[rear]=data;
    }
    //在队列取元素
     public int  getData(){
            if(isEmpty()){
                throw new RuntimeException("队列为空，无数据");
            }
            front++;
            int data=array[front];
            return data;
     }
 //显示头元素
    public int headQueue(){
        return array[front+1];
    }
    //打印队列
    public void showQueue(){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d]=%d\n",i,array[i]);
        }
    }
}
