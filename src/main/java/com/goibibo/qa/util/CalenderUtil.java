package com.goibibo.qa.util;

import java.time.LocalDate;

import org.openqa.selenium.By;

import com.goibibo.qa.base.TestBase;



public class CalenderUtil extends TestBase {
	
	
	
	public static void CalenderPopup(){
	
	LocalDate ld=LocalDate.now();
	String currentMonth = ld.getMonth().name();
	String currentMonthName = currentMonth.substring(0, 1)+currentMonth.substring(1).toLowerCase();
	int currentMonthIndex = ld.getMonthValue();
	int currentDate = ld.plusDays(4).getDayOfMonth();
	int currentYear = ld.getYear();
	
	driver.findElement(By.id("departureCalendar")).click();
	//
	String xp1="//div[@class='DayPicker-Month']//div[text()='"+currentMonthName+" "+currentYear+"']/..//div[text()='"+currentDate+"']";
	driver.findElement(By.xpath(xp1)).click();
	driver.findElement(By.id("returnCalendar")).click();
	LocalDate ldnew = ld.plusMonths(1);
	String retMonth = ldnew.getMonth().name();
	String retMonthName = retMonth.substring(0, 1)+retMonth.substring(1).toLowerCase();
	int retMonthIndex = ldnew.getMonthValue();
	int retDate = ld.plusDays(8).getDayOfMonth();
	for(int i=currentMonthIndex;i<retMonthIndex;i++) {
		driver.findElement(By.xpath("//span[@role='button']")).click();
	}
	String xp2="//div[@class='DayPicker-Month']//div[text()='"+retMonthName+" "+currentYear+"']/..//div[text()='"+retDate+"']";
	driver.findElement(By.xpath(xp2)).click();

    }
}
