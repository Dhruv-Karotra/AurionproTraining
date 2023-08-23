package com.aurionpro.test;

import com.aurionpro.model.EmpControl;
import com.aurionpro.model.EmpManage;

public class EmpTesttt {
	public static void main(String[] args) {
		EmpControl empControlObj=new EmpControl();
		EmpManage empManageObj=new EmpManage();
		
		empManageObj.readDataToObject();
		empManageObj.convertDateStringsToDateObjects();
		empControlObj.start();
	}
}
