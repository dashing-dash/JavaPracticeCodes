//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    static long countCutsAndInserts(String s) {
//        int length=s.length();
//        int count=0;
//        String sub,minusSub;
//        for(int i=0;i<length;i++){
//            for(int j=i+1;j<length+1;j++){                
//                sub=s.substring(i,j);
//                //System.out.print("sub="+sub+"   ");
//                minusSub=s.substring(0,i)+s.substring(j);
//                if(minusSub.equals("")){
//                    //System.out.println();
//                    count++;
//                    continue;
//                }
//                //System.out.print("minussub="+minusSub+"   ");
//                for(int k=0;k<minusSub.length();k++){
//                    //System.out.print(minusSub.substring(0,k)+sub+minusSub.substring(k)+"TEST");
//                    if(s.equals(minusSub.substring(0,k)+sub+minusSub.substring(k)))
//                        count++;
//                }
//                //System.out.print(minusSub+sub+"TEST");
//                if(s.equals(minusSub+sub)){
//                    count++;
//                }
//                //System.out.println();
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //  Return the number of successful ways to cut and insert a substring.
//        String s = in.next();
//        long result = countCutsAndInserts(s);
//        System.out.println(result);
//    }
//}
