package Algorithm.Search.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
  public static int binarySearch(int[] arr, int key) {
      int pl = 0;
      int pr = arr.length - 1;

      do {
        int pc = (pl + pr) / 2;

        if(arr[pc] == key) return pc;
        else if(key > arr[pc]) {
          pl = pc + 1;
        }
        else {
          pr = pc -1;
        }
      } while(pl <= pr);

      return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt(); // 배열 요소 갯수 입력
    int key = sc.nextInt(); // 검색할 값
    int[] array = new int[N];

    for (int i = 0; i < N; i++) {
      array[i] = sc.nextInt();
    }

    Arrays.sort(array); // BinarySearch는 무조건 정렬되어있어야 함

//    int result = binarySearch(array, key);
    int result = Arrays.binarySearch(array, key);

    if (result < 0) {
      System.out.println("찾는 값이 존재하지 않습니다");
    } else {
      System.out.println(result); // 찾는 값의 인덱스 출력
    }

    sc.close();
  }
}
