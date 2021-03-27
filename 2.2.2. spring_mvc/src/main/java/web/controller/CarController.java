package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
	private static final List<Car> cars = new ArrayList<>();

	static {
		cars.add(new Car("HDNF34234H4343", "Honda Accord", 2015));
		cars.add(new Car("JJ434KLU435226", "Seat Leon", 2017));
		cars.add(new Car("YRUE47484BNM93", "Peugeot 206", 2011));
		cars.add(new Car("GEBD8883939202", "Mazda CX-5", 2019));
		cars.add(new Car("UJMIK43434LL43", "Skoda Octavia", 2021));
	}

	@GetMapping(value = "/cars")
	public String printSomeCars(ModelMap model, @RequestParam(name = "count", required = false) Integer count) {
		model.addAttribute("cars",
				cars.stream()
						.limit((count == null || count >= 5)
								? cars.size()
								: count)
						.collect(Collectors.toList()));
		return "cars";
	}
}