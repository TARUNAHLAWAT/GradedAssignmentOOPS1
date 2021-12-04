package com.greatlearning.mainDriver;
import com.greatlearning.SuperDepartment.SuperDepartment;
import com.greatlearning.TechDeptt.TechDepartment;
import com.greatleaning.admindeptt.AdminDepartment;
import HRdeptt.HRDepartment;
public class MainDriver {
	public static void main(String[] args) {
		AdminDepartment Admin=new AdminDepartment();
		HRDepartment HRD=new HRDepartment();
		TechDepartment Tech=new TechDepartment();
		
		System.out.println("\n\nWelcome to "+Admin.departmentName());
		System.out.println(Admin.getTodaysWork());
		System.out.println(Admin.getWorkDeadline());
		System.out.println(Admin.isTodayAHoliday());
		
		System.out.println("\n\nWelcome to "+HRD.departmentName());
		System.out.println(HRD.getTodaysWork());
		System.out.println(HRD.getWorkDeadline());
		System.out.println(HRD.isTodayAHoliday());
		System.out.println(HRD.getdoActivity());
		
		System.out.println("\n\nWelcome to "+Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.isTodayAHoliday());
	    System.out.println(Tech.getTechStackInformation());
	}
}
