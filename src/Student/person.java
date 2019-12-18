package Student;

public class person {
	public String name;
	public String sfzh;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public person(String sfzh) {
		super();
		this.sfzh = sfzh;
	}
	public person() {
		super();
		// TODO 自动生成的构造函数存根
	}
}
