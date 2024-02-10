class Pass{
	public static void main(String [] args){

		float percent = 96.05f;

		if(percent > 100 || percent < 0){
			System.out.println("Please enter the valid percentage");
		}else if(percent >= 75){
			System.out.println("Pass: first class with distinction");
		}else if(percent < 75 && percent >= 65){
			System.out.println("Pass: first class");
		}else if(percent < 65 && percent >= 55){
			System.out.println("Pass: second class");
		}else if(percent < 55 && percent >= 35){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}

	}
}

