import java.util.*;
public class Volim{
	public static int volim(String array[],int n,int turn)
	{
		int exp_time=210;
		int time=0;
		for(int i=0;i<n;i++)
		{
			String[] splited=array[i].split("\\s");
			time+=Integer.parseInt(splited[0]);
			if(splited[1].equals("T"))
			{
				if(time>=210)
				{
					return turn;
				}
				if(turn==8)
				{
					turn=1;
				}
			    else
				{
					turn++;
				}
			}
			else
			{
				if(time>=210)
				{
					return turn;
				}
			
			}
			
		}
		return turn;
	}

	public static void main(String args[])
	{
		Scanner bucky=new Scanner(System.in);
        String input=bucky.nextLine();
        int turn=Integer.parseInt(input);
		String turn1=bucky.nextLine();
		int n=Integer.parseInt(turn1);
		String[]array=new String[n];
		String[]test_arr=new String[]{"100 T","100 N","100 T","100 T","100 N"};

		
		
		
		
		for(int i=0;i<n;i++)
		{
			String pop;
			pop=bucky.nextLine();
			//System.out.println(" "+pop);
			array[i]=pop;
		}
		int answ=volim(array,array.length,turn);
		System.out.println(answ);
		
	}

}