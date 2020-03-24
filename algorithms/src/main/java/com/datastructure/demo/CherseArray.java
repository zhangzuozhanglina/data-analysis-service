package com.datastructure.demo;

import java.io.*;
import java.util.ArrayList;

public class CherseArray {
    /**
     * 1.二维数组转稀疏数组，并将稀疏数组存储为文件
     * 2.读取文件中的稀疏数组，再将其转成二维数组
     */

    //p为行数，q为列数
    public int[][] createArray(int p,int q){
        int arr[][]=new int[p][q];
//        arr[1][2]=1;
//        arr[2][3]=2;
        //打印二维数组
        return arr;
    }
    //打印二维数组
    public void printArray(int [][] arr){
        for (int [] row:arr
        ) {
            for (int data:row
            ) {
                System.out.printf("%d\t",data);
            }
            System.out.printf("\n");
        }
        System.out.printf("*************************************\n");

    }
//二维数组转稀疏数组
    public int[][] ArrayToCherse(int [][]arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] != 0) {
                    sum++;
                }
            }
            }
        int[][] cherseArr=this.createArray(sum+1,3);
        //将棋盘转成稀疏数组
        cherseArr[0][0]=arr.length;
        cherseArr[0][1]=arr[1].length;
        cherseArr[0][2]=sum;
        //定义一个计数器count
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] != 0) {
                    count++;
                    cherseArr[count][0] = i;
                    cherseArr[count][1] = j;
                    cherseArr[count][2] = arr[i][j];
                }
            }
        }
        return cherseArr;
    }

    //将二维数组写入文件
    public void writeToFile(String path,int[][]arr) throws IOException {
        File  file= new File(path);
        //创建一个文件写入流
        FileWriter writer = new FileWriter(file);
        for (int chearr[]:arr
        ) {
            for (int data:chearr
            ) {
                writer.write(data+"\t");
            }
            writer.write("\n");
        }
        writer.close();
    }
    //从文件读取并存入二维数组
    public int[][] readFromFile(String path) throws IOException {
        File file=new File("F:\\map.dat");
        FileReader reader =new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(reader);
        String line=null;
        ArrayList<String[]> arrayList=new ArrayList();
        int count=0;
        int q=0;
        //求将转化的二维数组的行和列
        while ((line = bufferedReader.readLine())!=null){
            String[] tmp=line.split("\t");
            arrayList.add(tmp);
            count++;
            q=tmp.length;
        }
        int[][] chearr2=new int[count][q];
        count=0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).length; j++) {
                chearr2[count][j] = Integer.parseInt(arrayList.get(i)[j]);
                //System.out.println(chearr2[count][i]+"====="+count);
            }
            count++;
        }

        bufferedReader.close();
        return chearr2;
    }
    public int[][] cherseToArray(int[][] cherseArr){
        int p=cherseArr[0][0];
        int q=cherseArr[0][1];
        int[][]arr=new int[p][q];
        for (int i = 1; i <cherseArr.length ; i++) {
            for (int j = 1; j <cherseArr[i].length ; j++) {
                arr[cherseArr[i][0]][cherseArr[i][1]]=cherseArr[i][2];
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        CherseArray cherseArray=new CherseArray();
        int[][] array=cherseArray.createArray(11,11);
        array[1][2]=1;
        array[2][3]=2;
        //打印二维数组
        cherseArray.printArray(array);
        //转成稀疏数组
        int[][]cherse=cherseArray.ArrayToCherse(array);
        cherseArray.printArray(cherse);
        //存入文件
        //cherseArray.writeToFile("E:\\\\map.dat",cherse);
        int[][] cherse2=cherseArray.readFromFile("E:\\\\map.dat");
        cherseArray.printArray(cherse2);
        //将稀疏数组转成二维数组
        int [][] array2=cherseArray.cherseToArray(cherse2);
        cherseArray.printArray(array2);

    }
}
