package com.algorithms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public void perm(int[] arr,int p){
        int len=arr.length;
        if(p==len-1) {
            this.arr_tostring(arr);

        }else{ for (int i = p; i < len; i++) {
            this.swap(arr,p,i);
            perm(arr, p + 1);
            this.swap(arr,p,i);
        }}
    }
    public void swap(int[]arr,int i,int j){
        int tmp=0;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void arr_tostring(int[] arr) {
        StringBuffer str5 = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            str5.append(arr[i]);
        }
        System.out.println(str5);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3};
        new DemoApplication().perm(arr,0);
    }
}
