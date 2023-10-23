package com.DbJpa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_master")
public class Product {
	@Id
	@GeneratedValue//(strategy=GenerationType.IDENTITY)
	private Integer pid;
	private String pname;
	private double price;
	@CreationTimestamp
	@Column(name="Created_Date",updatable=false)
	//private LocalDate createDate;			=>only to generate created time
	private LocalDateTime createDate;
	@UpdateTimestamp
	@Column(name="updated_Date",insertable=false)
	private LocalDateTime updatedDate;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer pid, String pname, double price, LocalDateTime createDate, LocalDateTime updatedDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.createDate = createDate;
		this.updatedDate = updatedDate;
	}
	
	

}
