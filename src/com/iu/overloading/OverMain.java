package com.iu.overloading;

import com.iu.mobile.Phone;

public class OverMain {

	public static void main(String[] args) {
		Cal cal = new Cal();
		CalView calView = new CalView();
		
		int hap = cal.plus(10, 20);
		float fhap = cal.plus(10.2f, 20.2f);
		calView.viewFloat(fhap);
		Phone phone = new Phone();
		
	}
}