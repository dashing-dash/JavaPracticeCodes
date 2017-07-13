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
//
////uncomment print cmd for dubugging
//public class PrimeXOR {
//    
//    int[][] powerset(int arr[],int size){
//        int powerSetSize=(int)Math.pow(2,size);
//        int arrPower[][]=new int[powerSetSize][size];
//        int counter,i,j;
//        for(counter=0;counter<powerSetSize;counter++){
//            i=0;//for putting elements in array only if value is not 0
//            for(j=0;j<size;j++){
//                if((counter & 1<<j) >0){
//                    arrPower[counter][i]=arr[j];
//                    i++;
//                }
//            }
//        }
//        
//        return arrPower;
//    }
//    void checkPrime(int arr[],int size){
//        int powerSetSize=(int)Math.pow(2,size);
//        int arrPower[][]=new int[powerSetSize][size];
//        arrPower=powerset(arr, size);
//        int arrPowerCheck[][]=new int[powerSetSize][size];
//        int arrUnique[][]=new int[powerSetSize][size];
//        //debugging
////        for(int counter=0;counter<powerSetSize;counter++){
////            System.out.print("counter="+counter+"  ");
////            for(int k=0;k<size;k++){
////                System.out.print(arrPower[counter][k]+"  ");
////            }
////            System.out.println();
////        }
//        int count=0;
//        for(int i=0;i<powerSetSize;i++){
//            int xor=0;
//            for(int j=0;j<size;j++){
//                if(j==0){
//                    xor=arrPower[i][0];
//                }
//                else{
//                    if(arrPower[i][j]==0){
//                        break;
//                    }
//                    else{
//                        xor=xor^arrPower[i][j];
//                    }
//                }
//            }
//            //System.out.println("XOR"+i+"= "+xor);//debugging
//            if(isPrime(xor))
//                arrPowerCheck[count]=arrPower[i];
//                count++;
//        }
//        //debugging
////        for(int counter=0;counter<powerSetSize;counter++){
////            System.out.print("counter="+counter+"  ");
////            for(int k=0;k<size;k++){
////                System.out.print(arrPowerCheck[counter][k]+"  ");
////            }
////            System.out.println();
////        }
//        
//        
//        for(int j=0;j<powerSetSize;j++){            
//            for(int k=j+1;k<powerSetSize;k++){
//                if(arrPowerCheck[j][0]==0)
//                    break;
//                else if(checkArray(arrPowerCheck[j],arrPowerCheck[k],size)){
//                    for(int l=0;l<size;l++){
//                        arrPowerCheck[k][l]=0;
//                    }
//                }                    
//            }
//            //System.out.println(Arrays.toString(arrPowerCheck[j]));
//        }
//        count=0;
//        for(int j=0;j<powerSetSize;j++){            
//            for(int k=0;k<size;k++){
//                if(arrPowerCheck[j][0]==0)
//                    break;
//                else{
//                    count++;
//                    break;
//                }                    
//            }
//        }                    
//         
//        System.out.println(count);
//    }
//    boolean checkArray(int arr1[],int arr2[],int size){
//        int flag=1;
//        for(int i=0;i<size;i++){
//            if(arr1[i]!=arr2[i]){
//                flag=0;
//                break;
//            }                
//        }
//        if(flag==1)
//            return true;
//        else
//            return false;
//    }
//    
//    boolean isPrime(int p){
//        int n=p/2;
//        int flag=1;
//        for(int i=2;i<=n;i++){
//            if(p%i==0){
//                flag=0;
//                break;
//            }
//        }
//        if(p==1||p==0){
//            flag=0;
//        }
//        if(flag==0)
//            return false;
//        else 
//            return true;
//    }
//    
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int t,i,n,j,k;
//        int arr[];
//        PrimeXOR test;
//        t=scan.nextInt();
//        for(i=0;i<t;i++){
//            test=new PrimeXOR();
//            n=scan.nextInt();
//            arr=new int[n];
//            for(j=0;j<n;j++){
//                arr[j]=scan.nextInt();
//            }
//            test.checkPrime(arr,n);
//        }
//    }
//    
//}
