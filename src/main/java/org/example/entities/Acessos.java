package model;

import java.sql.Timestamp;

public class Acessos {
	private int id;
	private String pagina;
	private Timestamp duracao;
	private int sessao_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	public Timestamp getDuracao() {
		return duracao;
	}
	public void setDuracao(Timestamp duracao) {
		this.duracao = duracao;
	}
	public int getSessao_id() {
		return sessao_id;
	}
	public void setSessao_id(int sessao_id) {
		this.sessao_id = sessao_id;
	}
	public Acessos(int id, String pagina, Timestamp duracao, int sessao_id) {
		super();
		this.id = id;
		this.pagina = pagina;
		this.duracao = duracao;
		this.sessao_id = sessao_id;
	}
	
	
}
