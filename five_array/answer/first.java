package five_array.answer;
import java.util.*;

public class first {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int[] scr = new int[10];

		int i, sum = 0, cnt = 0;

		for( i=0; i<scr.length; i++)
		{
			scr[i] = scn.nextInt();

			sum += scr[i];
			cnt++;
		}

		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %.1f",(double)sum/cnt);
	}
}