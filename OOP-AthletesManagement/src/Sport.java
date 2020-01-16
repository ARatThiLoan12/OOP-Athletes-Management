
import java.util.ArrayList;

public class Sport implements Reward {
	protected String name;
	protected double basicSalary;
	protected String medal;
	protected  static int count = 1;
	int id;
	protected double reward;
	
	static ArrayList<Sport> arrSport = new ArrayList<Sport>(); 
	public Sport() {

	}

	public Sport(String name, double basicSalary) {
		this.basicSalary = basicSalary;
		this.name = name;
		this.id = count++;
	}

	public int getId() {
		return id;
	}

	public  String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getReward(String type) {
		if (type.equals("Gold")) {
			reward = 0.2 * basicSalary * GOLD_MEDAL;
		} else if (type.equals("Silver")) {
			reward= 0.2 * basicSalary * SILVER_MEDAL;
		} else if (type.equals("Brozen")) {
			reward = 0.2 * basicSalary * BROZEN_MEDAL;
		}
		return reward;
	}

	public String toString() {
		return "Id: " + id + "\nName sport : " + name + "\nBasic salary : " + basicSalary + "\nReward Gold MeDal : "
				+ (0.2 * basicSalary * GOLD_MEDAL)+ "\nReward Silver MeDal: "+ (0.2 * basicSalary * SILVER_MEDAL)+
				"\nReward Brozen MeDal: "+(0.2 * basicSalary * BROZEN_MEDAL);
	}
	
}


