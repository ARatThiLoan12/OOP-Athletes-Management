
abstract public class Person {
	protected String name;
	protected String gender;
	protected String date;
	protected String position;

	public Person() {

	}

	public Person(String name, String gender, String date) {
		this.name = name;
		this.gender = gender;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getDate() {
		return date;
	}
	
	public String getPosition() {
		return position;
	}

	public abstract void setGender(String gender);

	public abstract void setName(String name);

	public abstract void setDate(String date);



	
}
