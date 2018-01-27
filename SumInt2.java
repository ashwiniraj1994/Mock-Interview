public class SumInt2 {
  int sum = 0;
	public int sumInt(int num) {
		if(num == 0) {
			return sum;
		} else {
			sum += (num % 10);
			sumInt(num/10);
		}
		return sum;
	}

	public static void main(String[] args) {
		SumInt2 si = new SumInt2();
		int result = si.sumInt(1924);
    System.out.println(result);
	}
}
