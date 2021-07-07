package GroceryStore_Beverages;

public interface Payment { //interface
	double payment();
}

class AdvertisementandMarketingpromo implements Payment{//exp = expenses
	public double payment() {
		return 20.00;
	}
} 

class Financeexp implements Payment{//exp = expenses
	public double payment() {
		return 1000.00;
	}
} 
