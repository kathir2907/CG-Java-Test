package capgemini.hmrctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartCalculatorAppleOfferTest extends ShoppingCartTestCommon {
	
	private static final String APPLE = "Apple";

	ShoppingCartCalculator shoppingCartCalculator = new ShoppingCartCalculatorAppleOffer();

	@Test
	public void checkoutOneApple(){
		assertEquals(60,shoppingCartCalculator.checkoutCart(getProductList(1, APPLE)), 0.001);
	}
	
	@Test
	public void checkoutTwoApples(){
		assertEquals(60,shoppingCartCalculator.checkoutCart(getProductList(2, APPLE)), 0.001);
	}

	@Test
	public void checkoutThreeApples(){
		assertEquals(120,shoppingCartCalculator.checkoutCart(getProductList(3, APPLE)), 0.001);
	}
	@Test
	public void checkoutFourApples(){
		assertEquals(120,shoppingCartCalculator.checkoutCart(getProductList(4, APPLE)), 0.001);
	}
	
}
