package Ordenamiento;
import java.io.*;
 public class Lineal_Search 
{
	public int linealSearch(int [] A, int data)
   {
		int index = -1;
		
		for (int i = 0; i < A.length; i++) 
	   {
			if (A[i] == data) 
		   {
				index = i;
				break;
		   }
	   }
		return index;
	}
	public void printArray(int [] array)
   {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		try
	   {
			for (int i = 0; i < array.length; i++) 
				bw.write(array[i] + " ");
			
			bw.write(" ingrese numero que desea buscar \n");
			bw.flush();
	   }
		catch (Exception ex) {}
    }
	
	public static void main(String [] args) throws IOException
   {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(System.out));
		
		escribir.write(" Ingrese numeros separados por comas \n");
		escribir.flush();
		
		String line =  leer.readLine();
		String [] numbers = line.split(",");
		int [] array = new int [numbers.length];
		
		for (int i = 0; i < array.length; i++) 
			array[i] = Integer.parseInt(numbers[i]);
		
		Lineal_Search ls = new Lineal_Search();
		
		ls.printArray(array);
		escribir.write("\n");
		
		int value = Integer.parseInt(leer.readLine());
		
		int index = ls.linealSearch(array,value);
			
		if (index == -1)
		{
			escribir.write("El numero " + value + " no se encontro\n");
			escribir.flush();
		}	
		else
		{
			escribir.write("El numero " + value + " se encontro en la posición " + index + "\n");
			escribir.flush();
		}
   }
	
}
