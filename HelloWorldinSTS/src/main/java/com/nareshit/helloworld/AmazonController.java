package com.nareshit.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/amazon")
//AmazonController is registered with DispatcherServlet with amazon keyname
//http://localhost:8080/amazon ==>AmazonController obj=ioc.getAmazonController();
public class AmazonController {



	//Product
	@RequestMapping(value="/product")
	//http://localhost:8080/amazon/product===> obj.getProducts();
	public String getProducts() {
		return " TV, WASHING MACHINE,AC, FREEZER ...";
	}






	//Customer
	@RequestMapping(value="/customer")
	//http://localhost:8080/amazon/customer ==> obj.getCustomer();
	public String getCustomer() {
		return "Hello Vijay Kumar....!";
	}


	//Payment

	@RequestMapping(value="/payment")
	//http://localhost:8080/amazon/payment ==> obj.getPaymentDetails();
	public String getPaymentDetails() {
		return "Google Pay is instanatiated";
	}


	//Shipment
	@RequestMapping(value="/shipment")
	//http://localhost:8080/amazon/shipment ==> obj.getShipment();
	public String getShipment() {
		return "Blue Dart is our Shipping Agent";
	}





}
