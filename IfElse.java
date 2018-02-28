import java.util.Scanner;

/**
 * 
 * @author Mark's Laptop
 *This program will determine if the user wants to display a set of variables in Println or Printf.
 *After determining the users preference the program will display the variables
 */
public class IfElse {
/*
 * This
 * Is
 * A
 * Multiple
 * Line
 * Comment
 */
	public static void main(String[] args) {
		int option;
		String s = "Hey there";
		char c = 'm';
		int d = 4;
		double e = 4.203;
		double f =  3.696969;
		Scanner banner;
		//user option input
		System.out.println("Please enter 1 for println \n Please enter 2 for printf");
		banner = new Scanner(System.in);
		option = banner.nextInt();
		//close the scanner
		banner.close();
		//Println vs. Printf
		if(option==1){
			System.out.println("The string is "+s+"\n The char is "+c+"\n The doubles are "+d+","+e+", and "+f);
		} else {
				System.out.printf("The string is %s. ",s); 
				System.out.printf("The char is %c. ",c);
				System.out.printf("The first double is %d. ",d);
				System.out.printf("The second double is %2.2e. ",e);
				System.out.printf("The last double is %2.2f. ",f);
			}
		}

	}

