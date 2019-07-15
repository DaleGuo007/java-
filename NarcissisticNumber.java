/* Narcissistic number
	输出所有的水仙花数，把谓水仙花数是指一个数3位数，其各各位数字立方和等于其本身，
   例如： 153 = 1*1*1 + 3*3*3 + 5*5*5  
 */
 class NarcissisticNumber{
	 public static void main(String []args){
		 for(int n=100;n<1000;n++){
			 int a=n/100;
			 int b=(n%100)/10;
			 int c=n%10;
			 if(n==a*a*a+b*b*b+c*c*c)
				 System.out.println("元素："+n);
		 }
	 }
 }