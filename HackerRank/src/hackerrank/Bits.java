///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hackerrank;
//import java.util.*;
///**
// *
// * @author Pallav
// */
//public class Bits {
//    static void findsubarr(int arr[]){
//        int flag=0;
//        int sumtillnow=0;
//        int maxsum=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==1){
//                if(sumtillnow==-1){
//                    sumtillnow=0;
//                    flag=1;
//                }
//                sumtillnow++;
//                if(maxsum<sumtillnow)
//                    maxsum=sumtillnow;
//            }
//            if(arr[i]==0 && sumtillnow>0){                
//                sumtillnow=-1;
//            }
//        }
//        if(flag==1){
//            //System.out.println(maxsum+1);            
//        }
//        else{
//            //System.out.println(maxsum);
//        }
//        
//    }
//    
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=scan.nextInt();
//        }
//        findsubarr(arr);
//    }
//    
//}
