package Lec_03;
import java.util.*;
public class Replace_0_with_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int i=1;
		while(n!=0)
		{
			int rem=n%10;
			if(rem==0)
			{
				rem=5;
			}
			
			ans=ans+rem*i;
			i=i*10;
			n/=10;
		}
		if(ans==0)
		{
			ans=5;
		}
		System.out.println(ans);
	}

}
