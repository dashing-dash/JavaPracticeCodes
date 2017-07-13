///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package interviewbits;
//
///**
// *
// * @author Pallav
// */
//public class SetMatrixZero {
//	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
//	    int row=a.size();
//	    int col=a.get(0).size();
//	    //ArrayList<Integer> flag=new ArrayList<>();
//	    for(int i=0;i<row;i++){
//	        for(int j=0;j<col;j++){
//	            if(a.get(i).get(j)==0){
//	                a.get(i).set(j,-1);
//	                for(int k=0;k<col;k++){
//	                    if(a.get(i).get(k)==0){
//	                        
//	                    }else{
//	                        a.get(i).set(k,-1);
//	                    }
//	                }
//	                for(int k=0;k<row;k++){
//	                    if(a.get(k).get(j)==0){
//	                        
//	                    }else{
//	                        a.get(k).set(j,-1);
//	                    }
//	                }
//	            }    
//	        }
//	    }
//	    for(int i=0;i<row;i++){
//	        for(int j=0;j<col;j++){
//	            if(a.get(i).get(j)==-1)
//	                a.get(i).set(j,0);
//	        }
//	    }
//	    
//	}
//}
