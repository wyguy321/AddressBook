/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This program designed to assort cars by assending or decending order 
//
////////////////////////////////////////

package Program3;

public class Cars implements Comparable{
private String carMake, carModel = "";
private int carYear =0; 
private double carMilage = 0; 
private double carPrice = 0; 
private int setSort;
private String sorting ="";



public Cars (String make, String model, int year, double milage, double price)
{
	carMake = make; 
	carModel = model; 
	carYear = year; 
	carMilage = milage; 
	carPrice = price; 

}
public Cars(){
	
}

public boolean equals (Object other)
{
	return (carModel.equals(((Cars)other).getMakeName()) && 
			carMake.equals(((Cars)other).getModelName()));
}


	public String getSorting() {
	return sorting;
}

public void setSorting (String sorting) {
	this.sorting = sorting;
}
@Override
	public int compareTo(Object o) {
	
	int value = 0;
	if(this.carPrice  < ((Cars)o).carPrice)
		value = -1;
	else if(this.carPrice > ((Cars)o).carPrice)
	{
		value = 1;
	}
	if(sorting.equals("Price")){
			
		if(this.carPrice  < ((Cars)o).carPrice)
			value = -1;
		else if(this.carPrice > ((Cars)o).carPrice)
		{
			value = 1;
		}
		
	}else if (sorting.equals("Name")){
	

		String otherMake = ((Cars)o).getMakeName();
		String otherModel = ((Cars)o).getModelName();

		if(this.carMake.equals(otherMake))
			value = this.carModel.compareTo(otherModel);
		else
			value = this.carMake.compareTo(otherMake);
	

	}
		
	
	return value;
}
public String getMakeName(){
	return carMake;
}
public String getModelName(){
	return carModel;
}
public String toString()
{
	return "Make:" + carMake +"\t"+ "Model:" + carModel +"\t" + "Year:" + carYear+"\t" + "Milage:" + carMilage + "\t"+ "Price:" + carPrice +"\n" ;
}
}
