package Patterns;

public class pattern {
  public static void main(String[] args) {
    int a = 10;// giving val
    // < less
    // > greater than
    // <= less equal < =
    // >= greater equal > =
    // System.out.println("*");
    // System.out.println("*");
    // System.out.println("*");
    // System.out.println("*");
    // System.out.println("*");
    // BASIC
    // for (int i = 1; i <= 5; i++) {
    //   System.out.print(i + " ");
    // }

    // NESTING
    //PATTERN 1
    System.out.println("PATTERN 1");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 2");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 3");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 4");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print((char)(j+64)+" ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 5");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print((char)(i+64)+" ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 6");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (i%2==0)
          System.out.print("$ ");
        else
          System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 7");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j%2==0)
          System.out.print("$ ");
        else
          System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 8");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 9");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 10");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 11");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((char)(j+64)+" ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 12");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((char)(i+64)+" ");
      }
      System.out.println();
    }
    System.out.println("PATTERN 13");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        if (j%2==0) {
          System.out.print("$ ");
        }else{
          System.out.print("* ");
        }
      }
      System.out.println();
    }
    System.out.println("PATTERN 14");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        if (i%2==0) {
          System.out.print("$ ");
        }else{
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
