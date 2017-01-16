package capgemini.hmrctest;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTestCommon {
	
	protected List<String> getProductList(int count, String product){
		List<String> applesList = new ArrayList<String>();
		for(int index=0; index < count;index++){
			applesList.add(product);
		}
		return applesList;
	}

}
