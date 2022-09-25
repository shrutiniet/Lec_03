package Lect_03;
import java.util.*;
public class Replace0with5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=0;
        int i=1;
        while(n>0)
        {
            int rem=n%10;
            if(rem==0)
            {
                rem=5;
            }
            value=rem*i+value;
            i=i*10;
            n=n/10;
        }
        System.out.println(value);
		
	}

}
