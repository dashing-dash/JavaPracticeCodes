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
//public class KadaneMaxSumSubArray {
//    static int calc(int arr[],int size){
//        int maxSoFar=0,maxEndingHere=0;
//        for(int i=0;i<size;i++){
//            maxEndingHere+=arr[i];
//            if(maxEndingHere<0)
//                maxEndingHere=0;
//            if(maxSoFar<maxEndingHere)
//                maxSoFar=maxEndingHere;
//            System.out.print("maxEndingHere="+maxEndingHere+"  maxSoFar="+maxSoFar);
//            System.out.println();
//        }
//        return maxSoFar;
//    }
//    
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
//            System.out.println("arr="+Arrays.toString(arr));
//            int total=calc(arr,size);
//            System.out.println("total="+total);
//        }
//    }
//    
//}
