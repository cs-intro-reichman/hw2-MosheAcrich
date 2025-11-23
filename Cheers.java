//feedback

/*
Great work! the use of indexOf is spot on! 
nice:)
*/


// Prints a crowd cheering output.
public class Cheers {
        
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
		int repetitions = Integer.parseInt(args[1]);
		int i = 0;
		int x = 0;
		int y = 0;
		while(i < word.length()){
			if (("AEFHILMNORSX".indexOf(word.charAt(x)) >= 0)){
				System.out.println("Give me an " + word.charAt(x) + ": " + word.charAt(x) + "!");
				i++;
				x++;
				}
			
			else{

			System.out.println("Give me a  " + word.charAt(x) + ": " + word.charAt(x) + "!");
			i++;
			x++;
			}
		}
		
		System.out.println("What does that spell?");
		while(y < repetitions){
			System.out.println(word+"!!!");
			y++;
		}
	    
	    // Replace this comment with your code
        }
}
