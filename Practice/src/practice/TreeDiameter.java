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
////class Node{
////    int data;
////    Node left,right;
////    public Node(int data1){
////        data=data1;
////        left=right=null;
////    }
////}
//
////Nested class example
////can uncomment upper code and it will work fine
////just change treeobj.new Node() to new Node()
//
//public class TreeDiameter {
//    class Node{
//        int data;
//        Node left,right;
//        public Node(int data1){
//            data=data1;
//            left=right=null;
//        }
//    }
//    Node root;
//    public int diameter(Node root){
//        if(root==null)
//            return 0;
//        int lengthl=length(root.left);
//        int lengthr=length(root.right);
//        
//        int diameterl=diameter(root.left);
//        int diameterr=diameter(root.right);
//        
//        return(Math.max(lengthl+lengthr+1,Math.max(diameterl,diameterr)));
//    }
//    int diameter(){
//        return diameter(root);
//    }
////finding height of the tree
//    public static int length(Node node){
//        if(node==null)
//            return(0);
//        else
//            return(1+Math.max(length(node.left),length(node.right)));
//    }
//    public void preorder(Node root){
//        if (root==null)
//            return;
//        System.out.println(root.data);
//        preorder(root.left);
//        preorder(root.right);
//    }
//    
//    //LCA:Lowest Common Ancestor
//    
////    LinkedList<Integer> list1=new LinkedList<Integer>();
////    LinkedList<Integer> list2=new LinkedList<Integer>();
////    
////    public void lca(Node root,int data1,int data2){
//////        int arr1[]=new int[size];
//////        int arr2[]=new int[size];
////        findPath(root,data1,1);
////        findPath(root,data2,2);
////        Iterator it1=list1.iterator();
////        Iterator it2=list2.iterator();
////        int common=root.data;
////        while(it1.hasNext()){
////            System.out.println(it1.next());
////        }
////    }
////    //using preorder
////    void findPath(Node root,int data1,int flag){
////        if(root==null)
////            return;
////        System.out.print(root.data+" ");
////        if(flag==1 && root.data!=data1)
////            list1.add(root.data);
////        else if(flag==2 && root.data!=data1)
////            list2.add(root.data);
////        
////        if(root.data==data1)
////            return;
////        findPath(root.left,data1,flag);
////        findPath(root.right,data1,flag);
////        
////    }
//    public Node lowestCommonAncestor(Node root, int p, int q) {
//        if(root==null)
//            return null;
//
//        if(root.data==p || root.data==q)
//            return root;
//
//        Node l = lowestCommonAncestor(root.left, p, q);
//        Node r = lowestCommonAncestor(root.right, p, q);
//
//        if(l!=null&&r!=null){
//            return root;
//        }else if(l==null&&r==null){
//            return null;
//        }else{
//            return l==null?r:l;
//        }
//    }
//    //Use this to find non recursive version of LCA by using array or list to store the ancestors of both the nodes
//    boolean printAncestors(Node node, int target) 
//    {
//         /* base cases */
//        if (node == null)
//            return false;
//  
//        if (node.data == target)
//            return true;
//  
//        /* If target is present in either left or right subtree 
//           of this node, then print this node */
//        if (printAncestors(node.left, target)
//                || printAncestors(node.right, target)) 
//        {
//            System.out.print(node.data + " ");
//            return true;
//        }
//  
//        /* Else return false */
//        return false;
//    }
//    
//    //method to print the level of a node
//    int getLevelUtil(Node node, int data, int level) 
//    {
//        if (node == null)
//            return 0;
//  
//        if (node.data == data)
//            return level;
//  
//        int downlevel = getLevelUtil(node.left, data, level + 1);
//        if (downlevel != 0)
//            return downlevel;
//  
//        downlevel = getLevelUtil(node.right, data, level + 1);
//        return downlevel;
//    }
//  
//    /* Returns level of given data value */
//    int getLevel(Node node, int data) 
//    {
//        return getLevelUtil(node, data, 1);
//    }
//    
//    
//    public static void main(String args[]){
//        TreeDiameter treeobj=new TreeDiameter();
//        TreeDiameter temp=new TreeDiameter();
//        Scanner scan=new Scanner(System.in);
//        int t,r,i,j,k,data;
//        String pos;
//        t=scan.nextInt();//t is number of times L/R along with data will be used
//        r=scan.nextInt();//r is value of root
//        treeobj.root=treeobj.new Node(r);
//        temp.root=treeobj.root;
//        
//        for(i=0;i<(t-1);i++){
//            pos=scan.next();
//            //System.out.println("position="+pos);
//            data=scan.nextInt();
//            //System.out.println("data="+data);
//            j=0;
//            k=1;
//            treeobj.root=temp.root;
//            for(j=0;j<pos.length();j++){
//                if(pos.charAt(j)=='L' && pos.length()==1){                    
//                    treeobj.root.left=treeobj.new Node(data);
//                }
//                else if(pos.charAt(j)=='R' && pos.length()==1){                    
//                    treeobj.root.right=treeobj.new Node(data);
//                }
//                else if(pos.charAt(j)=='L' && j==pos.length()-1){                    
//                    treeobj.root.left=treeobj.new Node(data);
//                }
//                else if(pos.charAt(j)=='R' && j==pos.length()-1){                    
//                    treeobj.root.right=treeobj.new Node(data);
//                }
//                else if(pos.charAt(j)=='L'){
//                    treeobj.root=treeobj.root.left;
//                }
//                else if(pos.charAt(j)=='R'){
//                    treeobj.root=treeobj.root.right;
//                }
//                    
//            }
//        }
//        int dia=treeobj.diameter(temp.root);
//        System.out.println("DIAMETER="+dia);
//        //treeobj.preorder(temp.root);
//        
//        // input : 6 1 L 2 R 8 LL 4 LR 3 LRR 5
//        treeobj.root=temp.lowestCommonAncestor(temp.root,4,5);
//        System.out.println("LCA is "+treeobj.root.data);
//    }
//}
