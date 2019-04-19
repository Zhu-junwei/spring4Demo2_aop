package com.zhujunwei.spring.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring AOP入门
 * @author zhujunwei
 * 2019年4月18日 下午6:55:29
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {
	
	@Resource(name="productDao")
	private ProductDao productDao ;
	
	@Test
	public void demo1() {
		productDao.save();
		productDao.update();
		productDao.find();
		productDao.delete();
	}
}
