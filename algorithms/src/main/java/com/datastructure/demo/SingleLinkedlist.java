package com.datastructure.demo;

import lombok.Data;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SingleLinkedlist {
    public static void main(String[] args) {
        SingleList list=new SingleList();
        NameNode headNode=list.InitHeadNode();
        System.out.println("输入插入的节点");
         Scanner scanner1=new Scanner(System.in);
           Object name=scanner1.nextInt();
           NameNode node=new NameNode(2);
           headNode.setNext(node);
           node.setNext(new NameNode(1));
         NameNode insertNode=new NameNode(name);
        System.out.println("输入要插入的节点位置");
         Scanner scanner2=new Scanner(System.in);
         int position=scanner2.nextInt();
          list.insertToNode(headNode,insertNode,position);
          list.showLinkedList(headNode);
          list.length(headNode);
    }
    //
}
@Data
class NameNode<E> {
    public E name;
    public NameNode next;

    public NameNode(E name) {
        this.name = name;
    }
}
class SingleList{

    public NameNode InitHeadNode() {
        NameNode headNode = new NameNode("");
        return headNode;
    }

     public void showLinkedList(NameNode headNode){
         int size = 0;
         String str="";
         NameNode currentNode = headNode;
         while (currentNode.next != null) {
             currentNode = currentNode.next;
             str=str+currentNode.getName()+"------>";
             size++;
         }
         System.out.println(str);

     }
    public int length(NameNode headNode) {
        int size = 0;
        NameNode currentNode = headNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    public NameNode insertToNode(NameNode headNode, NameNode insertNode, int position) {
        if (headNode.next == null) {
            headNode.setNext(insertNode);
            return headNode;
        }
        if (position < 1 || position > length(headNode) + 1) {
            System.out.println("非法插入的位置");
            return headNode;
        } else {
            NameNode preNode = headNode;
            int count = 0;
            while (count < position - 1) {
                preNode = preNode.getNext();
                count++;
            }
            NameNode currentNode = preNode.getNext();
            insertNode.setNext(currentNode);
            preNode.setNext(insertNode);

        }
        return headNode;
    }
}


