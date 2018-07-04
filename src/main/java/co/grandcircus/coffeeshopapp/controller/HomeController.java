package co.grandcircus.coffeeshopapp.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.coffeeshopapp.dao.ItemDao;
import co.grandcircus.coffeeshopapp.dao.UserRepository;
import co.grandcircus.coffeeshopapp.entity.Item;
import co.grandcircus.coffeeshopapp.entity.User;

@Controller
@SessionAttributes("emailaddress")
public class HomeController {

	@Autowired
	private UserRepository uP;
	@Autowired
	private ItemDao itemDao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "items", itemDao.findAll());
	}

	@RequestMapping("login")
	public ModelAndView login(@RequestParam("emailaddress") String emailaddress, @RequestParam("pword") String pword, HttpSession session, Model model) {
		Optional<User> user = uP.findByEmailaddress(emailaddress);
		if (user.isPresent() && user.get().getPword().equals(pword)) {
			User trueUser = user.get(); 
			ModelAndView mv = new ModelAndView("welcome", "welcome", "Hello, " + trueUser.getFirstname() + "!");
			model.addAttribute("emailaddress", emailaddress);
			return mv;
		}
		return new ModelAndView("loginfailed", "loginfailed", "User name and password do not match.");
	}

	@RequestMapping("/itemnamesearch")
	public ModelAndView search(@RequestParam("name") String name) {
		Item item = itemDao.findByName(name);

		if (item == null) {
			return new ModelAndView("search", "itemname", "No Results");
		}
		return new ModelAndView("search", "itemname", item);
	}

	@RequestMapping("registration")
	public String form() {
		return "registration";
	}

	@RequestMapping("add")
	public ModelAndView addUser(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName,
			@RequestParam("email") String emailAddress, @RequestParam("phone") String phoneNumber,
			@RequestParam("birthDate") String birthDate, @RequestParam("userGender") String userGender) {
		User user = new User(null, firstName, lastName, emailAddress, phoneNumber, birthDate, userGender);

		uP.save(user);

		return new ModelAndView("registrationresults", "person",
				"Hello, " + user.getFirstname() + "! Thank you for registering.");
	}

	@RequestMapping("/itemadmin")
	public ModelAndView itemadmin() {
		return new ModelAndView("itemadmin", "items", itemDao.findAll());
	}

	@RequestMapping("/addnewitem")
	public ModelAndView addnewitem(@RequestParam("itemid") Long itemid) {
		return new ModelAndView("addnewitem", "itemid", itemid);
	}

	@RequestMapping(value = "/additem")
	public ModelAndView add(@RequestParam("name") String name, @RequestParam("description") String description,
			@RequestParam("quantity") Long quantity, @RequestParam("price") Float price) {
		Item item = new Item(name, description, quantity, price);
		itemDao.update(item);
		return new ModelAndView("redirect:/itemadmin");
	}

	@RequestMapping(value = { "/delete" })
	public ModelAndView delete(@RequestParam("itemid") Long itemid) {
		itemDao.deleteById(itemid);

		return new ModelAndView("redirect:/itemadmin");
	}

	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam("itemid") Long itemid) {
		Item item = itemDao.findById(itemid);
		return new ModelAndView("edit", "item", item);
	}

	@RequestMapping(value = "/edititem")
	public ModelAndView update(@RequestParam("itemid") Long itemid, @RequestParam("name") String name,
			@RequestParam("description") String description, @RequestParam("quantity") Long quantity,
			@RequestParam("price") Float price) {
		Item item = new Item(itemid, name, description, quantity, price);
		itemDao.update(item);

		return new ModelAndView("redirect:/itemadmin");
	}

}