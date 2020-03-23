package com.somkanya.maven.TDD_Junit;

public class First2Chars {

	public String remove(String string)
	{
		int stringLength = string.length();
		char FirstChar = string.charAt(0);
		char SecondChar = string.charAt(1);
		String remainingChars;
		
		if(FirstChar =='A' && SecondChar =='A')
		{
			remainingChars = string.substring(2, stringLength);
			return remainingChars;
		}
		else if(FirstChar == 'A')
		{
			remainingChars = string.substring(1, stringLength);
			return remainingChars;
		}
		else if(SecondChar == 'A')
		{
			remainingChars = string.substring(2, stringLength);
			return(FirstChar+remainingChars);
		}
		else
		{
			return string;
		}
	}
}
