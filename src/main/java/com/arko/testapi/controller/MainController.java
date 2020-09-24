package com.arko.testapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.arko.testapi.entity.Record;
import com.arko.testapi.service.RecordService;

@RestController
public class MainController {

	@Autowired
	private RecordService recordService;
	
	@GetMapping("/set")
	public boolean setRecord(@ModelAttribute("id") Long id, @ModelAttribute("name") String name)	{
		try {
			recordService.commitRecord(id, name);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	@GetMapping("/id")
	public Record getRecordById(@ModelAttribute("id") Long id)	{
		return recordService.showById(id);
	}
	
	@GetMapping("/all")
	public List<Record> getAll()	{
		return recordService.showAll();
	}
}
