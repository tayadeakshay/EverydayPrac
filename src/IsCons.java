
public class IsCons {

	String name;
	int id;
	Teacher address;
	
	
	public IsCons(String name, int id, Teacher address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public IsCons() {
		super();
	}
	@Override
	public String toString() {
		return "IsCons [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
}

class Teacher// extends IsCons
{
String address;


public Teacher(String address) {
	super();
	this.address = address;
}

public Teacher() {
	super();
}

@Override
public String toString() {
	return "[address=" + address + "]";
}


}