package capgemini.hmrctest;

import java.util.List;

public interface ShoppingCartCalculator {
	
	abstract double calculateTotalCost(long totalProductCount);
	
	abstract long countProduct(List<String> productList);
	
	default public double checkoutCart(List<String> productList){
		long totalProducts = countProduct(productList);
		return calculateTotalCost(totalProducts);
	}

}
