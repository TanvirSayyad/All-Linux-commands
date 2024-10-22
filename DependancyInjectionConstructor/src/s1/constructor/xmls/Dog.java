package s1.constructor.xmls;

public class Dog {

	private String category;
	private int weight;
	private String Name;

	public Dog(String category, int weight, String Name) {
		this.category = category;
		this.weight = weight;
		this.Name = Name;

	}

	@Override
	public String toString() {
		return "Dog [category=" + category + ", weight=" + weight + ", Name=" + Name + "]";
	}

}
