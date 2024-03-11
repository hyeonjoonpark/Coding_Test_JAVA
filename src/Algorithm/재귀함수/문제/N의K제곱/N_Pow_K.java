package Algorithm.재귀함수.문제.N의K제곱;

import java.util.Scanner;

public class N_Pow_K {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int MOD = 1000000007;

    int result = calculate(n, k, MOD);
    System.out.println(result);
  }

  public static int calculate(int n, int k, int mod) {
    if (k == 0) return 1;

    long result = 1;
    long x = n % mod;

    while (k > 0) {
      if (k % 2 == 1) result = (result * x) % mod;

      x = (x * x) % mod;
      k /= 2;
    }

    return (int) result;
  }
}
