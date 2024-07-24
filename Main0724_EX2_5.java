package demo;

public class Main0724_EX2_5 {
	
	private static final String NAME_1 = "HELLO";
	
	public static void main(String args[]) {
		String s1 = NAME_1;
		String s2 = new String(NAME_1);
		String s3 = s2.intern();
		String s4 = s1.toString();
		StringBuilder sb1 = new StringBuilder(s1);
		String s5 = sb1.toString();
		
		System.out.println(s1 == s2);
		System.out.println("new String("+"\"Hello\""+"):"+s2);
		System.out.println(s1 == s3);
		System.out.println("s1.intern():"+s3);
		System.out.println(s1 == s5); 
		System.out.println("sb1.toString():"+s5);
		
		System.out.println("***");
		System.out.println("Stringオブジェクトか確認用");
		boolean result1 = s1 instanceof String;
		System.out.println("s1:"+ result1);
		
		boolean result2 = s2 instanceof String;
		System.out.println("s2:"+ result2);
		
		boolean result3 = s3 instanceof String;
		System.out.println("s3:"+ result3);
		
		boolean result4 = s4 instanceof String;
		System.out.println("s4:"+ result4);
		
		boolean result5 = s5 instanceof String;
		System.out.println("s5:"+ result5);
		
		Object obj = sb1;
		if(!(obj instanceof String)) {
			System.out.println("sb1の変数は、Stringオブジェクトではありません");
		}
		
		int shinjuku = 100;
		Object obj2 = shinjuku;
		if(!(obj2 instanceof String)) {
			System.out.println("shinjukuの変数は、Stringオブジェクトではありません");
		}
		if(obj2 instanceof Integer) {
			System.out.println("shinjukuの変数は、Integerオブジェクトです");
		}
		if(!(obj2 instanceof Boolean)) {
			System.out.println("shinjukuの変数は、Booleanオブジェクトではありません");
		}
		
		System.out.println("***");
		System.out.println("コンパイルエラーが発生しないもの");
		
		var a = -1___00;
		var d = 0xf_f_f_fL;
		
		System.out.println("a="+a);
		System.out.println("d="+d);		
		
		
	}
}
