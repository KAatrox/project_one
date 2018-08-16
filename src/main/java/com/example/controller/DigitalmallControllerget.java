package com.example.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mapper.DigitalmallMapper;

@Controller
public class DigitalmallControllerget {
	@Autowired
	DigitalmallMapper digitalmallMapper;
	
	//商品详情页面
    @GetMapping("/mysingle")
    public String index(){
    	return "mysingle";
    }
    
	@GetMapping("/login")
    public String login(){
    	return "login";
    }
	
	@GetMapping("/about")
    public String about(){
    	return "about";
    }
	
	@GetMapping("/card")
    public String card(){
    	return "card";
    }
	
	@GetMapping("/contact")
    public String contact(){
    	return "contact";
    }
	
	@GetMapping("/faq")
    public String faq(){
    	return "faq";
    }
	
	@GetMapping("/help")
    public String help(){
    	return "help";
    }
	
	@GetMapping("/marketplace")
    public String marketplace(){
    	return "marketplace";
    }
	
	@GetMapping("/offers")
    public String offers(){
    	return "offers";
    }
	
	@GetMapping("/privacy")
    public String privacy(){
    	return "privacy";
    }
	
	@GetMapping("/products")
    public String products(){
    	return "products";
    }
	
	@GetMapping("/products1")
    public String products1(){
    	return "products1";
    }
	
	@GetMapping("/products2")
    public String products2(){
    	return "products2";
    }
	
	@GetMapping("/products3")
    public String products3(){
    	return "products3";
    }
	
	@GetMapping("/products5")
    public String products5(){
    	return "products5";
    }
	
	@GetMapping("/products6")
    public String products6(){
    	return "products6";
    }
	
	@GetMapping("/products7")
    public String products7(){
    	return "products7";
    }
	
	@GetMapping("/products8")
    public String products8(){
    	return "products8";
    }
	
	@GetMapping("/products9")
    public String products9(){
    	return "products9";
    }
	
	@GetMapping("/signup")
    public String signup(){
    	return "signup";
    }
	
	@GetMapping("/single")
    public String single(){
    	return "single";
    }
	
	@GetMapping("/sitemap")
    public String sitemap(){
    	return "sitemap";
    }
	
	@GetMapping("/values")
    public String values(){
    	return "values";
    }
	
	@GetMapping("/order")
    public String order(){
    	return "order";
    }
	
	@GetMapping("/wallet")
    public String wallet(){
    	return "wallet";
    }
	
	@GetMapping("/spbytype")
    public String spbytype(){
    	return "searchproducts";
    }
	
	@GetMapping("/cart")		//购物车页面
    public String cart(Model model,
    	HttpSession session,HttpServletRequest request,	HttpServletResponse response
    	){
		HttpSession s1 = request.getSession();
		String username=(String) s1.getAttribute("username");
		System.out.println(username);
		model.addAttribute("cartdata",digitalmallMapper.showcart(username));
    	return "cart";
    }
	
	@GetMapping("/cartdata")
    public String cart1(){
    	return "cart";
    }
	
	@GetMapping("forget")
    public String forget(){
    	return "forget";
    }
}