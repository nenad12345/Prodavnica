package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int idUser;
	private String userName;
	private String password;
	private double balance;
	@OneToMany
	private List<Product> listOfProduct = new ArrayList<Product>();

	public int getIdUser() {
		return idUser;
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

	public List<Product> getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(List<Product> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	
}
