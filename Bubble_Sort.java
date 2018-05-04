package Ordenamiento;
import java.io.*;
 public class Bubble_Sort 
{
	public void bubblesort (int[] A) 
   {
		for (int i=0;i<A.length;i++) 
		{
		boolean swapped=false;
		
		  for (int j =0 ; j<A.length-1;j++  ) 
		 {
			  if (A[j]> A[j+1]) 
			 {
				int swap = A[j];	
				A[j]=A[j+1];	
				A[j+1]=swap;
				swapped= true;
			 }	
		  }	
		if (!swapped) {
			break;
		}
	  } 
   }
	public void printArre(int[] array )throws IOException
   {
		BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(System.out));
	   try 
	  {
		  for(int i =0; i<array.length;i++ ) 
		 {
			escribir.write(array[i]+ " ");
		 }
		       escribir.write("\n");
		       escribir.flush();
	   }
		   catch( Exception ex ) {}
	}
	 public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		int[] a  = {1,2,3,4,34,43}	;
		
		BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
		
		String line = leer.readLine();
		
		String [] numbers = line.split(",");
		
		int[] array = new int [numbers.length];
		
		for (int i =0 ; i<numbers.length;i++) 
		
		array[i]= Integer.parseInt(numbers[i]);
		
		Bubble_Sort sorts= new Bubble_Sort ();
		
		sorts.printArre(array);
		
		sorts.bubblesort(array);
		
		sorts.printArre(array);	
	 }
}
