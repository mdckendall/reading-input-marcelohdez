import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a word:");
    
    try (var scn = new Scanner(System.in)) { // auto close scanner
      var word = scn.next();
      System.out.println(word.length());
    }
  }
}
