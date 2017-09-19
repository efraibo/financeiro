package com.sourceinformation.financeiro.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "entidade")
public class Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(length = 60)
	private String nome;
	
	@Column(length = 20, name = "cpfCnpj")
	private String cpfCnpj;
	
	@Column(length = 80)
	private String endereco;
	
	@Column(length = 60)
	private String cidade;
	
	@Column(length = 60)
	private String bairro;
	
	@Column(length = 20)
	private String uf;
	
	@Column(length = 20)
	private String telefone;
	
	@Column(length = 100, name = "e_mail")
	private String email;
	
	@OneToMany(mappedBy = "entidade", orphanRemoval = true) //orphanRemoval - define que não pode ter titulos sem entidade
	private List<Titulo> titulos = new ArrayList<>();
		
	public List<Titulo> getTitulos() {
		return titulos;
	}
	public void setTitulos(List<Titulo> titulos) {
		this.titulos = titulos;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
