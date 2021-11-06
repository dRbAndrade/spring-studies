package beanexternalization;

public class DAO {

	private String server;
	private String port;
	private String user;
	private String password;

	public DAO(String server, String port, String user, String password) {
		super();
		this.server = server;
		this.port = port;
		this.user = user;
		this.password = password;
	}

	@Override
	public String toString() {
		return "DAO [server=" + server + ", port=" + port + ", user=" + user + ", password=" + password + "]";
	}
	
	

}
