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
//public class CodeChef {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args)throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        //int n=br.readLine();
//        StringTokenizer st;
//        st = new StringTokenizer(br.readLine());
//        
//        int n=Integer.parseInt(st.nextToken());
//        for(int i=0;i<n;i++){
//            ArrayList<String> arr=new ArrayList<>();
//            st=new StringTokenizer(br.readLine());
//            
//            while(st.hasMoreTokens()){
//                arr.add(st.nextToken());
//            }
//            //System.out.println(arr);
//            String str="";
//            int size=arr.size();
//            if(size==0)
//                System.out.println("");
//            else{
//                for(int j=0;j<size-1;j++){
////                    if(arr.get(j).charAt(0)>='A'&&arr.get(j).charAt(0)<='Z'){
////                        str.add()
////                    }
////                    String c=Character.toString(arr.get(j).charAt(0));
////                    str+=c.toUpperCase();
//                    str+=arr.get(j).substring(0,1).toUpperCase();
//                    str+=". ";
//                }
//                str+=arr.get(size-1).substring(0,1).toUpperCase()+arr.get(size-1).substring(1).toLowerCase();
//                System.out.println(str);
//            } 
//            
//        }
//        
//    }
//    
//}
