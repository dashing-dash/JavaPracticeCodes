/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

/**
 *
 * @author Pallav
 */
import java.util.*;
public class Permute {
    static void perm(long a){
        int p=1;
        for(int i=1;i<=a;i++){
            p*=i;
        }
        System.out.println(p);
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        long a=scan.nextLong();
        long b=scan.nextLong();
        if(a==0 || b==0)
            System.out.println("1");
        else{
            if(a>b)
                perm(b);
            else
                perm(a);
        }
    }
}
