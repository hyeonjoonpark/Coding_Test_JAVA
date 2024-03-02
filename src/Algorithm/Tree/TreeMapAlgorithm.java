package Algorithm.Tree;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapAlgorithm {
  public static void main(String[] args) {
    TreeMap<Integer, String> scores = new TreeMap<>();

    scores.put(87, "홍길동");
    scores.put(98, "이몽룡");
    scores.put(75, "성춘향");
    scores.put(95, "홍길순");
    scores.put(90, "변학도");

    Map.Entry<Integer, String> entry = null;
    entry = scores.firstEntry();
    System.out.println(entry);
    System.out.println(entry.getKey() + " " + entry.getValue());

    entry = scores.lastEntry();
    System.out.println(entry);
    System.out.println(entry.getKey() + " " + entry.getValue());

    entry = scores.lowerEntry(88);
    System.out.println(entry); // 88보다 아래의 값 출력
    System.out.println(entry.getKey() + " " + entry.getValue());

    entry = scores.higherEntry(88);
    System.out.println(entry); // 88보다 위의 값 출력
    System.out.println(entry.getKey() + " " + entry.getValue());

    entry = scores.floorEntry(88);
    System.out.println(entry); // 88이거나 아래 점수
    System.out.println(entry.getKey() + " " + entry.getValue());

    entry = scores.ceilingEntry(88);
    System.out.println(entry); // 88이거나 위 점수
    System.out.println(entry.getKey() + " " + entry.getValue());

    while (!scores.isEmpty()) {
      entry = scores.pollLastEntry(); // 뒤에부터 가져옴
      System.out.println(entry.getKey() + " " + entry.getValue());
      System.out.println(scores.size());
    }
  }
}
