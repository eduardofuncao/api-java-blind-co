package model;

public class Cliques {
	private int id;
	private int x;
	private int y;
	private int sessao_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSessao_id() {
		return sessao_id;
	}
	public void setSessao_id(int sessao_id) {
		this.sessao_id = sessao_id;
	}
	public Cliques(int id, int x, int y, int sessao_id) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.sessao_id = sessao_id;
	}
	
	
}
