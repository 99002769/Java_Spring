package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component

public class Triangle implements Shape {

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Triangle : " + x*y*0.5);
	}

}
