import java.util.Scanner;
/*����һ���ٷ��Ƶķ����������Ӧ�ĵȼ���
        90������        A��
        80~89          B��
        70~79          C��
        60~69          D��
        60������        E��
 */
class ABCDE{
	public static void main(String []agrs){
		System.out.println("���������ķ�����");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<0||n>100){
			System.out.println("����������������������룺");
			n=sc.nextInt();
		}
		if(n>=90)
			System.out.println("�������ĵȼ�ΪA��");
		else if(n>=80&&n<90)
			System.out.println("�������ĵȼ�ΪB��");
		else if(n>=70&&n<80)
			System.out.println("�������ĵȼ�ΪC��");
		else if(n>=60&&n<70)
			System.out.println("�������ĵȼ�ΪD��");
		else
			System.out.println("�������ĵȼ�ΪE��");
		
	}
}