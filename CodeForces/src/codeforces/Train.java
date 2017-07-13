///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package codeforces;
//
///**
// *
// * @author Pallav
// */
//import java.util.*;
//public class Train {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int t,a,b,i,j,k;
//        t=scan.nextInt();
//        int arrA[]=new int[t];
//        int arrB[]=new int[t];
//        int arrC[]=new int[t];
//        for(i=0;i<t;i++){
//            arrA[i]=scan.nextInt();
//        }
//        for(i=0;i<t;i++){
//            arrB[i]=scan.nextInt();
//        }
//        int count=0;
//        for(i=0;i<t;i++){
//            if(arrA[i]!=arrB[i])
//                count++;
//        }
//        if(count>1){ 
//            int flag=0;
//            for(i=0;i<t;i++){
//                if(arrA[i]!=arrB[i]){
//                    if(flag==0){
//                        arrC[i]=arrB[i];
//                        flag=1;
//                    }    
//                    else{
//                        arrC[i]=arrA[i];
//                    }   
//                }
//                else
//                    arrC[i]=arrA[i];
//            }
//            for(i=0;i<t;i++){
//            System.out.print(arrC[i]+" ");
//            }
//        }
//        else{
//            int check[]=new int[t];
//            int flag=0  ;
//            int flagIndex=0;
//            for(i=0;i<t;i++){
//                check[i]=0;
//            }
//            for(i=0;i<t;i++){
//                check[arrA[i]-1]=1;
//            }
//            for(i=0;i<t;i++){
//                if(check[i]==0)
//                    flag=i+1;
//            }
//            for(i=0;i<t;i++){
//                if(arrA[i]!=arrB[i]){
//                    arrA[i]=flag;
//                    break;
//                }
//            }
//            for(i=0;i<t;i++){
//                System.out.print(arrA[i]+" ");
//            }
//            
//        }
//            
//    }
//}
