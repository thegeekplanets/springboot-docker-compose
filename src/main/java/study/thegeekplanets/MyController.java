package study.thegeekplanets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(path = "/")
	public String sayHello() {
		return "Hello World";
	}

}
