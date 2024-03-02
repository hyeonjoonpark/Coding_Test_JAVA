package Algorithm.Search.LinearSearch;

import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열 요소의 갯수
        int X = sc.nextInt(); // 찾아야 하는 값
        int[] arr = new int[N]; // 배열 선언

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt(); // 배열 요소 입력
        }

        int result = Search.find(X, arr);

        System.out.println("요소가 들어있는 인덱스 = " + result);
    }
}

class Search {
  static int find(int X, int[] arr) {
    for(int i = 0; i<arr.length; i++) {
      if(arr[i] == X) {
        return i; // 값을 찾으면 인덱스 반환
      }
    }
    return -1; // 찾는 값이 없으면 -1 반환
  }
}
