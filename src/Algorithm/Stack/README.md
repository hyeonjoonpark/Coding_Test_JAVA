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