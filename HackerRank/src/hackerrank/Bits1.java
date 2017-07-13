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
//public class Bits1 {
//    static void findsubarr(int arr[]){
//        int flag=0;
//        int sumtillnow=0;
//        int maxsum=0;
//        int length=arr.length;
//        int arrleft[]=new int[length];
//        int arrright[]=new int[length];
//        for(int i=0;i<length;i++){
//            if(arr[i]==1){
//                arrleft[i]=sumtillnow;
//                sumtillnow++;
//                
//                if(maxsum<sumtillnow)
//                    maxsum=sumtillnow;
//            }
//            if(arr[i]==0 && sumtillnow>0){                
//                arrleft[i]=sumtillnow;
//                sumtillnow=0;
//                flag++;
//            }
//            else if(arr[i]==0){
//                arrleft[i]=sumtillnow;
//            }
//        }
////        System.out.println(sumtillnow+" "+maxsum);
//        sumtillnow=0;
//        for(int i=length-1;i>=0;i--){
//            if(arr[i]==1){
//                arrright[i]=sumtillnow;
//                sumtillnow++;
//                
//                if(maxsum<sumtillnow)
//                    maxsum=sumtillnow;
//            }
//            if(arr[i]==0 && sumtillnow>0){                
//                arrright[i]=sumtillnow;
//                sumtillnow=0;
//                //flag++;
//            }
//            else if(arr[i]==0){
//                arrright[i]=sumtillnow;
//            }
//        }
////        System.out.println(sumtillnow+" "+maxsum);
////        for(int i=0;i<length;i++){
////            System.out.println(i+"  left="+arrleft[i]+"  right="+arrright[i]);
////        }
////        System.out.println("flag="+flag);
//        int sum=0;
//        for(int i=0;i<length;i++){
//            if(arrleft[i]+arrright[i]>sum)
//                sum=arrleft[i]+arrright[i];
//        }
//        if(flag>1)
//            System.out.println(sum+1);
//        else
//            System.out.println(sum);
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
