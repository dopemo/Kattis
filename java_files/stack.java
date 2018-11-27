import java.util.*;

public class stack{
    public static void stack(ArrayList<String> stacks,int n)
    {
        String[]array=new String[n];
        int[] num_array=new int[n];
        int j=0;
        System.out.print("\n");
        
        for(String i : stacks)
        {
            if('0'>i.charAt(0) || '9'<i.charAt(0))
            {
                String[] splited = i.split("\\s+");
                 int radius=Integer.parseInt(splited[1]);
                array[j]=splited[0];
                num_array[j]=radius*2;
                j++;
            }
            else
            {
                String[] splited=i.split("\\s+");
                int diameter=Integer.parseInt(splited[0]);
                int radius=diameter;
                array[j]=splited[1];
                num_array[j]=radius;
                j++;
            }
            
        }
        for(int k=0;k<array.length-1;k++)
        {
          int min_idx=k;
            for(int l=k+1;l<array.length;l++)
            {
                
                if(num_array[l]<num_array[min_idx])
                {
                    min_idx=l;
                   
                }
            }
            String temp=array[min_idx];
            array[min_idx]=array[k];
            array[k]=temp;
            int temp2=num_array[min_idx];
            num_array[min_idx]=num_array[k];
            num_array[k]=temp2;
            
        }
        for(int k=0;k<array.length;k++)
        {
            System.out.println(array[k]);
        }
        
          
        
        
        
   
    }
    public static void main(String args[]) {
       Scanner bucky=new Scanner(System.in);
            String input=bucky.nextLine();
            int temp=Integer.parseInt(input);
            ArrayList<String> list=new ArrayList<String>();
            for(int i=0;i<temp;i++)
            {
                String a=bucky.nextLine();
                list.add(a);
                //System.out.println(a);
            }
            //System.out.println(temp);
            stack(list,temp);
            
            
        
    }
}