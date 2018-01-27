public class ReverseNum {
int reverse = 0;
	public int reverseNum(int num) {
		while(num != 0){
            reverse = (reverse*10)+(num%10);
            num = num/10;
        }
        return reverse;
	}

	public static void main(String[] args) {
		ReverseNum rn = new ReverseNum();
		int r = rn.reverseNum(234);
		System.out.println(r);
	}
}
