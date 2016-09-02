package sist.co.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sist.co.service.FriendService;

@Controller
public class FriendController {

	private static final Logger logger = LoggerFactory.getLogger(FriendController.class);
	
	@Autowired
	FriendService friendService;
	
	@RequestMapping(value="friendsearch.do", method={RequestMethod.GET, RequestMethod.POST})
	public String friendsearch(Model model) throws Exception{		
		logger.info("friendsearch");
		return "friendsearch.tiles";
	}
	
	
	
	
	
}
