package datastructure;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {16,7,22,3,19,9,33};
		HeapSort hs = new HeapSort();
		hs.sort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int arr[],int size)
	{   // loop to find max indexed parent node
		for(int i=(size/2)-1;i>=0;i--)
		{
			heapify(arr,size,i);
		}
		// loop to swap largest element at 0 index with element present at last index and than removing last index from tree
		for(int i=size-1;i>=0;i--)
		{
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]= temp;
			heapify(arr,i,0);//this recursion will remove the last element
		}
	}
	
	//method to convert heap tree into max heap tree
	public void heapify(int arr[],int size,int i)
	{
		int largest =i;
		int left = (2*i)+1;
		int right =(2*i)+2;
		if(left<size && arr[left]>arr[largest])
		{
			largest = left;
		}
		if(right<size && arr[right]>arr[largest])
		{
			largest = right;
		}
		
		if(largest!=i)
		{
			int temp = arr[i];
			arr[i]=arr[largest];
			arr[largest] = temp;
			heapify(arr,size,largest);
		}
		
		
	}

}
