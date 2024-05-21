package model;

import java.sql.Date;

public class Match {
	private int id;
	private Date dataMatch;
	private int usuario_id;
	private int agente_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataMatch() {
		return dataMatch;
	}
	public void setDataMatch(Date dataMatch) {
		this.dataMatch = dataMatch;
	}
	public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	public int getAgente_id() {
		return agente_id;
	}
	public void setAgente_id(int agente_id) {
		this.agente_id = agente_id;
	}
	public Match(int id, Date dataMatch, int usuario_id, int agente_id) {
		super();
		this.id = id;
		this.dataMatch = dataMatch;
		this.usuario_id = usuario_id;
		this.agente_id = agente_id;
	}
	
	
}
