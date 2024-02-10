class Pythagorean{
	public static void main(String[] args){

		int a = 3;
		int b = 4;
		int c = 5;

		if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (c*c + b*b == a*a)){
			System.out.println("It is a pythagorean triplet");
		}else{
			System.out.println("It is not a pythagorean triplet");
		}

	}
}


