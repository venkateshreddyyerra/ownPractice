package com.script.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.script.dao.ScriptRepo;
import com.script.dto.ScriptDto;
import com.script.entity.Script;
import com.script.service.IscriptService;

@Service
public class ScriptServiceImpl implements IscriptService{

	@Autowired
	private ScriptRepo repo;
	@Autowired
	private ModelMapper modelmapper;
	@Override
	public ScriptDto saveScript(ScriptDto dto) {
		
	Script script =	modelmapper.map(dto, Script.class);
		repo.save(script);
		return dto;
	}
	@Override
	public List<ScriptDto> getAllScripts() {
	List<Script> list =	repo.findAll();
	List<ScriptDto> listDto = new ArrayList<>();
	for(int i = 0;i<=list.size()-1;i++)
	{
     	Script script =	list.get(i);
		ScriptDto dto =	modelmapper.map(script, ScriptDto.class);
		listDto.add(dto);
	}
		return listDto;
	}
	
	@Override
	public ScriptDto getById(Long id) {
		
	Optional<Script> opt =	repo.findById(id);
		if(opt.isPresent())
		{
		Script script =opt.get();
		ScriptDto dto =	modelmapper.map(script, ScriptDto.class);
		return dto;
		}else {
		return null;
		}
	}
	
	@Override
	public ScriptDto deleteById(Long id) {
	ScriptDto dto =	getById(id);
	repo.deleteById(id);
		return dto;
	}
	

}
