package com.stumgr.dao;

import java.util.regex.Pattern;

public class CheckRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sSubName = "History";
		System.out.println("String Entered---" + sSubName +"---" + Pattern.matches("^[a-zA-Z]*$", sSubName));
		System.out.println(sSubName.matches("^[a-zA-Z]*$"));
	}
}
