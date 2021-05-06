package com.te.ecommercespringrest.dao;

import java.util.List;

import com.te.ecommercespringrest.bean.ItemBean;

public interface ItemDAO {

	public ItemBean getEmpData(Integer aid);

	public boolean addItem(ItemBean Bean);

	public boolean updateItem(ItemBean infoBean);

	public boolean deleteItem(Integer id);

	public List<ItemBean> getAllEmployeeDetails();

}
