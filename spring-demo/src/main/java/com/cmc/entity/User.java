package com.cmc.entity;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author chengmingchao
 *
 * @date 2022/12/16 13:53
 */
@Component
public class User implements BeanNameAware {

	private String name;

	private Integer age;

	private String beanName;

	public String getBeanName() {
		return beanName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void hello(){
		System.out.println("hello world");
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
