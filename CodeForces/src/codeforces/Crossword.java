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
public class Crossword {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        ArrayList<String> arr=new ArrayList<>();
        String stra="",strb="";
        stra=scan.next();
        strb=scan.next();
        if(a==0 || b==0)
            System.out.println(0);
        else{
            int count=0;
            int min=a;
            int flag=0;
            for(int i=0;i<=b-a;i++){
                arr.add(strb.substring(i,i+a));                
                //System.out.println(arr.get(i));
            }
            
            ArrayList<String> arr1=new ArrayList<>();
            for(int i=0;i<b;i++){
                arr1.add(i,"");
            }
            for(int i=0;i<arr.size();i++){
                //int arr1[]=new int[a];
                
                count=0;
                for(int j=0;j<a;j++){
                    if(stra.charAt(j)!=arr.get(i).charAt(j)){
                        count++;                       
                        arr1.set(i,arr1.get(i)+(j+1));
                        
                    }
                }
                if(count<min){
                    min=count;
                    flag=i;
                }
            }
            System.out.println(min);
            int len=arr1.get(flag).length();
            for(int i=0;i<len;i++){
                System.out.print(arr1.get(flag).charAt(i)+" ");
            }
        }
    }
}
