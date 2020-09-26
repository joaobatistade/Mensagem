package controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MensagemController implements Serializable {
	 
	private static final long serialVersionUID = -1856628801041624895L;
	
	private String nome;
	private String email;
	private String msg;
	
	public MensagemController(String nome, String email, String msg) {
		super();
		this.nome = nome;
		this.email = email;
		this.msg = msg;
	}
	public MensagemController() {
		
	}
	
	public String mensagem() {
		System.out.println("Mensagem enviada com sucesso!");
		System.out.println("Usuário: " +nome);
		System.out.println("E-mail: " +email);
		System.out.println("Mensagem: " +msg);
		
		return "Message.xhtml";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
