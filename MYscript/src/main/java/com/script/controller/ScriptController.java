package com.script.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.script.dto.ScriptDto;
import com.script.exception.ApplicationException;
import com.script.service.IscriptService;

@RestController
@RequestMapping("script")
public class ScriptController {

	@Autowired
	private IscriptService service;
	
	@PostMapping("saveScript")
	public ResponseEntity<ScriptDto> saveScript(@RequestBody ScriptDto dto)
	{
	ScriptDto scriptDto =service.saveScript(dto);
	return ResponseEntity.status(HttpStatus.CREATED).body(scriptDto);
	}
	
	@GetMapping("getAllScripts")
	public ResponseEntity<List<ScriptDto>> getalldto()
	{
	List<ScriptDto> list =service.getAllScripts();
	return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	@GetMapping("getById/{id}")
	public ResponseEntity<ScriptDto> getById(@PathVariable Long id) throws ApplicationException
	{
	ScriptDto dto =service.getById(id);
	
	if(dto == null) {
		 throw new ApplicationException("data not found");
	}
	else {
	return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	}
	
	@DeleteMapping("deleteById/{id}")
	public ResponseEntity<ScriptDto> deleteById(@PathVariable Long id)
	{
	ScriptDto dto =service.deleteById(id);
	return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	
}
