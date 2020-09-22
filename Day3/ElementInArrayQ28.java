import java.util.*;
class ElementInArrayQ28
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of rows and cols :-");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		int cntOneD = 0;
		int cntTotalEle = 0;
		for(int i=0;i<r;i++)
		{
			cntOneD++;
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
				cntTotalEle++;	
			}
		}
		System.out.println("No of 1-D Arrays :- "+cntOneD);
		System.out.println("No of Element :- "+cntTotalEle);
	}
}