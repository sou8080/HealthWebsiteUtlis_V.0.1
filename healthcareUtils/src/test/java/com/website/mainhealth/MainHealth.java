package com.website.mainhealth;

import java.io.IOException;

import com.website.pages.AppointmentHealthPage;
import com.website.pages.IndexHealthPage;
import com.website.pages.LoginHealth;
import com.website.utils.BaseUtils;

public class MainHealth
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		BaseUtils utlis = new BaseUtils();
		IndexHealthPage ihpage = new IndexHealthPage();
		LoginHealth lhpage = new LoginHealth();
		AppointmentHealthPage  page = new AppointmentHealthPage();
		
		
		Thread.sleep(3000);
		utlis.takescreenshot("index");
		Thread.sleep(2000);
		ihpage.indexpage(utlis.driver);
		
		utlis.takescreenshot("login");
		Thread.sleep(2000);
		lhpage.login(utlis.driver);
		
		utlis.takescreenshot("appointment_page");
		Thread.sleep(2000);
		page.appointment(utlis.driver);
		
		utlis.takescreenshot("summary");
		Thread.sleep(2000);
		
		page.logoutHealth(utlis.driver);
		utlis.close();
	}

}
