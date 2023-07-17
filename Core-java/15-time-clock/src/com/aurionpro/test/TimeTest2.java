package com.aurionpro.test;

import com.aurionpro.models.Time;

public class TimeTest2 {
	public static void main(String[] args) {
		Time time1 = new Time(16, 32, 47);
		Time time2 = new Time(10, 100, 40);

		Time sumTime = addTimeObjects(time1, time2);
		System.out.println(sumTime);
	}

	private static Time addTimeObjects(Time time1, Time time2) {
		Time tempTime=new Time();
		
		tempTime.setSeconds(time1.getSeconds()+time2.getSeconds());
		tempTime.setMins(time1.getMins()+time2.getMins());
		tempTime.setHours(time1.getHours()+time2.getHours());
		correctTime(tempTime);
		return tempTime;
	}

	private static void correctTime(Time tempTime) {
		correctSeconds(tempTime);
		correctMinutes(tempTime);
		correctHours(tempTime);
	}

	private static void correctHours(Time tempTime) {
		if(tempTime.getHours()>23) {
			tempTime.setHours(tempTime.getHours()%24);
		}
	}

	private static void correctMinutes(Time tempTime) {
		while(tempTime.getMins()>60) {
			tempTime.setMins(tempTime.getMins()-60);
			tempTime.setHours(tempTime.getHours()+1);
		}
	}

	private static void correctSeconds(Time tempTime) {
		while(tempTime.getSeconds()>60) {
			tempTime.setSeconds(tempTime.getSeconds()-60);
			tempTime.setMins(tempTime.getMins()+1);
		}
		
	}
}
