/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

/**
 *
 * @author Pallav
 */
import java.util.*;
public class PoisonField {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int t;
        t=scan.nextInt();
        for(int i=0;i<t;i++){
            
            int n=scan.nextInt();
            int k1=scan.nextInt();
            int arr[][]=new int[n][n];
            
            int rowmin=0;
            int colmin=0;
            int sumrowmin=999999;
            int sumcolmin=999999;
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    arr[j][k]=scan.nextInt();                   
                }                                
            }
            int sum=0;
            for(int m=0;m<k1;m++){
                int sumrow[]=new int[n];
                int sumcol[]=new int[n];
//                System.out.println("k="+m);
//                for(int b=0;b<n;b++){
//                    System.out.println(Arrays.toString(arr[b]));
//                }
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        sumrow[j]+=arr[j][k];
                    }
                    if(sumrow[j]<sumrowmin){
                        rowmin=j;
                        sumrowmin=sumrow[j];
                    }
                }
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        sumcol[j]+=arr[k][j];
                    }
                    if(sumcol[j]<sumcolmin){
                        colmin=j;
                        sumcolmin=sumcol[j];
                    }
                }
                //System.out.println("colmin="+colmin+"  rowmin="+rowmin);
                if(sumrow[rowmin]<sumcol[colmin]){
                    sum+=sumrow[rowmin];
                    for(int j=0;j<n;j++){
                        arr[rowmin][j]++;
                    }
                }else{
                    sum+=sumcol[colmin];
                    for(int j=0;j<n;j++){
                        arr[j][colmin]++;
                    }
                }
                //System.out.println("sum="+sum);
            }
            System.out.println(sum);
        }
    }
}
