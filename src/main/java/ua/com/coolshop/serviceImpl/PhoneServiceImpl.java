package ua.com.coolshop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.com.coolshop.repository.PhoneRepository;
import ua.com.coolshop.service.PhoneService;

public class PhoneServiceImpl implements PhoneService {

	@Autowired private PhoneRepository phoneRepository;
	
	public void save(PhoneService phoneService) {
		phoneService.save(phoneService);
		
	}

	public List<Phones> findall() {
	
		return phoneRepository.findAll();
	}

	public Phones findOne(int id) {
	
		return phoneRepository.findOne(id);
	}

	public void delete(int id) {
		phoneRepository.delete(id);
		
	}

}
