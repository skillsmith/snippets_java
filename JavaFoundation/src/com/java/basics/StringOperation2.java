package StrManipulation;

public class StringOperation2 {
	public static void main(String arg[])
	{
		
		String str1="Mr. D'Souza went to 7/11 to buy beef jerky!";
		String str2=new String();
		str2=str1.replaceAll("[^a-zA-Z0-9 -]", "");
		System.out.println("String after removing special characters:"+str2);
		 str2="beef";
		int position=str1.indexOf(str2);
		System.out.println("The position of string beef is :"+position);
		str2=str1.replace("beef jerky!","peanut butter");
		System.out.println("The String after replace :"+str2);
		str2=str2.concat(":-)");
		System.out.println(str2);
		
		
		
	}

}
