class RealTime{
	public static void main(String[] args){

		int score = 55;

		if(score < 0){
			System.out.println("Please enter a valid score");
		}else if(score >= 100){
			System.out.println("Prize = 1000 rs");
		}else if(score < 100 && score >=50){
			System.out.println("Prize = 500 rs");
		}else{
			System.out.println("No Prize");
		}
	}
}

