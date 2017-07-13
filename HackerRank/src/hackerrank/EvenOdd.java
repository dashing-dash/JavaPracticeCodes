//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class EvenOdd {
//
//    static int minimumChocolateMoves(int n, int[] X) {
//        int flag[]=new int[n];
//        int extraflag=0;
//        int count=0;
//        int flag1[]=new int[n];
//        for(int i=0;i<n;i++){
//            if(i%2==0){
//                if(X[i]%2==0){
//                    continue;
//                }
//                else{
//                    if(X[i]==1){
//                        flag1[i]=1;
//                        flag[i]=1;
//                        extraflag++;
//                    }
//                    else{
//                        flag[i]=1;
//                        extraflag++;
//                    }
//                }
//            }
//            else{
//                if(X[i]%2==1){
//                    continue;
//                }
//                else{
//                    flag[i]=1;
//                    extraflag++;
//                }                
//            }
//        }
//        
//        for(int i=n-1;i>=0;i--){
//            if(i%2==0){
//                if(X[i]>2){
//                    for(int j=0;j<n;j++){
//                        if(flag1[i]==1){
//                            X[i]--;
//                            flag1[i]=0;
//                            flag[i]=0;
//                            extraflag--;
//                            count++;
//                        }
//                        if(X[i]==2)
//                            break;
//                    }
//                    if(X[i]%2==1)
//                        extraflag++;
//                }
//            }
//            else{
//                if(X[i]>1){
//                    for(int j=0;j<n;j++){
//                        if(flag1[i]==1){
//                            X[i]--;
//                            flag1[i]=0;
//                            flag[i]=0;
//                            extraflag--;
//                            count++;
//                        }
//                        if(X[i]==1)
//                            break;
//                    }
//                    if(X[i]%2==0)
//                        extraflag++;
//                }
//            }
//        }
//        int flag3=0;
//        for(int i=0;i<n;i++){
//            if(i%2==0){
//                if(X[i]%2==0){                    
//                }
//                else{
//                    if(flag3==1){
//                        flag3--;
//                        count++;
//                    }
//                    else
//                        flag3++;
//                }
//            }
//            else{
//                if(X[i]%2==1){                    
//                }
//                else{
//                    if(flag3==1){
//                        flag3--;
//                        count++;
//                    }
//                    else
//                        flag3++;
//                }
//            }
//        }
//        if(flag3==0)
//            return count;
//        else
//            return -1;
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
