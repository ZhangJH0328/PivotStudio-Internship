package task2;
import java.util.Scanner;
public class Task2 {
	public static void doSomething() {
	}
	
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();//开始计时
		doSomething();
		Scanner in=new Scanner(System.in);
		
		
		  int i;
	        int j=0;
	        int count=0;
	        int n=in.nextInt();
	        
	        for (i=1;i<=n;i+=2)//偶数必然不是素数，减少遍历的数据量
	        {
	            for(j=2;j<=Math.sqrt(i);j++)//一个数的因数中，如果存在除了1以外的比它的平方根还要小的数，那么这个数不是素数
	            {
	                if(i%j == 0)
	                    break;
	            }
	            if (j>Math.sqrt(i))//“众多”因数中只有1比它的平方根小，那它即是素数
	            {
	                count++;
	            }
	        }
	        System.out.printf("一共有%d个素数 ",count);
	        long endTime=System.currentTimeMillis(); //结束计时
	        System.out.printf("程序运行时间："+(endTime-startTime)+"ms");
	        
	}
}
