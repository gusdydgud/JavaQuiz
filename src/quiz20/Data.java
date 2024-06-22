package quiz20;

public class Data {
	
	private String name;
	private String age;
	private String email;
	private String com;
	
	public Data(String name, String age, String email, String com) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.com = com;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", email=" + email + ", com=" + com + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}

}
