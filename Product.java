package com.hibernate_demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="pid")
	int pid;
	String name;
	String category;
	double cost;

	public Product() {

	}

	public Product(int pid, String name, String category, double cost) {
		super();
		this.pid = pid;
		this.name = name;
		this.category = category;
		this.cost = cost;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", category=" + category + ", cost=" + cost + "]";
	}

	

}