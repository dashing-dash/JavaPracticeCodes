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
//public class SumOfFour {
//    static void calc(int arr[],int size,int value){
//        int i,j,l,r,flag=0;
//        for(i=0;i<size-3;i++){
//                for(j=i+1;j<size-2;j++){
//                    l=j+1;
//                    r=size-1;
//                    while(l<r){
//                        if(arr[i]+arr[j]+arr[l]+arr[r]==value){
//                            System.out.println("1");
//                            flag=1;
//                            return;
//                        }
//                        else if(arr[i]+arr[j]+arr[l]+arr[r]<value)
//                            l++;
//                        else
//                            r--;
//                    }
//                }
//            }
//        if(flag==0)
//            System.out.println("0");
//    }
//    public static void main(String args[]){
//        int t,i,j,k,l,r,n,size,value;
//        int arr[];
//        Scanner scan=new Scanner(System.in);
//        t=scan.nextInt();
//        for(k=0;k<t;k++){
//            size=scan.nextInt();
//            arr=new int[size];
//            for(n=0;n<size;n++){
//                arr[n]=scan.nextInt();
//            }
//            value=scan.nextInt();
//            Arrays.sort(arr);
//            calc(arr,size,value);
//        }
//    }
//}
