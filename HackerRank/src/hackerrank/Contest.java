//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Contest {
//
//    static int minimumChocolateMoves(int n, int[] X) {
//        int flag=0,count=0;
//        int flag1=0;
//        for(int i=0;i<n;i++){
//            if(i%2==0){
//                if(X[i]%2==0){
//                    while(X[i]!=2){
//                            if(flag1>0){
//                                flag1--;
//                                X[i]--;                                
//                            }
//                        }
//                    continue;
//                }
//                else{
//                    if(X[i]==1){
//                        flag1++;
//                        continue;
//                    }
//                    if(X[i]>1){
//                        while(X[i]!=2){
//                            if(flag1>0){
//                                flag1--;
//                                X[i]--;                                
//                            }
//                        }
//                    }
//                    if(flag==1){
//                        count++;
//                        flag=0;
//                    }
//                    else{
//                        flag=1;
//                    }
//                }                
//            }
//            else{
//                if(X[i]%2==1){
//                    continue;
//                }
//                else{
//                    if(flag==1){
//                        count++;
//                        flag=0;
//                    }
//                    else{
//                        flag=1;
//                    }
//                }
//            }
//        }
//        if(flag==1)
//            return -1;
//        else
//            return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //  Return the minimum number of chocolates that need to be moved, or -1 if it's impossible.
//        int q = in.nextInt();
//        for(int a0 = 0; a0 < q; a0++){
//            int n = in.nextInt();
//            int[] X = new int[n];
//            for(int X_i = 0; X_i < n; X_i++){
//                X[X_i] = in.nextInt();
//            }
//            int result = minimumChocolateMoves(n, X);
//            System.out.println(result);
//        }
//    }
//}
