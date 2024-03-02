package Algorithm.Tree;

import java.util.TreeSet;

public class TreeAlgorithm {
  public static void main(String[] args) {
    TreeSet<Integer> tree = new TreeSet<>();

    tree.add(87); // Tree에 값 삽입
    tree.add(98);
    tree.add(75);
    tree.add(95);
    tree.add(80);

    Integer treeFirst = tree.first();
    System.out.println(treeFirst); // 75출력

    Integer treeLast = tree.last();
    System.out.println(treeLast); // 98출력

    Integer treeLower = tree.lower(95);
    System.out.println(treeLower); // 95점 아래 점수 87출력

    Integer treeHigher = tree.higher(95);
    System.out.println(treeHigher); // 95점 위 점수 98출력

    Integer treeFloor = tree.floor(94);
    System.out.println(treeFloor); // 94점 이거나 바로 아래 점수

    Integer treeCeiling = tree.ceiling(94);
    System.out.println(treeCeiling); // 94점 이거나 바로 위 점수

    Integer treeData = null;
    while (!tree.isEmpty()) {
      treeData = tree.pollFirst(); // 하나씩 tree에서 뽑는다
      System.out.println(treeData);
      System.out.println(tree.size()); // 남은 갯수
    }

  }
}
