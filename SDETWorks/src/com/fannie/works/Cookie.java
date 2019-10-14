package com.fannie.works;

import java.util.Arrays;

public class Cookie extends Item {
	private String type; 
	private boolean isSugarLess; 
	private String [] nuts;
	
	
	
	
	public Cookie(int id, String name, double price, 
			String type, boolean isSugarLess, String[] nuts) {
		super(id, name, price);
		this.type = type;
		this.isSugarLess = isSugarLess;
		this.nuts = nuts;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isSugarLess() {
		return isSugarLess;
	}
	public void setSugarLess(boolean isSugarLess) {
		this.isSugarLess = isSugarLess;
	}
	public String[] getNuts() {
		return nuts;
	}
	public void setNuts(String[] nuts) {
		this.nuts = nuts;
	}
	@Override
	public String toString() {
		return "Cookie [type=" + type + ", isSugarLess=" + isSugarLess + ", nuts=" + Arrays.toString(nuts) + "]";
	} 
	
	
	
	public void makeCookie() {
		System.out.println("Cookies are made in machine... ");
	}
	
	
}
