package capgemini.hmrctest;

import java.util.List;

public class ShoppingCartCalculatorAppleOffer implements ShoppingCartCalculator {

	@Override
	public double calculateTotalCost(long totalApples){
		return ((totalApples/2) * FruitEnum.APPLE.getCost() ) + (totalApples % 2 * FruitEnum.APPLE.getCost() );
	}
	
	@Override
	public long countProduct(List<String> productList){
		return productList.stream().filter(item -> item.equalsIgnoreCase(FruitEnum.APPLE.getName())).count();
	}
	
	
}
