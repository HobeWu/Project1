package shape;

public class SortingTechnique {

	
	
	
	public static void sortArr(Shape arr[]) {
		Shape temp;
		int upperX;
		int upperY;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean sort = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if ((arr[j]).compareTo(arr[j + 1]) < 0) {
					temp = arr[j + 1];

					upperX = arr[j].getUpperX();
					upperY = arr[j].getUpperY();
					arr[j + 1] = arr[j];
					arr[j + 1].setUpperX(temp.getUpperX());
					arr[j + 1].setUpperY(temp.getUpperY());
					
					arr[j] = temp;
					arr[j].setUpperX(upperX);
					arr[j].setUpperY(upperY);
					sort = false;
				}
				
			}
			
			
			if (sort) {
				break;
			}
			
			
		}
		
		
	}
	
	
}
