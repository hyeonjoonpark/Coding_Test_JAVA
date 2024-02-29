# Stack

### 1. Stack 생성

- Stack 클래스 선언

```java
import java.util.Stack;

public class 스택 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // Stack 생성

        // Stack에 값 넣기 push()
        // 1부터 5까지 숫자 넣기
        for (int i=1; i<=5; i++) {
            stack.push(i);
        }

        // Stack이 비어있는지 확인 isEmpty()
        boolean result = stack.isEmpty();

        // 만약 Stack이 비어있지 않으면
        if(!result) {
            // Stack에서 값 제거 pop()
            stack.pop(); // 마지막에 들어간 값인 5제거 (Last In First Out)
        }

        System.out.println(stack); // [1, 2, 3, 4]
    }
}
```

### 2. Stack 함수

- `stack.push(value)` : stack에 값 추가
- `stack.pop()` : stack에서 제일 마지막에 추가된 값 삭제 및 출력
- `stack.peek()` : stack에서 가장 마지막 값을 출력은 하지만 삭제는 하지 않음
- `stack.search(value)` : stack에 값이 들어있는지 검색
  - 들어있으면 인덱스 반환
  - 없으면 -1 반환
- `stack.contains(value)` : stack이 값을 포함하고 있는지
  - 들어있으면 true
  - 없으면 false
-
