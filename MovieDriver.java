import java.util.Scanner;
public class MovieDriver {
	public static void main (String [] arg) {
		Scanner in = new Scanner(System.in);
		String movie, rating = null;
		int numOfTickets = 0;
		char choice;
		
		
		do {
		System.out.println("Enter the name of the movie:");
		movie = in.next() + in.nextLine();
		
				Movie Movie_Title = new Movie(movie, rating, numOfTickets);
		Movie_Title.setTitle(movie);
		
		
		System.out.println("Enter the rating of the movie");
		rating = in.next();
		
		Movie Movie_rate = new Movie(movie, rating, numOfTickets);
		Movie_rate.setRating(rating);
		
		
		System.out.println("Enter the number of tickets sold for this movie");
		numOfTickets = in.nextInt();
		
		Movie Movie_tickets = new Movie(movie, rating, numOfTickets);
		Movie_tickets.setSoldTickets(numOfTickets);
		
		Movie Movie_Object = new Movie(movie, rating, numOfTickets);	
		
		System.out.println(Movie_Object.toString());
		
		System.out.println("Do you want to enter another? (y or n)");
		choice = in.next().charAt(0);
		
		
		}while (choice == 'y' || choice == 'Y');

		System.out.println("Good Bye");
	}
}