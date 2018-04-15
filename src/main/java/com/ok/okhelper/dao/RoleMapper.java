package com.ok.okhelper.dao;

import com.ok.okhelper.pojo.po.Role;
import com.ok.okhelper.until.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper extends MyMapper<Role> {
	
	List<Role> findRoleByUserId(Long userId);
	
}