/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This program is a contact searcher and brings up contacts as needed.
//
//
////////////////////////////////////////


import java.util.Scanner;
public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contact test, found;
		Contact[] freinds = new Contact[5];
		 String userInput = "";
		 String fname ="";
		 String lname = "";
		freinds[0] = new Contact ("Apple", "Store", "610-555-7384");
		freinds[1] = new Contact ("Panda Express", "Resturant", "610-444-4432");
		freinds[2] = new Contact ("Taco Sauna", "Returant", "610-333-2222");
		freinds[3] = new Contact ("The Bridge Pizza", "Resturant", "610-222-4564");
		freinds[4] = new Contact ("Mom", "Melin", "610-333-2222");
		
		Scanner scan = new Scanner (System.in);
			System.out.println("Enter "+" a "+"for sorting values in ascending order and "+"d"+ " for desending order");
			userInput = scan.next();
			scan.nextLine();
		
				if (userInput.equals("a"))
				{
					Sorting.selectionSort(freinds);
					for(Contact friend : freinds)
						System.out.println(friend);
				}else{
					Sorting.insertionSort(freinds);
				for(Contact friend : freinds)
					System.out.println(friend);
				
				}
				System.out.println("Select the Name of Contact");
				fname = scan.nextLine();
				
				
				System.out.println("Select the type of contact");
				lname = scan.nextLine();
				
				
				test = new Contact (fname, lname, "");
				System.out.println(test);
				found = (Contact) Searching.binarySearch(freinds, test);
				if(found != null)
					System.out.println("Found: " + found);
				else
					System.out.println("The contact was not found");
				
	}

}
