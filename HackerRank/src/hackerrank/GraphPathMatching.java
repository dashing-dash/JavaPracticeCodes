///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hackerrank;
//
///**
// *
// * @author Pallav
// */
//import java.util.*;
//public class GraphPathMatching {
//    class Node{
//        int v;
//        char c;
//        Node(int v,char c){
//            this.v=v;
//            this.c=c;
//        }
//    }
//    Node temp;
//    
//    LinkedList<Node> adjList[];
//    GraphPathMatching(int size){
//        adjList=new LinkedList[size];
//        for(int i=0;i<size;i++){
//            adjList[i]=new LinkedList<Node>();
//        }
//    }
//    
//    void addEdge(Node n1,Node n2){
//        adjList[n1.v].add(n2);
//    }
//    
////    void DFS(Node start,Node dest,String match,int size){
////        int arr[]=new int[size];
////        boolean visited[]=new boolean[size];
////    }
//    
//    void DFS(Node start,Node dest,String match,int size){
//        //int arr[]=new int[size];
//        boolean visited[]=new boolean[size];
//        Stack<Node> st=new Stack<>();
//        Node nodearr[]=new Node[size];
//        
//        st.push(start);
//        visited[start.v]=true;
//        
//        int i=0;
//        while(!st.empty()){
//            nodearr[i]=st.pop();
//            
//            if(nodearr[i]==dest)
//                break;
//            
//            i++;
//            Iterator<Node> it = adjList[nodearr[i-1].v].listIterator();
//            while(it.hasNext()){
//                Node n=it.next();
//                if(visited[n.v]==true)
//                    continue;
//                else{
//                    visited[n.v]=true;
//                    st.push(n);
//                }
//                
//            }
//        }
//        for(int j=0;j<size;j++){
//            if(nodearr[j]==null)
//                break;
//            System.out.print(nodearr[j].v+" ");
//            //System.out.println("hello");
//        }
//        System.out.println("\n");
//    }
//    
//    public static void main(String args[]){        
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int q = in.nextInt();
//        
//        GraphPathMatching graph=new GraphPathMatching(n);
//        String s = in.next();
//        Node nodearr[]=new Node[n];
//        
//        int i,j;
//        for(i=0;i<n;i++){
//            nodearr[i]=graph.new Node(i,(char)s.charAt(i));
//        }
//        //debugging
////        for(i=0;i<n;i++){
////            System.out.println(nodearr[i].c+" "+nodearr[i].v);
////        }
//        String p = in.next();
//        for(int a0 = 0; a0 < n-1; a0++){
//            int u = in.nextInt()-1;// since u and v starts from 1
//            int v = in.nextInt()-1;
//            graph.addEdge(nodearr[u], nodearr[v]);
//        }
//        for(int a0 = 0; a0 < q; a0++){
//            int u = in.nextInt()-1;
//            int v = in.nextInt()-1;
//            System.out.println(u+" "+v);
//            graph.DFS(nodearr[u], nodearr[v], p, n);
//        }
//    }
//}
//
////Test Cases
////5 5
////abbaa
////ab
////1 2
////2 4
////2 5
////1 3
////4 5
////5 4
////4 3
////3 4
////2 4
