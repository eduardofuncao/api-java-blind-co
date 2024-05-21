package model;

import java.sql.Timestamp;

public class Sessao {
	private int id;
	private Timestamp horaInicio;
	private Timestamp duracao;
	private int usuario_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Timestamp getDuracao() {
		return duracao;
	}
	public void setDuracao(Timestamp duracao) {
		this.duracao = duracao;
	}
	public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	public Sessao(int id, Timestamp horaInicio, Timestamp duracao, int usuario_id) {
		super();
		this.id = id;
		this.horaInicio = horaInicio;
		this.duracao = duracao;
		this.usuario_id = usuario_id;
	}
	
	
}
