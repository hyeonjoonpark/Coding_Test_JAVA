package Algorithm.정렬.삽입정렬;

import java.util.Scanner;

public class 삽입정렬 {

  static void insertSort(int[] a) {
    for(int i=1; i<a.length; i++) {
      int j;
      int temp = a[i];
      for (j=i; j>0 && a[j-1] > temp; j--) {
        a[j] = a[j-1];
      }
      a[j] = temp;
    }
  }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int n = sc.nextInt();
    int[] x = new int[n];

    for(int i=0; i<x.length; i++) {
      x[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++) {
      System.out.print(String.format("x[%d] = %d ", i, x[i]));
    }

    System.out.println("");

    insertSort(x);


    for(int i=0; i<n; i++) {
      System.out.print(String.format("x[%d] = %d ", i, x[i]));
    }
  }
}
