package com.uek.project.ebookboot.mapper;

import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.uek.project.ebookboot.entity.Account;

@Mapper
public interface AccountMapper {
	void saveOrupdate(Account Act);
	//@Insert("insert into t_account(act_no,password,enable,create_date,balance) values(#{actNo},#{password},#{enable},#{createDate},#{balance})")
	void save(Account act);
	void delete(int id);
	void update(Account act);
	void update(Connection con,Account act);
	void saveAccounts(List<Account> acts);
	
	@Select("select * from t_account where id=#{id}")
	Account findById(int id);
	Account findByActNo(String ActNo);
	
	@Select("select * from t_account")
	List<Account> findAll();
	List<Account> findPaged(int offset,int pageSize);
	int totalPages(int pageSize);
	
}
