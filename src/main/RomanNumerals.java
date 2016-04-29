package main;

public class RomanNumerals {
	
	private String addInitValue(String result, final int number){
		if(number < 5){
			if(number < 4)
				result += addI("I", 2, number);
			else
				result+= "IV";
		}
		else if(number < 10){
			if(number < 9)
				result += addI("V", 6,number);
			else 
				result += "IX";
		}
		else if(number == 10){
			result += "X";
		}
		else {
			return "-1";
		}
			
		return result;
	}
	
	private String addI (String roman,int init,int number){	
		for(int i=init, len=number; i<=len; i++){
			roman += "I";
		};
		return roman;
	}
	
	public String toRomanNumerals(int number){
		String result  ="-1";
		if(number <=10){
			result =addInitValue("",number);
		} else {
			result =addInitValue("X",number-10);
		}
		return result;
	}
}
