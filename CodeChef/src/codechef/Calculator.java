/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

/**
 *
 * @author Pallav
 */
import java.util.*;
import java.io.*;
public class Calculator {
     public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //int n=br.readLine();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            //String str="";
            st=new StringTokenizer(br.readLine());
            
            while(st.hasMoreTokens()){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            if(arr.get(0)==0){
                System.out.println(0);
            }
            int total=arr.get(0);
            int cost=arr.get(1);
            int first=0,second=0;
            if(total/2>=cost){
               
            }
            else{
                
            }
            
            //System.out.println(i+"   "+str);
        }
     }
}