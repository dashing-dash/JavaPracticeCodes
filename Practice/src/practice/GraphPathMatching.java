///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package practice;
//
//import java.util.*;
//
///**
// *
// * @author Pallav
// */
//public class GraphPathMatching {
//    int v;
//    
//    class Node{
//        int v;
//        char c;
//        Node(int v,char c){
//            this.v=v;
//            this.c=c;
//        }
//        
//    }
//    LinkedList<Node> adjList[];
//    GraphPathMatching(int V){
//        v=V;
//        adjList=new LinkedList[V];
//        for(int i=0;i<V;i++){
//            adjList[i]=new LinkedList<Node>();
//        }
//    }
//    
//    void addEdge(Node a,Node b){
//        adjList[a.v].add(b);
//    }
//    
//    void DFSUtil(Node start,Node dest,boolean visited[],Node arr[],int i)
//    {
//        // Mark the current node as visited and print it
//        visited[start.v] = true;
//        System.out.print(start+" ");
//        arr[i]=start;
//        if(start==dest)
//            return;
//        // Recur for all the vertices adjacent to this vertex
//        Iterator<Node> it = adjList[start.v].listIterator();
//        while (it.hasNext())
//        {
//            Node n = it.next();
//            if (!visited[n.v])
//                DFSUtil(n, dest,visited,arr,i+1);
//        }
//    }
// 
//    // The function to do DFS traversal. It uses recursive DFSUtil()
//    void DFS(Node start,Node dest,int size,Node arr[])
//    {
//        // Mark all the vertices as not visited(set as
//        // false by default in java)
//        boolean visited[] = new boolean[size];
//        //Node arr[]=new Node[size];
//        // Call the recursive helper function to print DFS traversal
//        DFSUtil(start,dest, visited, arr,0);
//    }
//    public static void main(String args[])
//    {
//        
//        int i;
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        GraphPathMatching g = new GraphPathMatching(n);
//        int q = in.nextInt();
//        String s = in.next();
//        Node arrNode[]=new Node[n];
//        
//        for(i=0;i<n;i++){
//            arrNode[i]=g.new Node(i,s.charAt(i));
//        }
//        
//        String p = in.next();
//        for(int a0 = 0; a0 < n-1; a0++){
//            int u = in.nextInt()-1;
//            int v = in.nextInt()-1;
//            g.addEdge(arrNode[u], arrNode[v]);
//        }
//        for(int a0 = 0; a0 < q; a0++){
//            int u = in.nextInt()-1;
//            int v = in.nextInt()-1;
//            Node arr[]=new Node[n];
//            g.DFS(arrNode[u], arrNode[v], n,arr);
//            for(int j=0;i<n;i++){
//                System.out.print(arrNode[arr[i].v].v);
//            }
//            System.out.println();
//        }
//        
// 
////        System.out.println("Following is Breadth First Traversal "+
////                           "(starting from vertex 2)");
// 
//        
//    }
//    
//}
