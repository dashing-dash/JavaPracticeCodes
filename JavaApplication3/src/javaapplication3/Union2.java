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
//public class Union2 {
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int t,test,i,j;
//        t=scan.nextInt();
//        for(test=0;test<t;test++){
//            int n=scan.nextInt();
//            int k=scan.nextInt();
//            int arr[][]=new int[n][k];
//            for(i=0;i<n;i++){
//                for(j=0;j<k;j++){
//                    arr[i][j]=400;
//                }
//            }
//            for(i=0;i<n;i++){
//                int num=scan.nextInt();
//                for(j=0;j<num;j++){
//                    arr[i][j]=scan.nextInt();
//                }
//            }
//            int total=0;
//            total=checkUnion(arr,n,k);
//            System.out.println(total);
//        }
//    }
//
//    private static int checkUnion(int[][] arr, int n, int k) {
//       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//       int total=0;
//       int i,j;
//       for(i=0;i<n;i++){
//           for(j=i+1;j<n;j++){
//               int a=0,b=0,c=0,flag=1;
//               Arrays.sort(arr[i]);
//               Arrays.sort(arr[j]);
//               while(a<k && b<k && c<k){
//                    if(arr[j][b]==arr[i][a]){
//                        if(arr[j][b]==c+1){
//                           c++;
//                           a++;
//                           b++;
//                           //continue;
//                        }
//                        else{
//                           flag=0;
//                           break;
//                        }
//                    }
//                    else if(arr[i][a]<arr[j][b] || arr[j][b]==400){
//                        if(arr[i][a]==400){
//                            if(arr[j][b]==c+1){
//                                c++;
//                                b++;
//                            }
//                            else{
//                                flag=0;
//                                break;
//                            }
//                        }
//                        else if(arr[i][a]==c+1){
//                           c++;
//                           a++;
//                           //continue;
//                        }
//                        else{
//                           flag=0;
//                           break;
//                        }
//                    }
//                   else if(arr[j][b]<arr[i][a] || arr[i][a]==400){
//                        if(arr[j][b]==400){
//                            if(arr[i][a]==c+1){
//                                c++;
//                                a++;
//                            }
//                            else{
//                                flag=0;
//                                break;
//                            }
//                        }
//                        if(arr[j][b]==c+1){
//                           c++;
//                           b++;
//                           //continue;
//                        }
//                        else{
//                           flag=0;
//                           break;
//                        }
//                    }
//                   
//               }
//               if(flag==1){
//                   total++;
////                   int x,y;
////                   for(x=0;x<k;x++){
////                       System.out.print(arr[i][x]+" ");
////                   }
////                   System.out.println("");
////                   for(x=0;x<k;x++){
////                       System.out.print(arr[j][x]+" ");
////                   }
////                   System.out.println("\n");
//               }
//                   
//           }
//       }
//       
//       return total;
//    }
//}
