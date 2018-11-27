import java.util.*;

class Ladder{
	
	public static int ladder(double h, double d)
	{
		double meters=h/100;
		double redian=Math.toRadians(d);
		double sin_d=Math.sin(redian);
		double answer=meters/sin_d;
		double answer2=Math.round(answer*100);
		if(((answer*100)%answer2)<5){
		//int a= (int) 
			return (int) Math.round((answer*100))+1;
		}
		return (int) answer2;
		//int a = (int) Math.round(doubleVar);
	}
	
	public static void main(String args[]){
		int count=0;
		Scanner bucky=new Scanner(System.in);
		double x=bucky.nextDouble();
		double n=bucky.nextDouble();
		int func=ladder(x,n);
		System.out.println(func);
		
			
			
		}
}