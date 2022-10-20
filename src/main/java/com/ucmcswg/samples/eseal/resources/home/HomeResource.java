package com.ucmcswg.samples.eseal.resources.home;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	@ResponseBody
	public Map<String, String> home() {
        HashMap<String, String> map = new HashMap<>();
        map.put("application", "com.ucmcswg.samples.eseal");
		return map;
	}
}
