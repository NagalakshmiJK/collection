package techicalquestions;

import java.util.Scanner;
public class Nonduplicate {

	public static void main(String[] args) {
	   int d[]=new int[50],i,j;
	   Scanner s=new Scanner(System.in);
       System.out.println("How many number to be inserted");
       int n=s.nextInt();
       for(i=0;i<n;i++)
       {
    	   d[i]=s.nextInt();
    	   for(j=0;j<i;j++)
    	   {
    		   if(d[i]==d[j])
    		   {
    			   System.out.println("Sorry this duplicate element \nEnter new elemnt");
    			   d[i]=s.nextInt();
    			   j=-1;
    		   }
    	   }
       }
       System.out.println("print the output");
       for(i=0;i<n;i++)
    	   System.out.println(d[i]);
	}
}
