package task2;
import java.util.Scanner;
public class Task2 {
	public static void doSomething() {
	}
	
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		doSomething();
		Scanner in=new Scanner(System.in);
		
		
		  int i;
	        int j=0;
	        int count=0;
	        int n=in.nextInt();
	        
	        for (i=1;i<=n;i+=2)
	        {
	            for(j=2;j<=Math.sqrt(i);j++)
	            {
	                if(i%j == 0)
	                    break;
	            }
	            if (j>Math.sqrt(i))
	            {
	                count++;
	            }
	        }
	        System.out.printf("һ����%d������ ",count);
	        long endTime=System.currentTimeMillis(); 
	        System.out.printf("��������ʱ�䣺"+(endTime-startTime)+"ms");
	        
	}
}
