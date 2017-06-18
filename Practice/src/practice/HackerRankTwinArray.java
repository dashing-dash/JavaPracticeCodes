/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Pallav
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankTwinArray {

    static int twinArrays(int[] ar1, int[] ar2,int size){
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        Map <Integer,Integer> hmap1=new HashMap<>();
        Map <Integer,Integer> hmap2=new HashMap<>();
        arr1=ar1;
        arr2=ar2;
        
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        int i;
        for(i=0;i<size;i++){
            hmap1.put(ar1[i],i);
            hmap2.put(ar2[i],i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.asList(hmap1));
        System.out.println(Arrays.asList(hmap2));
        if(arr1[0]==arr2[0] && (int)hmap1.get(arr1[0])==(int)hmap2.get(arr2[0])){
            if(arr1[1]<arr2[1]){
                return(arr1[1]+arr2[0]);
            }
            else
                return(arr1[0]+arr2[1]);
        }
        else
            return(arr1[0]+arr2[0]);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2, n);
        System.out.println(result);
    }
}

