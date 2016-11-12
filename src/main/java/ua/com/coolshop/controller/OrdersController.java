package ua.com.coolshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.coolshop.entity.Commodity;

import ua.com.coolshop.entity.Orders;
import ua.com.coolshop.service.CommodityService;
import ua.com.coolshop.service.OrdersService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value="/orders", method= RequestMethod.GET)
    public String dish(Model model){
        model.addAttribute("orders", ordersService.findAllByFetch());
        model.addAttribute("commodities", commodityService.findAll());

        model.addAttribute("orders", new Orders());
        return "orders";
    }

    @RequestMapping(value="/newOrders", method=RequestMethod.POST)
    public String newOrders(@ModelAttribute Orders orders, @RequestParam String [] choosenCommodities){

//		Dish dish = new Dish();
//		dish.setName(dishName);
//		dish.setWeight(Double.parseDouble(dishWeight));


        List<Commodity> commodities = new ArrayList<Commodity>();

        for (int i = 0; i < choosenCommodities.length; i++) {
            commodities.add(commodityService.findOne(Integer.parseInt(choosenCommodities[i])));
        }


        orders.setCommodities(commodities);
        ordersService.save(orders);
        return "redirect:/orders";

    }
}
