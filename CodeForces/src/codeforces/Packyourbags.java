/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

/**
 *
 * @author Pallav
 */
import java.util.*;
public class Packyourbags {
     public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        
        for(int i=0;i<a;i++){
            arr.add(i,new ArrayList<Integer>());
        }
        for(int i=0;i<a;i++){
            arr.get(i).add(scan.nextInt());
            arr.get(i).add(scan.nextInt());
            arr.get(i).add(scan.nextInt());
        }
        long arr1[]=new long[b];
        for(int i=0;i<b;i++){
            arr1[i]=999999999;
        }
        
        int dur=0;
        long cost=0,flag=0,flagfinal=0;
        for(int i=0;i<a;i++){
            if(arr.get(i).get(1)-arr.get(i).get(0)+1>=b)
                continue;
            else{
                if(arr1[arr.get(i).get(1)-arr.get(i).get(0)+1]>arr.get(i).get(2)){
                    arr1[arr.get(i).get(1)-arr.get(i).get(0)+1]=arr.get(i).get(2);
                }
            }
        }
        for(int i=0;i<b;i++){
            System.out.println(arr1[i]);
        }
        long min=999999999;
        for(int i=0;i<b/2;i++){
            cost=arr1[i]+arr1[b-i-1];
            //System.out.println(cost);
            if(cost<min)
                min=cost;
        }
        if(min>=999999999)
            System.out.println("-1");
        else
            System.out.println(min);
     }
}
