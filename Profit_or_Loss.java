class ProfitLoss{
	public static void main(String[] args){

		float costprice = 200f;
		float sellingprice = 450.65f;

		float PL = sellingprice - costprice;

		if(sellingprice > costprice){
			System.out.println("Profit of " + PL);
		}else if(sellingprice < costprice){
			System.out.println("Loss of " + PL);
		}else{
			System.out.println("No profit or loss");
		}

	}
}


