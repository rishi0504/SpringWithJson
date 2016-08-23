package net.javaonline.spring.restful.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.javaonline.spring.restful.model.ProductDetails;

public class GetProductDetailsDAO {
	static Map<String, ProductDetails> products = new HashMap<String, ProductDetails>();

	public GetProductDetailsDAO() {

		// product details to be retrieved from the database.

		products.put("1", new ProductDetails("1", "LCD TV", 60000, 4000));
		products.put("2", new ProductDetails("2", "LED TV", 70000, 5000));
		products.put("3", new ProductDetails("3", "AC", 40000, 3000));
		products.put("4", new ProductDetails("4", "Laptop", 50000, 1000));

	}

	public ProductDetails getProductDetails(String itemcode) {

		return products.get(itemcode);

	}

	public static ArrayList<ProductDetails> getAllProducts() {

		ArrayList<ProductDetails> list = new ArrayList<ProductDetails>();
		Iterator entries = products.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry entry = (Map.Entry) entries.next();
			String key = (String) entry.getKey();
			ProductDetails value = (ProductDetails) entry.getValue();
			list.add(value);
		}
		return list;
	}
}
