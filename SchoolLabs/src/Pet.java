
public class Pet {
	
//my variables
private String petType;
private String petName;
private int petAge;
private int dogSpaces;
private int catSpaces;
private int daysStay;
private double amountDue;

// constructor takes in all my arguements and sets them to variables.
public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
	super();
	this.petType = petType;
	this.petName = petName;
	this.petAge = petAge;
	this.dogSpaces = dogSpaces;
	this.catSpaces = catSpaces;
	this.daysStay = daysStay;
	this.amountDue = amountDue;
}

//All getters and setters

public int getCatSpaces() {
	return catSpaces;
}



public void setCatSpaces(int catSpaces) {
	this.catSpaces = catSpaces;
}



public String getPetType() {
	return petType;
}

public void setPetType(String petType) {
	this.petType = petType;
}

public String getPetName() {
	return petName;
}

public void setPetName(String petName) {
	this.petName = petName;
}

public int getPetAge() {
	return petAge;
}

public void setPetAge(int petAge) {
	this.petAge = petAge;
}

public int getDogSpaces() {
	return dogSpaces;
}

public void setDogSpaces(int dogSpaces) {
	this.dogSpaces = dogSpaces;
}

public int getDaysStay() {
	return daysStay;
}

public void setDaysStay(int daysStay) {
	this.daysStay = daysStay;
}

public double getAmountDue() {
	return amountDue;
}

public void setAmountDue(double amountDue) {
	this.amountDue = amountDue;
}



}
