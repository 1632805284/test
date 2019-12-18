package jihe;

public class personModel {
	String name;
	int age;
	String sex;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public personModel(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public personModel() {
		super();
		// TODO 自动生成的构造函数存根
	}

}
