package kr.co.encore;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.encore.model.vo.TestVO;
import kr.co.encore.service.TestSv;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Resource(name = "testSv")
	private TestSv service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "index.encore", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		System.out.println("path -> index.encore");
		model.addAttribute("msg", "Spring Test");
		
		return "home";
	}
	
	@RequestMapping(value = "test.encore", method = RequestMethod.GET)
	public String sample() {
		System.out.println("ctrl path -> test.encore");
		System.out.println("service : " + service);
		List<Object> list = service.service();
		
		System.out.println(list);
		
		return "ok";
	}
	
//	@RequestMapping(value = "login.encore", method = RequestMethod.POST)
//	public String login(TestVO tv, Model model) {
//		System.out.println("params : " + tv.getId() + ", " + tv.getPwd());
//		model.addAttribute("user", tv);
//		return "result";
//	}
	
	@RequestMapping(value = "login.encore", method = RequestMethod.POST)
	public ModelAndView login(TestVO tv) {
		System.out.println("params : " + tv.getId() + ", " + tv.getPwd());
		ModelAndView mv = new ModelAndView("result", "user", tv);
		return mv;
	}
	
}
