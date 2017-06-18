///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package javaapplication3;
//
//import java.util.*;
//
///**
// *
// * @author Pallav
// */
//public class Cloning {
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int t,test,i,j,n,q,a,b,c,d,count,flag;
//        t=scan.nextInt();
//        int arr[];
//        int sub1[],sub2[];
//        for(test=0;test<t;test++){
//            n=scan.nextInt();
//            q=scan.nextInt();
//            arr=new int[n];
//            for(i=0;i<n;i++){
//                arr[i]=scan.nextInt();
//            }
//            for(i=0;i<q;i++){
//                flag=1;
//                a=scan.nextInt();
//                b=scan.nextInt();
//                c=scan.nextInt();
//                d=scan.nextInt();
//                if((b-a)!=(d-c) || a>b || c>d || a>n || b>n || c>n || d>n){
//                    System.out.println("NO");
//                    continue;
//                }else{
//                    sub1=new int[(b-a+1)];
//                    sub2=new int[(d-c+1)];
//                    int v=0;
//                    for(j=a-1;j<b;j++){
//                        sub1[v]=arr[j];
//                        v++;
//                    }
//                    v=0;
//                    for(j=c-1;j<d;j++){
//                        sub2[v]=arr[j];
//                        v++;
//                    }
//                    
//                    Arrays.sort(sub1);
//                    Arrays.sort(sub2);
//
//                    count=0;
//                    for(j=0;j<(b-a+1);j++){
//                        if(sub1[j]!=sub2[j])
//                            count++;
//                        if(count>1){
//                            flag=0;
//                            break;
//                        }
//                    }
//               }
//                if(flag==0)
//                    System.out.println("NO");
//                else
//                    System.out.println("YES"); 
//                
//            }
//        }
//    }
//}
