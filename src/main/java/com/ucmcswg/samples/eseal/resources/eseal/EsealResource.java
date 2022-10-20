package com.ucmcswg.samples.eseal.resources.eseal;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsealResource {

	@PostMapping("/")
	@ResponseBody
	public Map<String, String> home() {
        HashMap<String, String> map = new HashMap<>();
        map.put("resource", "eseal");
		return map;
	}
}
