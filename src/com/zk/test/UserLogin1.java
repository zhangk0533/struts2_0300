package com.zk.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserLogin1 extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map request;
	private Map session;
	private Map application;
	public UserLogin1() {
		request = (Map)ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
		System.out.println("≥ı ºªØ");
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		request.put("r1", "r1");
		session.put("s1", "s1");
		application.put("a1","a1");
		
		
		return SUCCESS;
	}

}
