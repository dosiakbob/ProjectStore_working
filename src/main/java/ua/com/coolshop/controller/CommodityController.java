package ua.com.coolshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.com.coolshop.entity.Commodity;
import ua.com.coolshop.service.CommodityService;

@Controller
public class CommodityController {

	@Autowired
	private CommodityService commodityService;

	@RequestMapping(value = "/commodity", method = RequestMethod.GET)
	public String commodityPage(Model model) {
		model.addAttribute("commodities", commodityService.findAll());

		return "commodities";
	}

	@RequestMapping(value = "/addcommodity", method = RequestMethod.POST)
	public String saveCommodity(@ModelAttribute Commodity commodity) {
		commodityService.save(commodity);
		return "/home";
	}

	@RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
	public String deleteCommodity(@PathVariable String id) {

		commodityService.delete(Integer.parseInt(id));

		return "redirect:/commodity";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String updateCommodity(@PathVariable String id, Model model) {
		Commodity commodity = commodityService.findOne(Integer.parseInt(id));

		model.addAttribute("commodityForUpdate", commodity);
		return "updateCommodityt";

	}
	
	@RequestMapping(value="/update/saveUpdateCommodity/{id}", method=RequestMethod.POST)
	public String update(@PathVariable String id, @RequestParam String newName, @RequestParam String newPrice){
		
		Commodity commodity = commodityService.findOne(Integer.parseInt(id));
		
		commodity.setName(newName);

		commodity.setPrice(newPrice);
		
		commodityService.save(commodity);
		
		
		return "redirect:/ingredient";
		
	}

}
