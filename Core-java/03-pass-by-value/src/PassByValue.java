public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,20,30,40,50};
		incrementNumbersByOne(numbers);
		for(int x : numbers) {
			System.out.println(x);
		}
		
	}
	private static void incrementNumbersByOne(int[] numbers) {
//		for(int x:numbers) {
//			x=x+1;
//		}
		for(int i=0;i<numbers.length;i++) {
			numbers[i]+=1;
		}
		
	}
}

// variables are passed by value
// arrays are passed by reference  (except using enhanced for looop)
