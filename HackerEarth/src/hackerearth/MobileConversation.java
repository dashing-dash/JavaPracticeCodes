///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hackerearth;
//
///**
// *
// * @author Pallav
// */
//import java.util.*;
//public class MobileConversation {
//    public static void main(String args[]){
//        Scanner scan =new Scanner(System.in);
//        int n;
//        n=scan.nextInt();
//        
//        int arr[][]=new int[n][2];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<2;j++){
//                arr[i][j]=scan.nextInt();
//            }
//        }
//        java.util.Arrays.sort(arr, (int[] a, int[] b) -> Integer.compare(a[0], b[0]));
//        //System.out.println(Arrays.toString(arr[1]));
//        int diff=0,count=0;
//        int init=0;
//        for(int i=n-1;i>=0;i--){
//            if(init>arr[i][0]){
//                init=init-arr[i][0];
//                init+=arr[i][1];
//            }
//            else{
//                count+=arr[i][0]-init;
//                init=arr[i][1];
//            }
//            //System.out.println("i="+i+" count="+count+"  init="+init);
//        }
//        System.out.println(count);
//        
//    }
//    
//}
