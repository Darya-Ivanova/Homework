package task26.HomeworkTwentySix;

public class MailruData {
	private String id;
	private String login;
	private String password;
	private String text;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "MailruData [id=" + id + ", login=" + login + ", password=" + password + ", text=" + text + ", address="
				+ address + "]";
	}
	
}
