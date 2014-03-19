package Program3;

public class Sorting {
	public static void selectionSort (Comparable[] list)
	{
		int min; 
		Comparable temp; 

		for (int index = 0; index < list.length-1; index++)
		{
			min = index;
			for (int scan = index+1; scan < list.length; scan++)
				if (list[scan].compareTo(list[min]) < 0)
					min = scan; 

			temp = list[min];
			list[min] = list [index]; 
			list[index] = temp;
		}
		}

public static void insertionSortModel (Comparable[] list)
{
	for (int index = 1; index < list.length; index++)
	{
		Comparable key = list[index];
		int postion = index;
		while (postion > 0 && key.compareTo(list[postion-1]) > 0)
		{
			list[postion] = list [postion -1];
			postion--;
		}

		list[postion] = key;
	}

}
}

	
	
	

