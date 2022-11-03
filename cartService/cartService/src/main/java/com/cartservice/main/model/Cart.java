package com.cartservice.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cart {
	@Id
	private int order_S_no;
	private Date creted_date;

	public int getOrder_S_no() {
		return order_S_no;
	}

	public Cart(int order_S_no, Date creted_date) {
		super();
		this.order_S_no = order_S_no;
		this.creted_date = creted_date;
	}

	public void setOrder_S_no(int order_S_no) {
		this.order_S_no = order_S_no;
	}
	public Date getCreted_date() {
		return creted_date;
	}
	public void setCreted_date(Date creted_date) {
		this.creted_date = creted_date;
	}




}
