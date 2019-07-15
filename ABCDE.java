import java.util.Scanner;
/*给定一个百分制的分数，输出相应的等级。
        90分以上        A级
        80~89          B级
        70~79          C级
        60~69          D级
        60分以下        E级
 */
class ABCDE{
	public static void main(String []agrs){
		System.out.println("请输入您的分数：");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<0||n>100){
			System.out.println("输入的数据有误，请重新输入：");
			n=sc.nextInt();
		}
		if(n>=90)
			System.out.println("您分数的等级为A。");
		else if(n>=80&&n<90)
			System.out.println("您分数的等级为B。");
		else if(n>=70&&n<80)
			System.out.println("您分数的等级为C。");
		else if(n>=60&&n<70)
			System.out.println("您分数的等级为D。");
		else
			System.out.println("您分数的等级为E。");
		
	}
}