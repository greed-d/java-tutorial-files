public class loop{
  public static void main(String[] args){
    int x = 0;
    //won't execute if condition is false
    while (x<10) {
      System.out.println(x);
      x++;
    }
    
    for (int i = 0; i < 20; i++) {
      System.out.println("The for loop of " + i);
    }

    // will execute once even if the condition is false
    do {
      System.out.println("Do while loop go brr");
      
    } while (false);

  }
}
