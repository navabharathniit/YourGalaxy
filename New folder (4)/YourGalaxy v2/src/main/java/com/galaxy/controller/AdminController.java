package com.galaxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.galaxy.dao.ProductDao;
import com.galaxy.model.Product;

@Controller
public class AdminController {
	@Autowired
	ProductDao productdao;
	@RequestMapping("/admin")
	public ModelAndView admin()
	{
System.out.println("in admin");
return new ModelAndView("admin");
}
	@RequestMapping("/addproduct")
	public ModelAndView addproduct()
	{
		Product product=new Product();
System.out.println("in addproduct()");
return new ModelAndView("addproduct","pro",product);
}
	@RequestMapping("/addTheProduct")
	public ModelAndView addTheProduct(@ModelAttribute("pro") Product product)
	{
		productdao.addProduct(product);

return new ModelAndView("viewproducts");
}
}
