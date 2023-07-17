package com.aurionpro.test;

import com.aurionpro.models.*;
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1=new Time(100,100,100);
		Time time2=new Time(100,100,100);
		Time addedTime=addTime(time1,time2);
		System.out.println("Added time : "+ addedTime);
	}
	
	private static Time addTime(Time time1, Time time2) {
		Time addTimes=new Time(0,0,0); 
		int AddSeconds=time1.getSeconds()+time2.getSeconds();
		int AddMins=time1.getMins()+time2.getMins();
		int AddHours=time1.getHours()+time2.getHours();
		
		
		/*while(AddSeconds>60) {
			if(AddSeconds>=60) {
				AddSeconds-=60;
				addTimes.setSeconds(AddSeconds);
				AddMins+=1;
			}
		}
		if(AddSeconds<60) {
			addTimes.setSeconds(AddSeconds);
		}
		
		while(AddMins>60) {
			if(AddMins>=60) {
				AddMins-=60;
				addTimes.setMins(AddMins);
				AddHours+=1;
			}
		}
		if(AddMins<60) {
			addTimes.setMins(AddMins);
		} 
		
		while(AddHours>24) {
			if(AddHours>=24) {
				AddHours-=24;
				addTimes.setHours(AddHours);
			}
		}
		if(AddHours<24) {
			addTimes.setHours(AddHours);
		}
		*/
		
		if(AddSeconds>60) {
			while(AddSeconds>60) {
				if(AddSeconds>=60) {
					AddSeconds-=60;
					addTimes.setSeconds(AddSeconds);
					AddMins+=1;
				}
			}
		}
		else if(AddSeconds>=0 && AddSeconds<60){
			addTimes.setSeconds(AddSeconds);
		}

		
		if(AddMins>60) {
			while(AddMins>60) {
				if(AddMins>=60) {
					AddMins-=60;
					addTimes.setMins(AddMins);
					AddHours+=1;
				}
			}
		}
		else if(AddMins>=0 && AddMins<60){
			addTimes.setMins(AddMins);
		}

		
		if(AddHours>60) {
			while(AddHours>60) {
				if(AddHours>=60) {
					AddHours-=60;
					addTimes.setHours(AddHours);
				}
			}
		}
		else if(AddHours>=0 && AddHours<60){
			addTimes.setHours(AddHours);
		}
		
		return addTimes;
	}

}
