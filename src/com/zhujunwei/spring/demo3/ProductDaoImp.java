package com.zhujunwei.spring.demo3;

public class ProductDaoImp implements ProductDao {

	@Override
	public void save() {
		System.out.println("保存商品。。");
	}

	@Override
	public void update() {
		System.out.println("修改商品。。");
	}

	@Override
	public void find() {
//		int i = 1/0 ;
		System.out.println("查找商品。。");
	}

	@Override
	public String delete() {
		System.out.println("删除商品。。");
		return "删除了!!!";
	}

}
