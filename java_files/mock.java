import java.util.*;

public class mock{
	public static void mock(String array[])
	{
		int h=0;
		int count=0;
		String[] r_arr=new String[array.length];
		Hashtable files=new Hashtable();
		for(int i=0;i<array.length;i++)
		{
			String[] splitted=array[i].split("\\s");
			for(int j=1;j<splitted.length;j++)
			{
				String temp=splitted[j].substring(2,splitted[j].length());
				// System.out.println(temp);
				if(files.containsValue(temp))
				{
					int ddd=files.get(temp);
					r_arr[count]=splitted[0]+splitted[j];
					System.out.println("this is the key: "+ddd );
					count++;
					files.put(h,temp);
					h++;
					
				}
				else
				{
					files.put(h,temp);
					h++;
				
				}
			}
		
	}
	for(int m=0;m<count;m++)
	{
		System.out.print(r_arr[m]+" ");
	}
	System.out.print("\n");
    }
    public static void main(String args[]) {
		Hashtable h = new Hashtable();
       String[] array=new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
	   mock(array);
	   //System.out.println(array.length);
	   array[0]="hello";
	   array[1]="world!";
	   h.put(1,array[0]);
	   h.put(2,array[1]);
	   System.out.println(h);
	   boolean flag=h.containsValue("hell");
	   System.out.println(flag);
	   
	}
	   
            
        
    
}