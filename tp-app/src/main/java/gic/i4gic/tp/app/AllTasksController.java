package gic.i4gic.tp.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllTasksController {

	@GetMapping("/")
	public String task1() {

		return """
				<center>
				<h2 style="color:Green"> Welcome to Rice App</h2>
				<a href="http://localhost:8080/rice/task2"><h1> Please Click Here to Login to the system </h1><a>
				<br>
				
				<p>Username: titi and Password: toto</p>
				
				<center>
				""";
	}
}



@Controller
class Task_02Controller {
	@GetMapping("/rice/task2")
	public String task2() {

		return "task02";
	}
}

@Controller
class Task_03Controller {
	@GetMapping("/rice/task3")
	public String task3() {

		return "task03";
	}
}

@Controller
class Task_04Controller {
	@GetMapping("/rice/task4")
	public String task4() {

		return "task04";
	}
}

@Controller
@RequestMapping(path="/rice/task5")
class Task_05Controller{
	
	@RequestMapping(method=RequestMethod.GET)
	public String task4(Model model,@RequestParam("username") String username) {
		model.addAttribute("name_user",username);
		return "task05";
	}
}


