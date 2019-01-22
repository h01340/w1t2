package k2019.w1t2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/hello")
	public String giveGreetings(@RequestParam("name") String name, 
			@RequestParam("location") String location) {
		
		return "Welcom to the " + location + " " + name + "!"; 
	}
}
