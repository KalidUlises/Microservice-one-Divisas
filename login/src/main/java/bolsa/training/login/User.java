package bolsa.training.login;

public class User {

	private Integer usuario;
	private String password;
	
	
	public User(Integer usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}
	
	
	public Integer getUsuario() {
		return usuario;
	}
	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
