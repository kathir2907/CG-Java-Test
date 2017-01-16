package capgemini.hmrctest;

import java.util.List;

public class ShoppingCartCalculatorOrangeOffer implements ShoppingCartCalculator {

	@Override
	public double calculateTotalCost(long totalOranges){
		return ((totalOranges/3) * 2 * FruitEnum.ORANGE.getCost() ) + (totalOranges % 3 * FruitEnum.ORANGE.getCost() );
	}
	
	@Override
	public long countProduct(List<String> productList){
		return productList.stream().filter(item -> item.equalsIgnoreCase(FruitEnum.ORANGE.getName())).count();
	}
	
}
