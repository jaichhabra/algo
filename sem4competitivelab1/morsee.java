// Java program to demonstrate Morse code 
class morsee 
{ 
	
	static String morseEncode(char x) 
	{ 
	
		
		switch (x) 
		{ 
			case 'a': 
				return ".-"; 
			case 'b': 
				return "-..."; 
			case 'c': 
				return "-.-."; 
			case 'd': 
				return "-.."; 
			case 'e': 
				return "."; 
			case 'f': 
				return "..-."; 
			case 'g': 
				return "--."; 
			case 'h': 
				return "...."; 
			case 'i': 
				return ".."; 
			case 'j': 
				return ".---"; 
			case 'k': 
				return "-.-"; 
			case 'l': 
				return ".-.."; 
			case 'm': 
				return "--"; 
			case 'n': 
				return "-."; 
			case 'o': 
				return "---"; 
			case 'p': 
				return ".--."; 
			case 'q': 
				return "--.-"; 
			case 'r': 
				return ".-."; 
			case 's': 
				return "..."; 
			case 't': 
				return "-"; 
			case 'u': 
				return "..-"; 
			case 'v': 
				return "...-"; 
			case 'w': 
				return ".--"; 
			case 'x': 
				return "-..-"; 
			case 'y': 
				return "-.--"; 
			 
			case 'z': 
				return "--.."; 
		} 
		return ""; 
	} 
	
	static void morseCode(String s) 
	{ 
		
		for (int i = 0;i<s.length(); i++) 
			System.out.print(morseEncode(s.charAt(i))); 
			System.out.println(); 
	} 
	
	
	public static void main (String[] args) 
	{ 
		String s = "Hello"; 
		morseCode(s); 
	} 
} 

// This code is contributed by Anant Agarwal. 
