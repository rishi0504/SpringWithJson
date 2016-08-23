package net.javaonline.spring.restful.controller;

import java.util.ArrayList;

import net.javaonline.spring.restful.java.GetProductDetailsDAO;
import net.javaonline.spring.restful.model.ProductDetails;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GetProductDetailsService {
	ObjectMapper mapper = new ObjectMapper();
	@RequestMapping("/getProduct")
	public @ResponseBody
	ArrayList<ProductDetails> getProduct() {
		GetProductDetailsDAO pdDao = new GetProductDetailsDAO();
		return GetProductDetailsDAO.getAllProducts();
	}

	@RequestMapping("/getProduct/{itemcode}")
	public @ResponseBody
	ProductDetails getProductMethod2(
			@PathVariable(value = "itemcode") String itemcode) {
		GetProductDetailsDAO pdDao = new GetProductDetailsDAO();
		return pdDao.getProductDetails(itemcode);
	}
}
