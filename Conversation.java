import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Conversation {
  public static void main(String[] arguments) {
    Integer rounds = 0;
    String statement = ":)";
    Scanner in;
    Scanner in1;
    Integer temp = 0;
    String response = "";
    String word;
    //Boolean ans;
    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> transcript = new ArrayList<>();

    in = new Scanner(System.in);
    System.out.println("How many rounds do you want to play?");
    rounds = in.nextInt();

    System.out.println("Hey! What's up?");

    while (temp < rounds){
      words.clear();
      statement = "";
      response = "";
      in1 = new Scanner(System.in);
      statement = in1.nextLine();
      String str[] = statement.split(" ");
      //ans = str.contains("You");
        for (int i = 0; i <str.length; i++){
          word = str[i];
          if(word.equals("I")){
            word = word.replace("I", "you");}
          else if(word.equals("me")){
            word = word.replace("me", "you");}
          else if(word.equals("am")){
            word  = word.replace("am", "are");}
          else if(word.equals("you")){
            word = word.replace("you", "I");}
          else if(word.equals("my")){
            word = word.replace("my", "your");}
          else if(word.equals("your")){
            word = word.replace("your", "my");}
          words.add(word);
          }

      response = String.join(" ", words);
      System.out.print(response + "?");
      transcript.add(statement);
      transcript.add(response + "?");
      temp += 1;
    }
    
    System.out.println("Transcript:");
    System.out.println(transcript);
    }
  }
//