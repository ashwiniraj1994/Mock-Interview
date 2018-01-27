public class ReverseString {
	public String reverseString(String str) {
		String reverse = "";
		if(str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0,str.length() - 1));
			return reverse;
		}
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		String r = rs.reverseString("ashu");
    System.out.println(r);
	}
}
