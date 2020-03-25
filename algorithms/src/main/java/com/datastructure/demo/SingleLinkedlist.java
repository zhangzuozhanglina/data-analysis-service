package com.datastructure.demo;

import lombok.Data;

import java.util.Scanner;

public class SingleLinkedlist {
    public static void main(String[] args) {
        SingleList list=new SingleList();
        NameNode headNode=list.InitHeadNode();
//        System.out.println("输入插入的节点");
//         Scanner scanner1=new Scanner(System.in);
//           Object name=scanner1.nextInt();
           NameNode node=new NameNode(2);
           headNode.setNext(node);
           node.setNext(new NameNode(1));
//         NameNode insertNode=new NameNode(name);
//        System.out.println("输入要插入的节点位置");
//         Scanner scanner2=new Scanner(System.in);
//         int position=scanner2.nextInt();
          list.insertToNode(headNode,new NameNode(4),3);
        list.insertToNode(headNode,new NameNode(3),3);
        list.showLinkedList(headNode);
        list.length(headNode);
        System.out.println("输入要删除的节点位置");
        Scanner scanner3=new Scanner(System.in);
        int position1=scanner3.nextInt();
        list.deleteFromNode(headNode,position1);
          list.showLinkedList(headNode);
          list.length(headNode);
          list.reserveLinkList(headNode);
        list.showLinkedList(headNode);
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
    public NameNode deleteFromNode(NameNode headNode,int position){

        if(position<1||position>length(headNode)){
            System.out.println("非法节点删除");
        }else{
            int count=1;
            NameNode pre=headNode;
            System.out.printf("count<position=%d<%d",count,position);
            while (count < position){
                pre=pre.getNext();
                System.out.println(pre);
                count++;
            }
            NameNode current =pre.getNext();
            System.out.println(current);
            pre.setNext(current.getNext());
            current=null;
        }
        return headNode;
    }

    //单链表反转
    public NameNode reserveLinkList(NameNode headNode){
        NameNode tmp=headNode;
        SingleList singleList=new SingleList();
        NameNode headNode2=singleList.InitHeadNode();
        NameNode tmp1;
        while (tmp.getNext()!=null){
                //取出tmp.next,并shan掉
                tmp1=new NameNode(tmp.getNext().getName());
                if(headNode2.getNext()!=null){
                    tmp1.setNext(headNode2.getNext());
                    headNode2.setNext(tmp1);
                }else {
                    headNode2.setNext(tmp1);
                }
                tmp=tmp.getNext();
            }

        headNode.setNext(headNode2.getNext());
        headNode2=null;
         return headNode;
    }

}


