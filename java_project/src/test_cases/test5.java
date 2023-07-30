package test_cases;
import java.util.*;

class test5 {
	  
	  public static void main(String args[]) {
		  int a=0,e=0,i=0,o=0,u=0;
	    
	    String str = new String("Hi Welcome to my world!");
	    for(int f=0; f<str.length(); f++) {
	      if(str.charAt(i) == 'a'|| str.charAt(i) == 'A')
	      {
	    	  a++;
	      }
	    	   
	         if( str.charAt(f) == 'i' || str.charAt(f) == 'I') 
	        	 {
	        	 i++;
	        	 }
	         if( str.charAt(f) == 'e' || str.charAt(f) == 'E') 
        	 {
        	 e++;
        	 }
          
	         if( str.charAt(f) == 'o' || str.charAt(f) == 'O') 
        	 {
        	 o++;
        	 }
	         if( str.charAt(f) == 'u' || str.charAt(f) == 'U') 
        	 {
        	 u++;
        	 }
          
	          
	        
	      
	    }
	    System.out.println("a:"+a);
	    System.out.println("e:"+e); System.out.println("i:"+i); System.out.println("o:"+o); System.out.println("u:"+u);
	  }
	}
