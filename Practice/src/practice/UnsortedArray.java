///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package practice;
//import java.util.*;
///**
// *
// * @author Pallav
// */
//public class UnsortedArray {
//    static void calc(int arr[],int size){
//        int i,j,maxTillNow;
//        maxTillNow=-999;
//        int flag1=0;
//        for(i=1;i<size-1;i++){            
//            if(arr[i-1]>=maxTillNow)
//                maxTillNow=arr[i-1];
//            if(arr[i]>maxTillNow){
//                int flag=1;
//                for(j=i+1;j<size;j++){
//                    if(arr[j]<arr[i]){
//                        flag=0;
//                        break;
//                    }
//                    if(j==size-1 && arr[j]>arr[i]) //for the constraint to print -1 if no number found
//                        flag1=1;
//                }
//                if(flag==1){
//                    System.out.println(arr[i]);
//                    break;
//                }
//            }                            
//        }
//        if(flag1==0)
//            System.out.println("-1");
//            
//    }
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int t=scan.nextInt();
//        int size;
//        int arr[];
//        for(int i=0;i<t;i++){
//            size=scan.nextInt();
//            arr=new int[size];
//            for(int j=0;j<size;j++){
//                arr[j]=scan.nextInt();
//            }
//            calc(arr,size);
//        }
//    }
//}
