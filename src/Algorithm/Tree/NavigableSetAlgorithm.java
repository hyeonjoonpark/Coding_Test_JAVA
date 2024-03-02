package Algorithm.Tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetAlgorithm {
  public static void main(String[] args) {
    TreeSet<Integer> tree = new TreeSet<>();

    tree.add(87); // Tree에 값 삽입
    tree.add(98);
    tree.add(75);
    tree.add(95);
    tree.add(80);

    NavigableSet<Integer> desc = tree.descendingSet(); // 내림차순 정렬
    for (Integer descData : desc) {
      System.out.println("desc = " + descData);
    }

    NavigableSet<Integer> asc = desc.descendingSet(); // 내림차순을 해놓고 한번 더 하면 ASC
    for (Integer ascData : asc) {
      System.out.println("asc = " + ascData);
    }
  }
}
