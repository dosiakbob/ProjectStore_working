package ua.com.coolshop.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.com.coolshop.entity.Role;
import ua.com.coolshop.entity.User;
import ua.com.coolshop.repository.UserRepository;
import ua.com.coolshop.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired

    private UserRepository userrepository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public void save(User user) {
        user.setRole(Role.ROLE_USER);
        user.setPassword(encoder.encode(user.getPassword()));
        userrepository.save(user);

    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return userrepository.findAll();
    }

    @Override
    public User findOne(int id) {
        // TODO Auto-generated method stub
        return userrepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        userrepository.delete(id);
    }


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return (UserDetails) userrepository.findByUsername(username);
    }
}
