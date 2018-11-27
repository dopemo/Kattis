import java.util.*;
public class Zanzibar{
	
	public static void zan(String array[],int n)
	{
		int[] n_pure=new int[n];
		int count=0;
		//int counter=0;
		int temp;
		for(int i=0;i<array.length;i++)
		{
			int counter=0;
			String[] splited = array[i].split("\\s+");
			//System.out.println(splited.length);
			
			for(int j=0;j<splited.length-1;j++)
			{
				
				int prev=Integer.parseInt(splited[j]);
				int next=Integer.parseInt(splited[j+1]);
				//System.out.println("prev: "+ prev+" next: "+next);
				
				if(next>(prev*2))
				{
					counter+=next-(prev*2);
					//System.out.println(counter);
					n_pure[i]=counter;
					count++;
					
					
				}
				else{
					continue;
				}
			
				
				
			}
			
		}
		for(int i=0;i<n_pure.length;i++){
			System.out.println(n_pure[i]);
		}
	
		
	}
	public static void main(String args[])
	{
		
		Scanner bucky=new Scanner(System.in);
        String input=bucky.nextLine();
        int temp=Integer.parseInt(input);
		String[]array=new String[temp];
		
		for(int i=0;i<temp;i++)
		{
			String pop;
			pop=bucky.nextLine();
			//System.out.println(" "+pop);
			array[i]=pop;
		}
		
	
		
		zan(array,temp);
	
		
		//System.out.println(n);
		

	}
}