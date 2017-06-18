/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samsung;

/**
 *
 * @author Pallav
 */

import java.util.*;
import java.io.*;
//import java.math.*;
public class Samsung {

    /**
     * @param args the command line arguments
     */
    static long GCD(long a,long b){
        if(a == 0 || b == 0) return a+b; 
        return GCD(b,a%b);

    }
    static long GCD(long[] a) {
        // the GCD of a number with itself is... itself
        long gcd ;
        gcd=a[0];
        
        // compute incrementally
        for( int i=1; i<a.length; i++ ) {
          gcd = GCD( gcd, a[i] );
        }

        // return result
        return gcd;    
      }
    static void calcGCD(long arr[],int size,int start,int end){
        int i,j;
        int total=end-start+1;
        long arrGCD[]=new long[total];
        for(i=start,j=0;i<end+1;i++,j++){
            arrGCD[j]=fib(arr[i]);
            //System.out.print(arrGCD[j]+" ");
        }
        //System.out.println("GCD of "+arrGCD);
        long gcd=GCD(arrGCD);
        System.out.println(gcd%1000000000);
    }
    
    
    
    
    static long fib(long num){
        if(num==1)
            return 1;
        else if(num==2)
            return 1;
        else return (fib(num-1)+fib(num-2));
        
    }
    
    public static void main(String[] args) {
        try{
            Scanner scan=new Scanner(System.in);
        
            int n,q,i,j,k,start=0,end=0;
            n=scan.nextInt();
            q=scan.nextInt();
            long arr[]=new long[n];
            for(i=0;i<n;i++){
                arr[i]=scan.nextLong();
            }
            for(j=0;j<q;j++){
                start=scan.nextInt()-1;
                end=scan.nextInt()-1;
                calcGCD(arr,n,start,end);
            }
        }catch(Exception e){
            return;
        }
        
    }
}
