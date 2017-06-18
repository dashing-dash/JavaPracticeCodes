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
//public class UncommonChars {
//    Map<Character,Integer> map1=new HashMap<Character,Integer>();
//    Map<Character,Integer> map2=new HashMap<Character,Integer>();    
//    char c;
////    UncommonChars(){
////        for ( c = 'a'; c <= 'z'; c++) {
////            map1.put(c, 0);
////            map2.put(c, 0);
////        }
////    }
//    void calc(String a,String b){
//        for ( c = 'a'; c <= 'z'; c++) {
//            map1.put(c, 0);
//            map2.put(c, 0);
//        }
//        int i,check;        
//        for(i=0;i<a.length();i++){
//            c=a.charAt(i);
//            check=map1.get(c);
//            if(check==0)
//            map1.put(c,1);
//        }
//        for(i=0;i<b.length();i++){
//            c=b.charAt(i);
//            map2.put(c,map2.get(c)+1 );
//            if(map2.get(c)==1)
//                map1.put(c,map1.get(c)+1);            
//        }
//        for ( c = 'a'; c <= 'z'; c++) {
//            check=map1.get(c);
//            if(check==1)
//                System.out.print(c);
//        }
//        
//        
//    }
//    
//    public static void main(String args[]){
//        UncommonChars test=new UncommonChars();
//        Scanner scan=new Scanner(System.in);
//        int t=scan.nextInt();
//        for(int i=0;i<t;i++){
//            String a=scan.next();
//            String b=scan.next();
//            test.calc(a,b);
//            System.out.println();
//        }
//    }
//    
//}
//    
//
//
