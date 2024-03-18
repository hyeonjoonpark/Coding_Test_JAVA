package Algorithm.문제.동적계획법;

import java.util.Scanner;

public class DP {
  public static int calculate(int a, int b, int[] arr) {
    int sum = 0;
    for(int i=a-1; i<=b-1; i++) {
      sum += arr[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a, b;
    int[] arr = new int[n];

    for (int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<m; i++) {
      a = sc.nextInt();
      b = sc.nextInt();

      System.out.println(calculate(a, b, arr));
    }
  }
}
