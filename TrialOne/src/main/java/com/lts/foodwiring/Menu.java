package com.lts.foodwiring;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface Menu {
	public List<String> itemsAvailable(String choice);

	

}
