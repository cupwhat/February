package com.win.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.win.domain.Catalog;
import com.win.service.CatalogService;

@Controller
@RequestMapping("/catalog")
public class CatalogController {
	@Autowired
	private CatalogService catalogService;
	
	
	@RequestMapping(value={""}, method=RequestMethod.GET)
	public String catalog(){
		return "catalog";
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(Catalog catalog){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		catalogService.insertCatlog(catalog);
		return JSON.toJSONString(resultMap);
	}
	
	

}
