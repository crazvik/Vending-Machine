package se.ecutb;

public interface VendingMachine {
	void addCurrency(int amount);
	int getBalance();
	Product request(int productNumber);
	int endSession();
	String getDescription(int productNumber);
	String [] getProducts();
}
