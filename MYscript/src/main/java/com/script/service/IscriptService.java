package com.script.service;

import java.util.List;

import com.script.dto.ScriptDto;

public interface IscriptService {

	public abstract ScriptDto saveScript( ScriptDto dto);
	
	public abstract List<ScriptDto> getAllScripts();
	
	ScriptDto deleteById(Long id);

	ScriptDto getById(Long id);
}
