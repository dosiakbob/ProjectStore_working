package ua.com.coolshop.service;

import java.util.List;

import ua.com.coolshop.entity.Phones;

public interface PhoneService {

	
	void save(PhoneService phoneService);
	List<Phones> findall();
	Phones findOne(int id);
	
	void delete(int id);
	
}
