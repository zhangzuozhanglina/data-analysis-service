package com.datastructure.demo;

import java.util.Scanner;

public class CircleQueueArray {
    public static void main(String[] args) {
        CircleQueue queue=new CircleQueue(5);
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
                    int data =queue.headQueue();
                    System.out.println(data);
                    break;
                default:
                    loop=false;
                    return;
            }
        }

    }
}
class CircleQueue{
    private  int rear;  //定义尾结点
    private int front;//定义头节点
    private int maxSize; //定义大小
    private int[] array;
    //初始化队列
    public  CircleQueue(int arrMaxSize){
        maxSize=arrMaxSize;
        array=new int[maxSize];
        rear=0;
        front=0;
    }
    //判断队列是否为满
    public boolean isFull(){
        return (rear+1)%maxSize==front;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return rear==front;

    }
    //在队列里插入元素
    public void setData(int data){
        if(isFull()){
            throw new RuntimeException("队列已满，无法添加");
        }
        array[rear]=data;
        rear=(rear+1)%maxSize;
    }
    //在队列取元素
    public int  getData(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，无数据");
        }
        int data=array[front];
        front=(front+1)%maxSize;
        return data;
    }
    //显示头元素
    public int headQueue(){
        return array[front];
    }
    //打印队列
    public void showQueue(){
        for (int i = front; i < front+size(); i++) {
            System.out.printf("a[%d]=%d\n",i%maxSize,array[i%maxSize]);
        }
    }
    public int size(){
        int size=(rear-front+maxSize)%maxSize;
        return size;
    }
}
