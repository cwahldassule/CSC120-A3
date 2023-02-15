import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
class Conversation {
  /**
   * Chat bot has convorsation with user
   * @param arguments
   */
  public static void main(String[] arguments) {
    int rounds = 0;
    String statement = ":)";
    Scanner in;
    Scanner in1;
    int temp = 0;
    String response = "";
    String word;
    Boolean ans = false;
    Random rand = new Random();
    ArrayList<String> rand_res = new ArrayList<>(Arrays.asList("wow!","That's crazy!",
                                                              "I understand","... okay?", 
                                                              "I don't know about that","Are you sure?","Amazing!"
                                                              ));
    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> transcript = new ArrayList<>();

    in = new Scanner(System.in);
    System.out.println("How many rounds do you want to play?");
    rounds = in.nextInt();

    System.out.println("Bot: Hey! What's up?");

    while (temp < rounds){
      ans = false;
      words.clear();
      statement = "";
      response = "";
      in1 = new Scanner(System.in);
      statement = in1.nextLine();
      transcript.add(statement);
      String str[] = statement.split(" ");
      for (int a = 0; a <str.length; a++){
        if(str[a].equals("I")
            ||str[a].equals("me")
            ||str[a].equals("am")
            ||str[a].equals("you")
            ||str[a].equals("my")
            ||str[a].equals("your")
            ||str[a].equals("I'm")){
              ans = true;}}
        
        if(ans.equals(true)){
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
            else if(word.equals("I'm")){
                word = word.replace("I'm", "you're");}
            else if(word.equals("you're")){
                  word = word.replace("you're", "I'm");}
            words.add(word);}
            response = String.join(" ", words);
            System.out.println("Bot: " + response + "?");
            transcript.add("bot:"+ response + "?");}

        
        else if(ans.equals(false)){
          response = rand_res.get(rand.nextInt(7));
          System.out.println("Bot: " + response);
          transcript.add("Bot: " + response);}
      temp += 1;}
    System.out.println("");
    System.out.println("Transcript:");
    System.out.println(transcript);
    in.close();
      }}
    
