 package Ordenamiento;
 import java.io.*;
 public class Merge_Sort 
{
	public int[] MergeSort(int [] A)
	{
		int n = A.length / 2;
		int [] sortedL = new int [n];
		int [] sortedR = new int [A.length-n];	
		
		if(A.length == 1)
			return A;
		else
		{
			for(int i = 0; i < n; i++)
				sortedL[i] = A[i];
				
			for(int i = 0 ; i < sortedR.length; i++)
				sortedR[i] = A[n + i];
							
			sortedL = MergeSort(sortedL);
			sortedR = MergeSort(sortedR);						
		}								
		return merge(sortedL, sortedR);		
	}
	public int[] merge(int [] A, int [] B)
	{
		int l = A.length + B.length;
		int [] C = new int [l];
		int indexA = 0, indexB = 0, indexC = 0;
		
		while (indexA < A.length && indexB < B.length)
		{
			if (A[indexA] < B[indexB])
			{
				C[indexC] = A[indexA];
				indexA += 1;
				indexC += 1;
			}
			else
			{
				C[indexC] = B[indexB];
				indexB += 1;
				indexC += 1;
			}
		 }
		while(indexA < A.length)
		{
			C[indexC] = A[indexA];
			indexA += 1;
			indexC += 1;
		}
		
		while(indexB < B.length)
		{
			C[indexC] = B[indexB];
			indexB += 1;
			indexC += 1;
		}
		return C;
	}
	public void printArray(int [] array)
	{
		BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try
		{
			for (int i = 0; i < array.length; i++) 
				escribir.write(array[i] + " ");
				
			escribir.write("\n");
			escribir.flush();
		}
		catch (Exception ex) {}
	}
	public static void main(String [] args) throws IOException
	{
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
		String line = leer.readLine();
		String [] numbers = line.split(",");
		int [] array = new int [numbers.length];
		
		for (int i = 0; i < array.length; i++) 
			array[i] = Integer.parseInt(numbers[i]);
		
		Merge_Sort sort = new Merge_Sort();
		sort.printArray(array);
		sort.printArray(sort.MergeSort(array));
	}
}
	

