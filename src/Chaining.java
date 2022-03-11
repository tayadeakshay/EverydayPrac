
public class Chaining {

	String name;
	int id;

	public Chaining() {
		super();
	}

	public Chaining(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
}

class Inherit extends Chaining {

	String address;

	public Inherit() {
		super();
	}

	public Inherit(String name, int id, String address) {
		super(name, id);
		this.address = address;
	}

	@Override
	public String toString() {
		return "Inherit [address=" + address + ", name=" + name + ", id=" + id + "]";
	}

}