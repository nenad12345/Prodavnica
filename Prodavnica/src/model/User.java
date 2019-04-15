package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;
	private String userName;
	private String password;
	private double balance;
	
	private List<product> listOfProduct = new ArrayList<product>();

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<product> getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(List<product> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}
	

	
}
