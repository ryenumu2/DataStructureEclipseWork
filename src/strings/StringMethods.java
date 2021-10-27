 package strings;

public class StringMethods {
	
	String s = "hello world";
	
	public StringMethods() {
	}
	
	public char characterAt() {
		return s.charAt(3); //print out 3rd INDEX character. Index of 1st character is 0, 2nd is 1, etc.
	}
	
	public int comparingTwoWords(String words) {
			return s.compareTo(words); 
	}

	
	public static void main(String[] args) {
		
		StringMethods m = new StringMethods();
		System.out.println(m.characterAt());
		System.out.println(m.comparingTwoWords("hello world")); //should return 0: both phrases are identical
		System.out.println(m.comparingTwoWords("hell")); //should return 7: hello world is 7 characters longer than hell
		
		String str1 = "hi";
		String str2 = "whatisupmyfellowpeople";
		System.out.println(str1.concat("my").concat("name").concat("is").concat("death")); //will output "himynameisdeath", no spaces
		
		System.out.println(str2.length()); //will print 22, the length of the string
		//String operations to finish typing up:
		//contains("aba"), endsWith("YZ"), indexOf("needle"), indexOf("needle", 12), 
		//indexOf('A'), indexOf('B', offset), lastIndexOf("needle"), length(), 
		//replace('a', 'A'), replace("a" "ABC"), foo::bar::abc.split("::"),
		//startsWith(prefix), startsWith("www", "http://".length()), 
		
		System.out.println(str2.substring(8)); //start at 0, go 8 characters to right, START with 'myfellowpeople' (will be suffix, not prefix)
		System.out.println(str2.substring(8,13)); //myfel: will not include the last character
		//substring(1),
		//substring(1,5).toCharArray(), toLowerCase(), and trim()
		
		StringBuilder firstString = new StringBuilder("Hey guys sorry for being so melancholy,");
		firstString.append(" rough week, lol");
		System.out.println(firstString);
		System.out.println(firstString.charAt(4));
		System.out.println(firstString.delete(10,12)); //start is inclusive, end is exclusive
		
		int con = '3' - '1';
		System.out.println(con); //shows you can subtract two characters of type String and get an integer back
		System.out.println(firstString.append(3)); //shows that you can append number to a string
		
		
		//StringBuilder:
		//append(), charAt(), delete(), deleteCharAt(), insert(), replace(), toString()
	}
}