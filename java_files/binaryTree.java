import java.util.*;
public class binaryTree{
	public static void conToTree(int arr[],int l,int r,int i)
	{
		if(i<arr.length&&i>=0)
		{
			
			int mid=(l+r)/2;
			arr[i]=arr[mid];
			conToTree(arr,l,mid-1,i+1);
			conToTree(arr,mid+1,r,mid+2);
		}	
	}
	public static void main(String args[])
	{
		int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
		conToTree(arr,0,arr.length-1,0);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	
	}



}