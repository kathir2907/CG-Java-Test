package capgemini.hmrctest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingCartCalculatorOrangeOfferTest extends ShoppingCartTestCommon {
	
	private static final String ORANGE = "Orange";

	ShoppingCartCalculator shoppingCartCalculator = new ShoppingCartCalculatorOrangeOffer();

	@Test
	public void checkoutOneOrange(){
		assertEquals(25,shoppingCartCalculator.checkoutCart(getProductList(1, ORANGE)), 0.001);
	}

	@Test
	public void checkoutTwoOranges(){
		assertEquals(50,shoppingCartCalculator.checkoutCart(getProductList(2, ORANGE)), 0.001);
	}
	
	@Test
	public void checkoutThreeOranges(){
		assertEquals(50,shoppingCartCalculator.checkoutCart(getProductList(3, ORANGE)), 0.001);
	}

	@Test
	public void checkoutFourOranges(){
		assertEquals(75,shoppingCartCalculator.checkoutCart(getProductList(4, ORANGE)), 0.001);
	}
}