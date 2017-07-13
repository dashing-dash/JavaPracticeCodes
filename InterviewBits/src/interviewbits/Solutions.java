/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewbits;

/**
 *
 * @author Pallav
 */
/**
 * 
 * 
 * 
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */


//SOlution for linkedlist checkpoint 4


//public class Solution {
//	public ListNode subtract(ListNode a) {
//	    int count=0;
//	    int x=0;
//	    ListNode temp=a;
//	    ListNode temp1=a;
//	    while(temp!=null){
//	        count++;
//	        temp=temp.next;
//	    }
//	    
//	    temp=a;
//	    for(int i=0;i<count/2;i++){
//	        for(int j=i;j<count-i;j++){
//	            x=temp.val;
//	            temp=temp.next;
//	        }
//	        
//	        a.val=x-a.val;
//	        a=a.next;
//	        temp=a;
//	    }
//	    a=temp1;
//	    return a;
//	    
//	}
//}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

//better solution
//public class Solutions {
//	public ListNode subtract(ListNode a) {
//        ListNode temp=a;
//	    int count=0;
//	    while(temp!=null){
//	        count++;
//	        temp=temp.next;
//	    }
//	    temp=a;
//	    int arr[]=new int[count];
//	    int i=0;
//	    while(temp!=null){
//	        arr[i]=temp.val;
//	        temp=temp.next;
//	        i++;
//	    }
//	    temp=a;
//	    for(i=0;i<count/2;i++){
//	        arr[i]=arr[count-i-1]-arr[i];
//	    }
//	    i=0;
//	    while(i<count/2){
//	        temp.val=arr[i];
//	        temp=temp.next;
//	        i++;
//	    }
//	    temp=a;
//	    
//	    return a;
//	}
//}

