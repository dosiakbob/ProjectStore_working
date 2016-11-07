package ua.com.coolshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.coolshop.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
