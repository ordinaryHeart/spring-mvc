package com.hb.lw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="T_SYS_USER")
public class T_SYS_USER {
	private String id;
	private String account;
	private String password;
	private String pegente;
	private String status;
	private String falg;
	private String enalbed;
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column
	public String getPegente() {
		return pegente;
	}
	public void setPegente(String pegente) {
		this.pegente = pegente;
	}
	
	@Column
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column
	public String getFalg() {
		return falg;
	}
	public void setFalg(String falg) {
		this.falg = falg;
	}
	
	@Column
	public String getEnalbed() {
		return enalbed;
	}
	public void setEnalbed(String enalbed) {
		this.enalbed = enalbed;
	}
	
	
}
