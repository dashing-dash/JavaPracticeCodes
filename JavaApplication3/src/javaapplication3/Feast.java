/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;
/**
 *
 * @author Pallav
 */
public class Feast {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t,test,i,j;
        t=scan.nextInt();
        for(test=0;test<t;test++){
            int n=scan.nextInt();
            int arr[]=new int[n];
            int sum=0,cases=0;
            int total=0;
            for(i=0;i<n;i++){
                arr[i]=scan.nextInt();
                if(arr[i]<0){
                    total+=arr[i];
                }
                else{
                    sum+=arr[i];
                    cases++;
                }
            }
            total=total+(sum*cases);
            System.out.println(total);
            
        }
    }
}
