package com.ipartek.formacion.javalibro.colecciones;

public class Persona {

	private String nom,app1,app2,num,mail,dni,tipoper;
	
	public Persona(String nom,String app1, String app2,String num,String mail,String dni,String tipoper) {
		super();
		this.nom = nom;
		this.app1 = app1;
		this.app2 = app2;
		this.num = num;
		this.mail = mail;
		this.dni = dni;
		this.tipoper = tipoper;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApp1() {
		return app1;
	}

	public void setApp1(String app1) {
		this.app1 = app1;
	}

	public String getApp2() {
		return app2;
	}

	public void setApp2(String app2) {
		this.app2 = app2;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTipoper() {
		return tipoper;
	}

	public void setTipoper(String tipoper) {
		this.tipoper = tipoper;
	}

	
}
