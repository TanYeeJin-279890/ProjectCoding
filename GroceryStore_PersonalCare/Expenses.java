package GroceryStore_PersonalCare;

interface Payment { //interface
	double payment();
}

class AdvertisementandMarketingpromo implements Payment{//exp = expenses
	public double payment() {
		return 20.00;
	}
} 

class Inventoryexp implements Payment{//exp = expenses
	public double payment() {
		return 10000.00;
	}
} 

class EmployeeManagement1exp implements Payment{//exp = expenses
	public double payment() {
		return 19000.00;
	}
} 

class Financeexp implements Payment{//exp = expenses
	public double payment() {
		return 1000.00;
	}
} 
