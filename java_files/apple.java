import java.util.*;

class apple{
	
	
	public static void main(String args[]){
		
		int count=0;
		while(count==0){
			Scanner bucky=new Scanner(System.in);
			String num=bucky.nextLine();
			if(num.equals("exit"))
			{
				System.out.println("The program is finished!");
				break;
			}
			System.out.println(num);
			
		}
		
		
	}
}
