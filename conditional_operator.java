public class conditional_operator {
	public static void main(String[] args) {
		int x = 9;
    int y = 10;
    

    if ( x > y ) {
      System.out.println(x);
    }
    else {
      System.out.println(y);
    }
		
    System.out.println("\n");
    int a = 11;
    int b = 13;
    int c = 9;

    if(a>b && a > c){
      System.out.println(a);
    }
    else if(b > c){
      System.out.println(b);
    }
    else {
      System.out.println(c);
    }
	}
}
