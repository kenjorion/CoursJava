package test;

import java.util.Random;
import java.util.Scanner; 

public class test1 
{

	public static void main(String[] args)
	{
        // génération d'un nombre >= 0 et < 9
        Random r = new Random(); 
        
        for( int i= 1; i<5; i++)
        { 
        	int n = r.nextInt(9);
        	System.out.print(n); 	
        } 
		Scanner sc = new Scanner(System.in);
	    System.out.println("Saisissez un entier : ");
	    int i = sc.nextInt();
    } 
	
} 
//correction 

private int[] getUserCode() 
{ 
	Scanner sc = new Scanner(System.in);
    System.out.println("Saisissez votre code a 4 chiffres : "); 
    String userCode = sc.nextLine(); 
    
}


