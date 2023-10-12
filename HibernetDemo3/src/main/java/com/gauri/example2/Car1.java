package com.gauri.example2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;
import org.hibernate.annotations.Tables;

@Entity
public class Car1{
	
		@Id	
		private int id;
		@Column
		private String carModelName;
		@Column
		private double cost;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCarModelName() {
			return carModelName;
		}
		
		public void setCarModelName(String carModelName) {
			this.carModelName = carModelName;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}

}