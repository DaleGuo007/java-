/* ��  a+aa+aaa+.......+aaaaaaaaa=?
      ����aΪ1��9֮�е�һ����������ҲҪ����ָ����
  */
  import java.util.Scanner;
  class Series{
	  public static void main(String []args){
		  int sum=0;
		  int n=0;
		  int a;
		  System.out.println("��Ŀ��a+aa+aaa+.......+aaaaaaaaa=");
		  Scanner sc=new Scanner(System.in);
		  System.out.println("������1~9�е�����һ�����֣�����");
		  a=sc.nextInt();
		  System.out.println("������1~9�е�����һ�����֣�����");
		  int num=sc.nextInt();
		  for(int i=1;i<=num;i++){
			  if(i>1)
				  a=a*10;
			  
			  n=a+n;
			  sum=sum+n;
		  }
		  System.out.println("���ǣ�"+sum);
	  }
  }