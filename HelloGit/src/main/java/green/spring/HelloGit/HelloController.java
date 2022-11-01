package green.spring.HelloGit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "안녕하세요 git!";
	}
}	
