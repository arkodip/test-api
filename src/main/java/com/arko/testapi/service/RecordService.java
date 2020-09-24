package com.arko.testapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arko.testapi.entity.Record;
import com.arko.testapi.repository.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository recordRepository;
	
	public boolean commitRecord(Long id, String name)	{
		try {
			Record record = new Record(id,name);
			recordRepository.save(record);
			return true;
			
		} catch(Exception e)	{
			return false;
		}
	}
	
	public List<Record> showAll()	{
		return recordRepository.findAll();
	}
	
	public Record showById(Long id)	{
		return recordRepository.findById(id).get();
	}
	
}
