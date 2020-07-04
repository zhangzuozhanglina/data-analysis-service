package com.datastructure.demo;

import lombok.Data;

public class doubleLinkedList {
    public static void main(String[] args) {
        DoubleList doubleList=new DoubleList();
        DoubleNameNode HeadNode=doubleList.InitHeadNode();
        DoubleNameNode node=new DoubleNameNode(1);
        DoubleNameNode node1=new DoubleNameNode(2);
        DoubleNameNode node2=new DoubleNameNode(3);
        doubleList.insertToNode(HeadNode,node,1);
        doubleList.showLinkedList(HeadNode);
        doubleList.insertToNode(HeadNode,node1,2);
        doubleList.insertToNode(HeadNode,node2,2);
        doubleList.showLinkedList(HeadNode);
        doubleList.deleteFromNode(HeadNode,2);
        doubleList.showLinkedList(HeadNode);
    }

}

@Data
class DoubleNameNode<E> {
    public E name;
    public DoubleNameNode next;
    public DoubleNameNode pre;

    public DoubleNameNode(E name) {
        this.name = name;
    }

}
class DoubleList{

    public DoubleNameNode InitHeadNode() {
        DoubleNameNode headNode = new DoubleNameNode("");
        return headNode;
    }

    public void showLinkedList(DoubleNameNode headNode){
        String str="";
        DoubleNameNode currentNode = headNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            str=str+currentNode.getName()+"------>";
        }
        System.out.println(str);

    }
    public int length(DoubleNameNode headNode) {
        int size = 0;
        DoubleNameNode currentNode = headNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    public DoubleNameNode  insertToNode(DoubleNameNode  headNode, DoubleNameNode insertNode, int position) {
        if (position < 1 || position > length(headNode) + 1) {
            System.out.println("非法插入的位置");
            return headNode;
        } else {
            DoubleNameNode  pre = headNode;
            int count = 0;
            while (count < position-1) {
                pre = pre.getNext();
                count++;
            }
            DoubleNameNode currentNode=pre.getNext();
            insertNode.setNext(currentNode);
            if(currentNode!=null)
                currentNode.setPre(insertNode);
            pre.setNext(insertNode);
            insertNode.setPre(pre);
        }
        return headNode;
    }
    public DoubleNameNode  deleteFromNode(DoubleNameNode  headNode,int position){

        if(position<1||position>length(headNode)){
            System.out.println("非法节点删除");
        }else{
            int count=0;
            DoubleNameNode  pre=headNode;
            System.out.printf("count<position=%d<%d",count,position);
            while (count < position){
                pre=pre.getNext();
                count++;
            }
            pre.getPre().setNext(pre.getNext());
            pre.getNext().setPre(pre.getPre());
        }
        return headNode;
    }

}



