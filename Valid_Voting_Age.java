class VoterAge{
	public static void main(String[] args){

		byte age = 65;

		if(age < 0){
			System.out.println("Please enter the valid age");
		}else if(age<18){
			System.out.println("Non valid age for voting");
		}else{
			System.out.println("Valid age for voting");
		}

	}
}


