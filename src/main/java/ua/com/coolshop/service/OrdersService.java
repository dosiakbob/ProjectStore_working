package ua.com.coolshop.service;

import org.springframework.stereotype.Service;
import ua.com.coolshop.entity.Orders;

import java.util.List;

@Service
public interface OrdersService {

    void save(Orders orders);

    List<Orders> findAll();

    Orders findOne(int id);

    void delete(int id);

    List<Orders> findAllByFetch();
}
