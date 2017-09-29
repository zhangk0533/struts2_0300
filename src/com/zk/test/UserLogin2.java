package com.zk.test;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserLogin2 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String,Object> request;
	private Map<String,Object> session;
	private Map<String,Object> application;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		request.put("r1", "r1");
		session.put("s1", "s1");
		application.put("a1","a1");
		
		
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.application = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

}
