///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package practice;
//import java.util.*;
///**
// *
// * @author Pallav
// */
//public class GameWithString {
//    
//    
//    
//    static void calc(String str,int k){
//        int i;
//        char c;
//        int temp;
//        int frequency[]=new int[26];
//        //System.out.println("str="+str);
//        for(i=0;i<str.length();i++){
//            frequency[str.charAt(i)-'a']++;
//        }
//        int len=str.length();
//        //Map<Character,Integer> maplist=new HashMap<>(); 
//        PriorityQueue<Integer> heap=new PriorityQueue<>(26,Collections.reverseOrder());
//        
//        for(i=0;i<26;i++){
//            heap.add(frequency[i]);
//        }
//        for(i=0;i<k;i++){
//            temp=heap.poll();
//            //System.out.println("poll element="+temp);
//            temp--;
//            heap.add(temp);
//        }
//        Iterator it=heap.iterator();
//        int temp1=0;
//        while(it.hasNext()){
//            temp1+=Math.pow((int)it.next(),2);
//        }
//        System.out.println(temp1);
//        
//        
//    }
//    
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int t=scan.nextInt();
//        String str;
//        int k;
//        for(int i=0;i<t;i++){
//            str=scan.next();
//            k=scan.nextInt();
//            calc(str,k);
//        }
//        
//    }
//}
