package com.lts.foodwiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Indian implements Menu {

	@Override
	public List<String> itemsAvailable(String choice) {
		// TODO Auto-generated method stub
		return Arrays.asList("Dosa","Chapathi");
	}

	
	

}
