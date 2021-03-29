package com.gemiso.zodiac.util.common;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;


public final class SessionListener implements HttpSessionListener{

	/*@Resource(name = "userService")
	private UserService userService;*/
	
	private static final Logger logger = Logger.getLogger("com.session");
	
	public SessionListener() {
		
	}
	
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		logger.info("session_created: " + session.getId());
		//System.out.println("session created  : " + session.getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {

		HttpSession session = se.getSession();
		logger.info("session_destroyed: " + session.getId());
		//LoginDomain login_vo = Optional.ofNullable((LoginDomain) session.getAttribute("loginUser")).orElse(new LoginDomain());

		try {
			
			//HttpStatus status = Utils.deleteSession(session.getId());
			//logger.info("session destroyed status : " + status);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*logger.info("session destroyed user : " + login_vo.getUser_id());
		logger.info("session destroyed  : " + session.getId());
		
		SimpleDateFormat dtm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date today = new Date();
		
		System.out.println("time : "+dtm.format(today));
		System.out.println("session destroyed user : " + login_vo.getUser_id());
		System.out.println("session destroyed  : " + session.getId());*/
		
	}

}
