///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package javaapplication3;
//
//import java.util.*;
//
///**
// *
// * @author Pallav
// */
//public class HashHard {
//    public static void main(String args[] ){
//       
//        Scanner scan = new Scanner(System.in);
//        int t,i,j,k;
//        t = scan.nextInt();
//        //System.out.println("t="+t);
//        char key;
//        char value;
//        String code;
//        HashMap hm=new HashMap();
//        char c;
//        for(c='A';c<'z';c++){
//            hm.put(c, c);
//        }
//        for(i=0;i<t;i++){
//            //key=scan.next().charAt(0);
//            //value=scan.next().charAt(0);
//            key=scan.next().charAt(0);
//            value=scan.next().charAt(0);
//            //value='a';
//            //System.out.println("key="+key+" value="+value);
//            hm.put(key,value);
//            hm.put(value,key);
//        }
//        scan.nextLine();
//        code=scan.nextLine();
//        //System.out.println("code="+code);
//        //System.out.println(code.length());
//        for(i=0;i<code.length();i++){
//            if(code.charAt(i)==' '){
//            continue;    
//            }
//            c=(char)hm.get(code.charAt(i));
//            
//            if(c!=code.charAt(i)){
//                if(i==0){
//                    code=c+code.substring(1);
//                }
//                else{
//                    code=code.substring(0,i)+c+code.substring(i+1);
//                }
//            }
//        }
//        System.out.println(code);
//        
//    }
//}
