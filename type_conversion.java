public class type_conversion {
  public static void main(String[] args) {
    byte b = 127;
    int a = 257;
    float f = 12.5f;
    int x = (int) f;
    b = (byte) a; // Converting integer a to type byte explictly

    System.out.println(b);
    System.out.println(a);
    System.out.println(f);
    System.out.println(x);
  }
}
