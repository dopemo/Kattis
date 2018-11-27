import java.util.*;


class Tarifa{
	
	public static int func(int x, int n, int array[]){
		int nex_month=x;
		//calculating if pero has remaining bytes letf
		for (int i=0;i<n;i++){
			//he does add his remaining bytes to next month bytes
			if(array[i]<nex_month)
			{
				nex_month=(nex_month-array[i]);
			}
			else{
				nex_month=0;
			}
			nex_month+=x;
		}
		return nex_month;
	}
	
	
	public static void main(String args[]){
		/*
		int x=15;
		int n=3;
		int[] array=new int[n];
		array[0]=15;
		array[1]=10;
		array[2]=20;
		
		*/
		int count=0;
		Scanner bucky=new Scanner(System.in);
		int x=bucky.nextInt();
		int n=bucky.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=bucky.nextInt();
		}
		int next_month=func(x,n,arr);
		System.out.println("\n"+next_month);
			
			
		}
		
}
	

