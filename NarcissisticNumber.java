/* Narcissistic number
	������е�ˮ�ɻ�������νˮ�ɻ�����ָһ����3λ���������λ���������͵����䱾��
   ���磺 153 = 1*1*1 + 3*3*3 + 5*5*5  
 */
 class NarcissisticNumber{
	 public static void main(String []args){
		 for(int n=100;n<1000;n++){
			 int a=n/100;
			 int b=(n%100)/10;
			 int c=n%10;
			 if(n==a*a*a+b*b*b+c*c*c)
				 System.out.println("Ԫ�أ�"+n);
		 }
	 }
 }