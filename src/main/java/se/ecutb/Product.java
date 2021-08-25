package se.ecutb;

public abstract class Product {
	private String name;
	private String cost;
	private String allergen;
	private String calories;
	
	public Product(String productName, String productCost, String productAllergens, String productCalories) {
		name = productName;
		cost = productCost;
		allergen = productAllergens;
		calories = productCalories;
	}
	
	public void setName(String productName) {
		name = productName;
	}
	
	public String getName() {
		return name;
	}

	public void setCost(String productCost) {
		cost = productCost;
	}
	
	public String getCost() {
		return cost;
	}
	
	public void setAllergens(String productAllergen) {
		allergen = productAllergen;
	}
	
	public String getAllergens() {
		return allergen;
	}
	
	public void setCalories(String productCalories) {
		calories = productCalories;
	}
	
	public String getCalories() {
		return calories;
	}

	public String examine() {
		return name + ", " + cost + " kr, " + allergen + ", " + calories;
	}
	
	public String use() {
		return name + " used";
	}
}