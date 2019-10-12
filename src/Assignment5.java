import java.util.Scanner;

public class Assignment5 {
	public static void main(String[]args)
	{
		//create a variable to make our arrays with
		int classsize;
	
		//prompt and grab the input to create our arrays with
		System.out.print("Please enter the number of students: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		classsize = input.nextInt();
		System.out.println();
		
		//create a String and double array to hold our data based on the input from the user
		double[] classscores = new double[classsize];
		String[] classnames = new String[classsize];
	
		//a for loop that prompts and saves data from the user into both our arrays
		for(int c = 0; c<classscores.length; c++)
		{
			System.out.print("Please enter the student's name: ");
			classnames[c] = (String) input.next();
			System.out.print("Please enter "+classnames[c]+"'s score: ");
			classscores[c] = input.nextDouble();
			System.out.println();
		}
		//print some lines to mark the end of the loop
		System.out.println("end of input");
		System.out.println("-------------------------------------- \n \n");

		//call our sorting method and pass it our array references
		selectionSort(classscores,classnames);
		//print our headers
		System.out.println("The class size is "+classsize+"\n");
		System.out.printf("%-17.15s  %-10.10s%n", "Names", "Scores");
		System.out.printf("%-17.15s  %-10.10s%n", "---------------", "------");
		//a for loop that prints our array contents in columns
		for(int c=0; c<classsize; c++)
		{
		System.out.printf("%-17.15s  %-10.10s%n", classnames[c], classscores[c]);
		}
	}
	
	//our sorting method that sorts our arrays based on the double values from greatest to least
	public static void selectionSort(double[]score,String[]name)
	{
		//we run 2 for loops, one to control the overall array scan and another to make sure each value is compared to the rest of the array
		for(int c=0; c<score.length; c++)
		{
			for(int count=0;count<score.length; count++)
			{
				//we test the current loop value to every other value in the array
				if(score[c] > score[count])
				{
					//if the test passes, we simply perform a swap
					double temp;
					temp= score[c];
					score[c] = score[count];
					score[count] = temp;
					String s;
					s = name[c];
					name[c] = name[count];
					name[count]=s;
				}
			}
		}
	}
	
}//silly end comment
