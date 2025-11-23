// space out your code a little! it's too crammed:)
public class TimeCalc {
    public static void main(String[] args) {
       int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
       int minutes = Integer.parseInt("" + args [0].charAt(3) + args [0].charAt(4));
       int timeToAdd = Integer.parseInt(args[1]); // Replace this comment with your code
       int totalMinutes = hours * 60 + minutes + timeToAdd;
       int totalHours = totalMinutes / 60;
       int NewHours = totalHours % 24;  
       int NewMinutes = totalMinutes - (totalHours*60);
       String finalHours = "" + NewHours;
       String finalMinutes = "" + NewMinutes;
       if(NewHours < 10){
         finalHours = "0" + NewHours;
       }
       if(NewMinutes < 10){
         finalMinutes = "0" + NewMinutes;
       }
       System.out.println(finalHours + ":" + finalMinutes);

    }
}
