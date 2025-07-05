package Operators;

public class op {

  public static void main(String[] args) {
    // 1. Arithmetic Operators
    int a = 15;
    int b = 10;
    System.out.println("Addition: " + (a + b));
    System.out.println("Substraction: " + (a - b));
    System.out.println("Multiplication: " + (a * b));
    System.out.println("Divide: " + (a / b));// quotient
    System.out.println("Mod: " + (a % b));// remainder

    // // 2. Relational (Comparison) Operators
    // int a = 15;
    // int b = 10;
    System.out.println(a == b);// false it's double equal to ==
    System.out.println(a > b);// true
    System.out.println(a < b);// false
    System.out.println(a <= b);// false
    System.out.println(a >= b);// true
    System.out.println(a != b);// true

    // 3. Logical Operators
    // || or ||
    // int a = 15;
    // int b = 10;

    // &&
    if (true && true) {
      System.out.println("Fam wins");
    }
    if (true || true) {
      System.out.println("YO");
    }
    if (!(a < b)) {
      System.out.println("How are you");
    } else
      System.out.println("I am good");

    // 4. Assignment Operators
    // int a = 15;
    // int b = 10;
    int c = 15;
    // c += a; // c = c+a; 30
    // System.out.println("Add: "+c);
    // c *= a; // c=15,a=15
    // System.out.println("Multi: " + c);
    // c/=a; // c= c/a;
    // System.out.println("Divide: "+c);
    c %= a;// c = 15 a = 15;
    System.out.println("Mod: " + c);

    // 5. Unary Operators
    // ++ , --
    // Prefix = phele
    // postfix = bad
    int z = 5;
    // System.out.println("Prefix:"+(++z));//6
    System.out.println("PostFix:" + (z++));// 5
    System.out.println("Value is updated: " + z);// 6
    System.out.println("Postfix:" + (z++));// 6
    System.out.println("Value is updated: " + z);// 7
    System.out.println("Prefix: " + (++z));

    // 6. Ternary Operator

    int age = 18;
    String type = (age >= 18) ? "Adult" : "Minor";
    System.out.println(type);
  }
}
