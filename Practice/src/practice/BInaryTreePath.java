///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package practice;
//
///**
// *
// * @author Pallav
// */
//import java.util.*;
//class Node{
//    int data;
//    Node left,right;
//    Node(int data){
//        this.data=data;
//        left=right=null;
//    }
//}
//public class BInaryTreePath {
//    Node root;
//    void findPath(Node root){
//        int path[]=new int[1000];
//        findPath(root,0,path);
//    }
//    void findPath(Node root,int pathLen,int path[]){
//        if(root==null){
//            return;
//        }
//        path[pathLen]=root.data;
//        pathLen++;
//        if(root.left==null && root.right==null){
//            for(int i=0;i<pathLen;i++){
//                if(path[i]!=0)
//                    System.out.print(path[i]+" ");
//                else
//                    break;
//            }
//            System.out.print("#");
//            //System.out.println();
//        }
//        //else{            
//        findPath(root.left,pathLen,path);
//        findPath(root.right,pathLen,path);
//        //}
//    }
//    
//    void preorderInsert(Node root,int data,int data1,char pos){
//        if (root==null){
//            return;
//        }
//        if(root.data==data){
//            if(pos=='L')
//                root.left=new Node(data1);
//            else
//                root.right=new Node(data1);
//            return;
//        }
//        preorderInsert(root.left,data,data1,pos);
//        preorderInsert(root.right,data,data1,pos);
//    }
//    void preorder(Node root){
//        if(root==null)
//            return;
//        System.out.print(root.data+" ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//    
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int t=scan.nextInt();
//        for(int j=0;j<t;j++){                    
//            int n=scan.nextInt();
//            char c;
//            int data,data1;
//            BInaryTreePath temp=new BInaryTreePath();
//            //BInaryTreePath temp1=new BInaryTreePath();
//            //System.out.println("n="+n);
//            for(int i=0;i<n;i++){
//                data=scan.nextInt();
//                data1=scan.nextInt();
//                c=scan.next().charAt(0);
//                //System.out.println("c="+c);
//                if(i==0){
//                    temp.root=new Node(data);
//                    //temp1.root=new Node(data);
//                    temp.preorderInsert(temp.root,data,data1,c);
//                }
//                else{
//                    //temp.root=temp1.root;
//                    temp.preorderInsert(temp.root,data,data1,c);
//                }
//            }
//            temp.preorder(temp.root);
//            temp.findPath(temp.root);
//        }
//    }
//    
//}
