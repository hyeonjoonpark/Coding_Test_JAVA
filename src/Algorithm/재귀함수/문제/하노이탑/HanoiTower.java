package Algorithm.재귀함수.문제.하노이탑;

import java.util.Scanner;

public class HanoiTower {

  // 원판을 움직이는 함수
  public static void move(int n, char a, char b, char c) {
    if(n == 1) {
      System.out.println(a + "에서 " + c + "로 이동");
    } else {
      move(n-1, a, c, b);  // 첫 번째 단계: n-1개의 원판을 a에서 b로 이동(c를 보조로 사용)
      System.out.println(a + "에서 " + c + "로 이동");  // 두 번째 단계: 가장 큰 원판을 a에서 c로 이동
      move(n-1, b, a, c);  // 세 번째 단계: n-1개의 원판을 b에서 c로 이동(a를 보조로 사용)
    }
  }

  public static void main(String[] args) {
    int n; // 원판의 갯수
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    move(n, 'A', 'B', 'C');
  }
}
