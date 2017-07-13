///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hackerrank;
//
///**
// *
// * @author Pallav
// */
//import java.util.*;
//public class HackerWithTeam {
//    static void calc(long arr[],int l,int r,int k){
//        long length=arr.length;
//        long sum=0;
//        int leftmost=0;        
//        //System.out.println(Arrays.toString(arr));
//        if(l-k<=0){
//            leftmost=0;
//            for(int i=0;i<l;i++){
//                sum+=arr[i];
//            }
//            //System.out.println("first sum="+sum);
//        }else{
//            leftmost=l-k-1;
//            for(int i=leftmost;i<l;i++){
//                sum+=arr[i];
//            }
//            //System.out.println("first sum="+sum);
//        }
//        for(int i=l;i<r;i++){
//            if(i-k<=0){
//                sum*=2;
//                sum+=arr[i];
//                //System.out.println("sum"+i+"= "+sum);
////                sum+=sum+arr[i];
//            }
//            else{
//                sum*=2;
//                sum+=arr[i];
//                sum-=arr[leftmost];
//                //System.out.println("sum"+i+"= "+sum);
//                leftmost++;                
//            }
//        }
//        System.out.println(sum);
//        
//    }
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int size=scan.nextInt();
//        long q=scan.nextInt();
//        int flag=0,l=0,r=0,k=0;
//        long arr[]=new long[size];
//        for(int i=0;i<size;i++){
//            arr[i]=scan.nextLong();
//        }
//        
//        for(long i=0;i<q;i++){
//            flag=scan.nextInt();
//            if(flag==1){
//                l=scan.nextInt();
//                r=scan.nextInt();
//                k=scan.nextInt();
//                //System.out.println(Arrays.toString(arr)+" "+l+" "+r+" "+k );
//                calc(arr, l, r, k);
//            }
//            else{
//                int pos=scan.nextInt();
//                long val=scan.nextInt();
//                arr[pos-1]=val;
//            }
//        }
//        
//    }
//}
