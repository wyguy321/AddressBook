/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class compares the object and retrives the first name for the assortment 
//
//
////////////////////////////////////////

public class Contact implements Comparable<Object> {

	private String firstName, lastName, phone;

	public Contact(String first, String last, String telephone)
	{
		firstName = first; 
		lastName = last; 
		phone = telephone; 
	}

	public String toString()
	{
		return lastName + ", " + firstName + "\t" + phone;
	}

	public boolean equals (Object other)
	{
		return (lastName.equals(((Contact)other).getfirstName()) && 
				firstName.equals(((Contact)other).getlastName()));
	}

	@Override
	public int compareTo(Object other) {
		int result; 

		String otherFirst = ((Contact)other).getfirstName();
		String otherLast = ((Contact)other).getlastName();

		if(lastName.equals(otherLast))
			result = firstName.compareTo(otherFirst);
		else
			result = lastName.compareTo(otherLast);
		return result; 


	}
	public String getfirstName(){
		return firstName;
	}
	public String getlastName(){
		return lastName;
	}

} 




