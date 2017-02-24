package com.win.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.win.domain.Catalog;
import com.win.domain.CatalogRepository;

@Service
public class CatalogService {
	@Autowired
	private CatalogRepository catalogRepository;
	
	public void insertCatLog(Catalog catalog ){
		catalog.setCreateTime(new Date());
		
		catalogRepository.save(catalog);
		
	}
}
