package ua.com.coolshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.coolshop.entity.Phones;

public interface PhoneRepository extends JpaRepository<Phones, Integer>{

}
