package model;

public class PrefAcess {
	private int id;
	private String tipoDaltonismo;
	private String altoContraste;
	private String linksSublinhados;
	private int usuario_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoDaltonismo() {
		return tipoDaltonismo;
	}
	public void setTipoDaltonismo(String tipoDaltonismo) {
		this.tipoDaltonismo = tipoDaltonismo;
	}
	public String getAltoContraste() {
		return altoContraste;
	}
	public void setAltoContraste(String altoContraste) {
		this.altoContraste = altoContraste;
	}
	public String getLinksSublinhados() {
		return linksSublinhados;
	}
	public void setLinksSublinhados(String linksSublinhados) {
		this.linksSublinhados = linksSublinhados;
	}
	public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	public PrefAcess(int id, String tipoDaltonismo, String altoContraste, String linksSublinhados, int usuario_id) {
		super();
		this.id = id;
		this.tipoDaltonismo = tipoDaltonismo;
		this.altoContraste = altoContraste;
		this.linksSublinhados = linksSublinhados;
		this.usuario_id = usuario_id;
	}
	
	
}
