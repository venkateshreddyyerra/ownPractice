package com.script.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.script.entity.Script;

@Repository
public interface ScriptRepo extends JpaRepository<Script, Long>{

}
