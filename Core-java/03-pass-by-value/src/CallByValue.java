
public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		System.out.println(number);
		incrementByTen(number);
		System.out.println("aaaaa"+number);

	}
	private static void incrementByTen(int x){
		x+=10;
		System.out.println(x);
	}

}
