package ua.com.coolshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.coolshop.entity.Commodity;
import ua.com.coolshop.service.CommodityService;

@Controller
public class CommodityController {

	@Autowired
	private CommodityService commodityService;

	@RequestMapping(value = "/ingredient", method = RequestMethod.GET)
	public String ingredientPage(Model model) {
		model.addAttribute("commodities", commodityService.findAll());

		return "commodities";
	}

	@RequestMapping(value = "/newCommodity", method = RequestMethod.POST)
	public String saveCommodity(@RequestParam String commodityName, @RequestParam String commodityAmount) {

		commodityService.save(new Commodity(commodityName, commodityAmount));
		return "redirect:/commodity";
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
	public String update(@PathVariable String id, @RequestParam String newName, @RequestParam String newAmount){
		
		Commodity commodity = commodityService.findOne(Integer.parseInt(id));
		
		commodity.setName(newName);
		commodity.setAmount(newAmount);
		
		commodityService.save(commodity);
		
		
		return "redirect:/ingredient";
		
	}

}
