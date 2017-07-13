///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package codechef;
//
///**
// *
// * @author Pallav
// */
//import java.util.*;
//import java.io.*;
//public class Sign {
//     public static void main(String[] args)throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        //int n=br.readLine();
//        StringTokenizer st;
//        st = new StringTokenizer(br.readLine());
//        
//        int n=Integer.parseInt(st.nextToken());
//        for(int i=0;i<n;i++){
//            //ArrayList<String> arr=new ArrayList<>();
//            String str="";
//            st=new StringTokenizer(br.readLine());
//            str=st.nextToken();
////            while(st.hasMoreTokens()){
////                arr.add(st.nextToken());
////            }
//            //System.out.println(i+"   "+str);
//            int count=1;
//            int curr=1;
//            for(int j=0;j<str.length();j++){
//                if(str.charAt(j)=='<'){
//                    if(curr==count){
//                        curr++;
//                        count++;
//                    }
//                    else{
//                        curr++;
//                    }
//                }
//                else if(str.charAt(j)=='>'){
//                    if(curr==1){
//                        //curr++;
//                        count++;
//                    }
//                    else if(curr<=count){
//                        curr--;
//                    }
//                    
//                }
//            }
//            System.out.println(count);
//        }
//     }
//}
