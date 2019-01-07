package com.cs.tmt.service.spi;

import org.springframework.stereotype.Service;

import com.cs.tmt.model.InfoData;
import com.cs.tmt.service.api.InfoService;

@Service
public class InfoServiceImpl implements InfoService {

	@Override
	public InfoData sayHowAreYou(String name) {
		InfoData greeting = new InfoData();
		greeting.setVersion("How are you " + name + "!!!");
		greeting.setConfigType("");
		return greeting;
	}
}
