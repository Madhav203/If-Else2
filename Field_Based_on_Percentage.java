
class Field{
	public static void main(String[] args){

		float percent = 86.20f;

		if (percent > 100.00 || percent < 0){
			System.out.println("Enter the valid percentage");
		}else if(percent > 85.00){
			System.out.println("Medical");
		}else if(percent <= 85.00 && percent>75.00){
			System.out.println("Engineering");
		}else if(percent <= 75.00 && percent >= 65){
			System.out.println("Pharmacy or bachelor in science");
		}else{
			System.out.println("Auto Rikshaw");
		}

	}
}
