package StrManipulation;

public class StringOperation {
	public static void main(String arg[])
	
	{
		String str1="            All Products (52)            ";
		String str2=new String();
		str2=str1.trim();
		str1=str2;
		System.out.println("String after removing the spaces:"+str2);
		str2=str1.toLowerCase();
		System.out.println("String after converting into lowercase:"+str2);
		if(str1.contains("52"))
			System.out.println("Yes.The String contains 52");
		else
			System.out.println("No.The String doesn't have" );
		str2=str1.replace('(','[');
		str1=str2;
		str2=str1.replace(')',']');
		System.out.println("String after replacing:"+str2);
		
		
			
		
		
	}
}
