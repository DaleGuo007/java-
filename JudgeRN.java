import java.util.Scanner;
/* ��д�����жϸ�����ĳ������Ƿ������ꡣ
      ������жϹ������£�
      ��1����ĳ������ܱ�4���������ܱ�100�������������ꡣ
      ��2����ĳ������ܱ�400��������Ҳ�����ꡣ
 
 */
class JudgeRN{
	public static void main(String []args){
		int n;
		System.out.println("��������ݣ�");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<0||n>3000){
			System.out.println("������������");
			System.exit(0);
		}
		//if(n%4==0&&n%100!=0||n%400)���Դﵽͬ��Ч��
		if(n%4==0&&n%100!=0)
			System.out.println("n�����ꡣ");
		else if(n%400==0)
			System.out.println("n�����ꡣ");
		else 
			System.out.println("n�������ꡣ");
	}
}