package com.win.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.win.common.Constant;
import com.win.domain.Catalog;
import com.win.domain.CatalogRepository;

@Service
public class CatalogService {
	@Autowired
	private CatalogRepository catalogRepository;
	
	/**
	 * @param catalog
	 */
	public void insertCatlog(Catalog catalog ){
		//设置创建时间　当前服务器时间
		catalog.setCreateTime(new Date());
		//设置状态　有效
		catalog.setStatus(Constant.STATUS_VALID);
		catalogRepository.save(catalog);
	}
	
	public List<Catalog> getCatalogs(){
		List<Catalog> list = new ArrayList<Catalog>();
		
		return list;
	}
}
