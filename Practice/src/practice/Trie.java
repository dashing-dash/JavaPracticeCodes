///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package practice;
//import java.util.*;
///**
// *
// * @author Pallav
// */
//public class Trie {
//    class TrieNode{
//        Map <Character,TrieNode> child;
//        boolean isEnd;
//        public TrieNode(){
//            child=new HashMap();
//            isEnd=false;
//        }
//    }
//    
//    TrieNode root;
//    public Trie(){
//        root=new TrieNode();
//    }
//    
//    void insert(String word){
//        TrieNode current=root;//root is always null and maps to a node with a character
//        TrieNode node;
//        int length=word.length();
//        for(int i=0;i<length;i++){
//            char ch=word.charAt(i);
//            node=current.child.get(ch);//since child.get(ch) returns object of type TrieNode
//            if(node==null){
//                node=new TrieNode();
//                current.child.put(ch,node);
//            }
//            current=node;
//        }
//        current.isEnd=true;
//    }
//    
//    void search(String word){
//        int isWord=0;
//        TrieNode current=root;
//        TrieNode node;
//        int length=word.length();
//        for(int i=0;i<length;i++){
//            char ch=word.charAt(i);
//            node=current.child.get(ch);
//            if(node==null){
//                break;
//            }
//            current=node;
//            if(current.isEnd){
//                isWord=i+1;
//            }            
//        }
//        System.out.println("the longest prefix of "+word+" is "+word.substring(0,isWord));        
//    }
//    
//    public static void main(String args[]){
//        Trie object = new Trie();
//        object.insert("are");
//        object.insert("area");
//        object.insert("base");
//        object.insert("cat");
//        object.insert("cater");
//        object.insert("children");
//        object.insert("basement");
//        object.insert("aloha");
//        
//        object.search("caterer");
//        object.search("basemexy");
//        object.search("child");
//    }
//        
//        
//    
//}
