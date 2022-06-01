import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n*10];
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		int c = 0;
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[j]>a[i])
		        {
		            set.add(a[j]-a[i]);
		            c++;
		        }
		    }
		}
		if(c==0)
		{
		    System.out.println(0);
		}
		else{
		    System.out.print(set.last());
		}
		
	}
}
