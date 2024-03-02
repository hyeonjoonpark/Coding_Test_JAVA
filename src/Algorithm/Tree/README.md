# Tree

이진트리
- 여러 개의 노드가 트리 형태로 연결된 구조

### TreeSet
- 이진 트리를 기반으로한 Set 컬랙션

`Set : 순서가 없고 중복이 되지 않는다`

`E first()` : 제일 낮은 객체를 리턴

`E last` : 제일 높은 객체를 리턴

`E lower(E e)` : 주어진 객체보다 바로 아래 객체를 리턴

`E higher(E e)` : 주어진 객체보다 바로 위 객체를 리턴

`E floor(E e)` : 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 아래의 객체를  리턴

`E ceiling(E e)` : 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 위의 객체를  리턴

```java
import java.util.TreeSet;

public class TreeSetAlgorithm {
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
    while(!tree.isEmpty()) {
      treeData = tree.pollFirst(); // 하나씩 tree에서 뽑는다
      System.out.println(treeData);
      System.out.println(tree.size()); // 남은 갯수
    }

  }
}
```

```java
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
      System.out.println(descData);
    }

    NavigableSet<Integer> asc = desc.descendingSet(); // 내림차순을 해놓고 한번 더 하면 ASC
    for (Integer ascData : asc) {
      System.out.println(ascData);
    }
  }
}
```


### TreeMap

```java
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

    while(!scores.isEmpty()) {
      entry = scores.pollLastEntry(); // 뒤에부터 가져옴
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
```


