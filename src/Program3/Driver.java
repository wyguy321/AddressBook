package Program3;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Cars[] car = null;	
		String userinput;
		Cars user = new Cars();
		File CarFile = new File("./src/Program3/"+"CarFile");
		Scanner myScanner = new Scanner(CarFile);
		try {
		myScanner = new Scanner(CarFile);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		int i =0;
		car = new Cars[4];
	while(myScanner.hasNext())
	{
		
		
		String x = myScanner.nextLine();
		//System.out.println(x);
		Scanner myLineScanner1 = new Scanner (x);
		myLineScanner1.useDelimiter(",");
		while(myLineScanner1.hasNext()){
			
			String carMake = myLineScanner1.next();
			String carModel = myLineScanner1.next();
			int year = myLineScanner1.nextInt();
			double carMilage = myLineScanner1.nextDouble();
			double carPrice = myLineScanner1.nextDouble();
			
			
			
			
			car[i] = new Cars(carMake, carModel, year, carMilage, carPrice);
			
		
			
		}
		i++;
	
	}
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter: Name, to sort by name. Enter: Price, to sort by price");
		userinput = scan.next();
		
		
		//Sorts car type
		Sorting.selectionSort(car);
		
		for (Cars carM: car){
			user.setSorting(userinput);
		System.out.print(carM);
		}
}
	
}