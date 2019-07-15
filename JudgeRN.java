import java.util.Scanner;
/* 编写程序，判断给定的某个年份是否是闰年。
      闰年的判断规则如下：
      （1）若某个年份能被4整除但不能被100整除，则是闰年。
      （2）若某个年份能被400整除，则也是闰年。
 
 */
class JudgeRN{
	public static void main(String []args){
		int n;
		System.out.println("请输入年份：");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<0||n>3000){
			System.out.println("输入的年份有误！");
			System.exit(0);
		}
		//if(n%4==0&&n%100!=0||n%400)可以达到同样效果
		if(n%4==0&&n%100!=0)
			System.out.println("n是闰年。");
		else if(n%400==0)
			System.out.println("n是闰年。");
		else 
			System.out.println("n不是闰年。");
	}
}