package com.demo.jly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.jly.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	/**
	 * 获取所有员工数（不是LOFF，开始时间和账号不为空）
	 * @return
	 */
	@Query("from User e where e.usersName = ?1")
	List<User> getUser(String name);
}
