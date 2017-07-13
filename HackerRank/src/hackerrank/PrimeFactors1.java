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
//public class PrimeFactors1 {
//static ArrayList calcPrime(long q,int flag1){
////        int length=arr.length;
//        ArrayList<Long> factors=new ArrayList<>();
//        long i=2;
//        while(q%2==0){
//            q/=2;
//            factors.add(i);
//        }
//        for(i=3;i<=Math.sqrt(q);i++){
//            while(q%i==0){
//                q/=i;
//                factors.add(i);
//            }
//        }
//        if(q>2){
//            factors.add(q);
//        }
//        return factors;
//            
//    }
//    
//    static void calc(long arr[],long q){
//        int length=arr.length;
//        long temp=q;
//        int flag=0;
//        int flag1;
//        if(q<=3){
//            System.out.println("NO");
//            return;
//        }
//        ArrayList<Long> factors=new ArrayList<>();
//        for(int i=0;i<length;i++){
//            temp=q;
//            flag1=0;
//            if(arr[i]==0)
//            continue;
//            while(temp%arr[i]==0){
//                temp/=arr[i];
//                flag1++;//to check temp devided arr[i]
//            }
//            factors=calcPrime(temp,flag1);
//            if(flag==1){
//                System.out.println("YES");
//                break;
//            }
//        }
//        if(flag==0){
//            System.out.println("NO");
//        }
//    }
//    
//    public static void main(String args[]) throws Exception{
//        
//            Scanner scan=new Scanner(System.in);
//            int n;
//            long q;
//            n=scan.nextInt();
//            q=scan.nextInt();
//            long arr[]=new long[n];
//            for(int i=0;i<n;i++){
//                arr[i]=scan.nextLong();
//            }
//            long query;
//            for(long i=0;i<q;i++){
//                query=scan.nextLong();
//                calc(arr,query);
//            }
//        
//    }
//    
//}
