package io.navas.examples;

public class Array {
	
	public static void main(String args[]) {
		
		int a[]=new int[5];
	     a[0]=1000;
	     a[1]=20;
	     a[2]=300;
	     a[3]=40;
	     a[4]=5;
	     
	     int temp=a[0];	   
	     int temp1=a[0];

	     for(int i=1;i<a.length;i++) {
         if(a[i]<temp) {
        	 temp1=temp;
         temp=a[i];      	 
         } 
         else if(a[i]<temp1 && temp1!=temp) {
    		 temp1=a[i];
    		 
    	 }
     	 
   }
	     System.out.println("temp1 1st==>"+temp1);
	    
         System.out.println(temp);
         

        }

	     
	     
	}


