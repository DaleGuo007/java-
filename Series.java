/* 求  a+aa+aaa+.......+aaaaaaaaa=?
      其中a为1至9之中的一个数，项数也要可以指定。
  */
  import java.util.Scanner;
  class Series{
	  public static void main(String []args){
		  int sum=0;
		  int n=0;
		  int a;
		  System.out.println("题目：a+aa+aaa+.......+aaaaaaaaa=");
		  Scanner sc=new Scanner(System.in);
		  System.out.println("请输入1~9中的任意一个数字：数字");
		  a=sc.nextInt();
		  System.out.println("请输入1~9中的任意一个数字：项数");
		  int num=sc.nextInt();
		  for(int i=1;i<=num;i++){
			  if(i>1)
				  a=a*10;
			  
			  n=a+n;
			  sum=sum+n;
		  }
		  System.out.println("答案是："+sum);
	  }
  }