class ZiFuChuanZhuanHuan{

	public static String reverse1(String str){
		return new StringBuilder(str).reverse().toString();
	}


	public static String reverse2(String str){
		char[] chars=str.toCharArray();
		String reverse="";
		for(int i=chars.length-1;i>=0;i--){
			reverse+=chars[i];
		}
		return reverse;
	}


	public static String reverse3(String str){
		String reverse ="";
		int length=str.length();
		for(int i=0;i<length;i++){
			reverse=str.charAt(i)+reverse;
		}
		return reverse;
	}


	public static void main(String[] args){
		String s="abc123";
		System.out.println("--------------");
		//直接调用charAt()逆序输出
		for(int i=s.length()-1;i>=0;i--){
			System.out.println(s.charAt(i));
		}
		System.out.println("---------------");
		System.out.println("变换前："+s);
		//第一种转换方式：直接调用库中的方法
		System.out.println("变换后："+reverse1(s));
		//先把字符串转换成单个字符，设置一个空的字符串来进行倒数相加
		System.out.println("变换后："+reverse2(s));
		//正序输出法
		System.out.println("变换后："+reverse3(s));
	}
}