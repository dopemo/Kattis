import java.util.*;
public class pers{

public static int maximumSwap(int num) {
        String s_num=Integer.toString(num);
        int[] array=new int[s_num.length()];
		int sum=0;
		
        
        for(int i=0;i<s_num.length();i++)
        {
            array[i]=Integer.parseInt(String.valueOf(s_num.charAt(i)));
			System.out.print(array[i]+" ");
        }
		System.out.print(" \n");
		
        int max=array[0];
        int pivot=array[array.length-1];
		int counter=0;
        for(int j=1;j<array.length;j++)
        {
            if(array[j]>max)
            {
                max=array[j];
				counter++;
                
            }
            
        }
		if(array[0]!=max){
        int temp=array[0];
        array[0]=array[counter];
        array[counter]=temp;
        
		}
		else{
			for(int m=1; m<array.length;m++)
			{
				if(array[m]<pivot)
				{ 
					System.out.println("m: "+m+"pivot: "+"array[m] :"+array[m]);
					int tr=array[m];
					array[m]=array[array.length-1];
					array[array.length-1]=tr;
					break;
					
				}
			}
		}
        for(int k=0;k<array.length;k++)
        {
            //sum=array[k];
            if(k>0)
            {
                sum=(sum*10)+array[k];
            }
            else{
                sum+=array[k];
            }
                
        }
        return sum;
            
        
        
    }
	public static void main(String args[])
	{
		int temp=9973;
		int temp2=maximumSwap(temp);
		System.out.println(temp2);
	}

}