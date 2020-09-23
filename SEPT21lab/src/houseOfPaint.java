import java.util.Scanner;
public class houseOfPaint {

	public static void main(String[] args) {
	Scanner Alex = new Scanner(System.in);
	
	//Accept building width
	System.out.println("Enter Width:" );
	int houseWidth = Alex.nextInt();
	
	//Accept building height
	System.out.println("Enter Height: ");
	int houseHeight = Alex.nextInt();
	
	//Accept building length
	System.out.println("Enter Length: ");
	int houseLength = Alex.nextInt();
	
	//Accept numberOfWindows
	System.out.println("Enter number of windows");
	int numberOfWindows = Alex.nextInt();
	
	//Accept windowLength
	System.out.println("Enter length of window");
	int windowLength = Alex.nextInt();
	
	//Accept windowWidth
	System.out.println("Enter width of window");
	int windowWidth = Alex.nextInt();
	
	//Accept numberOfDoors
	System.out.println("Enter number of doors");
	int numberOfDoors = Alex.nextInt();
	
	//Accept length of door
	System.out.println("Enter length of door");
	int doorLength = Alex.nextInt();
	
	//Accept width of door
	System.out.println("Enter width of door");
	int doorWidth = Alex.nextInt();
		
	//Accept square footage to paint
	System.out.println("Enter sqFt to paint");
	int paintSqFt = Alex.nextInt();
	
	//Accept cost per square foot
	System.out.println("Enter sqFt cost");
	int sqFtCost = Alex.nextInt();
		
	//Accept paint cost 
	System.out.println("Enter cost to paint");
	int paintCost = Alex.nextInt();
		
	
	//Compute square footage for normal side
	int sqFt = houseWidth*houseLength;
	System.out.println("Square Foot: "+ sqFt);
	
	//Compute square footage for peak side
	int sqFt2 = (houseWidth*houseLength)+1/2*(houseLength*(houseHeight-houseWidth));
	System.out.println("Square Foot: " + sqFt2);
	
	//Compute square footage for full normal side  x2
	int sqFt3 = 2*(houseWidth*houseLength);
	System.out.println("Square Foot normal: "+ sqFt3);
	
	//Compute square footage for full peak side x2
	int sqFt4 = 2*((houseWidth*houseLength)+1/2*(houseLength*(houseHeight-houseWidth)));
	System.out.println("Square Foot peak: " + sqFt4);
	
	//Compute numberOfDoors x doorWidth x doorLength
	int sqFt5 = numberOfDoors*doorWidth*doorLength;
	System.out.println("Square Foot of doors: " + sqFt5);
	
	//Compute numberofWindows x windowWidth x windowLength
	int sqFt6 = numberOfWindows*windowWidth*windowLength;
	System.out.println("Square Foot of windows: " + sqFt6);
	
	//compute sum of door total and window total
	int sum = sqFt6 + sqFt5;
	System.out.println("sum of doors and window space: " + sum);
	
	//Compute paint cost without windows and doors
	int cost = (sqFt3+sqFt4)-sum;
	System.out.println("Cost without windows and doors: " + cost);
	

	
	
	}
}

