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
//public class BinaryTree {
//    static class Node{
//        int key;
//        Node left,right;
//        Node(int item){
//          key=item;
//          left=right=null;
//        }
//    }
//    static Node root;
//    
//    public static Node insert(Node root,int value){
//        if(root==null){
//            root=new Node(value);
//            return root;
//        }
//        else if(value<root.key){
//                root.left=insert(root.left,value);
//            }
//        else if(value>root.key){
//                root.right=insert(root.right,value);
//            }
//        return root;
//            
//    }
//    static Node search(Node root,int value){
//        
//        if(root.key==value||root==null){
//            //System.out.println("yes");
//            return root;
//        }            
//        else if(value<root.key){
//            return(search(root.left,value));
//        }
//        else{
//            return(search(root.right,value));
//        }
//            
//    }
//    static void inorder(Node root){
//        if(root==null)
//            return;
//        inorder(root.left);
//        System.out.println(root.key);
//        inorder(root.right);
//    }
//    
//    static void preorder(Node root){
//        if(root==null)
//            return;
//        System.out.println(root.key);
//        preorder(root.left);        
//        preorder(root.right);
//    }
//    
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
//        int t,i,j,pos;
//        t=scan.nextInt();
//        root=null;
//        Node temp=root;
//        for(i=0;i<t;i++){
//            if(i==0)
//                temp=insert(root,scan.nextInt());//maintaining root
//            else
//                insert(temp,scan.nextInt());
//        }
//        //System.out.println("calling inorder");
//        //inorder(temp);
//        pos=scan.nextInt();
//        
//        Node newRoot=search(temp,pos);
//        //System.out.println("Calling preorder with new root");
//        preorder(newRoot);
//    }
//    
//}
