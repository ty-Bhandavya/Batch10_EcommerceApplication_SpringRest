package com.te.ecommercespringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ecommercespringrest.bean.ItemBean;
import com.te.ecommercespringrest.dao.ItemDAO;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDAO dao;

	public ItemBean getEmpData(Integer id) {
		return dao.getEmpData(id);
	}

	public boolean addItem(ItemBean Bean) {
		return dao.addItem(Bean);
	}

	public boolean updateItem(ItemBean infoBean) {
		return dao.updateItem(infoBean);
	}

	@Override
	public boolean deleteItem(Integer id) {
		return dao.deleteItem(id);
	}

	@Override
	public List<ItemBean> getAllEmployeeDetails() {
		return dao.getAllEmployeeDetails();
	}

}
