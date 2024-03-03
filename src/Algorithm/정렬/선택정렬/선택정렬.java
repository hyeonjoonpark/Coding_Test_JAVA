package Algorithm.정렬.선택정렬;

import java.util.Scanner;

public class 선택정렬 {
  static void selectionSort(int[] a) {
    for(int i=0; i<a.length; i++) {
      int min = i;
      for(int j=i+1; j<a.length; j++) {
        if(a[j] < a[min]) {
          min = j;
        }
      }
      swap(a,i, min);
    }
  }
  static void swap(int[] a, int n, int m) {
    int temp = a[n];
    a[n] = a[m];
    a[m] = temp;
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

    selectionSort(x);

    for(int i=0; i<n; i++) {
      System.out.print(String.format("x[%d] = %d ", i, x[i]));
    }
  }
}
