package com.example.app.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.dao.MerchantAppDao;
import com.example.domain.entity.MerchantApp;

@Controller
public class HomeController {
	
	@Autowired
	MerchantAppDao merchantAppDao;
	
	@ResponseBody
	@GetMapping("/home")
	MerchantApp home() {
		MerchantApp ps = merchantAppDao.selectById(3);
		return ps;
	}
}
