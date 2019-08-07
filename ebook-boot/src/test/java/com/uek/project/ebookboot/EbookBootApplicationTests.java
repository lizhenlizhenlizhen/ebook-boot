package com.uek.project.ebookboot;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.uek.project.ebookboot.dao.prototype.IAccountDao;
import com.uek.project.ebookboot.entity.Account;
import com.uek.project.ebookboot.mapper.AccountMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EbookBootApplicationTests {
	@Autowired
	IAccountDao accountDao;

	@Autowired
	AccountMapper accountMapper;
	

	@Test
	public void contextLoads() {
		Account account = new Account("boot011","123",true,new Date(),3000);
		accountDao.saveOrupdate(account);
	}
	@Test
	public void contextLoads2() {
		Account account = new Account("boot09","123",true,new Date(),3000);
		accountMapper.save(account);
	}

}
