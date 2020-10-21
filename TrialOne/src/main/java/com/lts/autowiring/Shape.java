package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component
public interface Shape {
	
	public void calculateArea(int x,int y);

}
