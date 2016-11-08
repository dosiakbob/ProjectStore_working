package ua.com.coolshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.coolshop.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
