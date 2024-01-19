package Algorithm.Queue;

import java.util.LinkedList;
import java.util.Queue;
public class QueueAlgorithm {
    public static void main(String[] args) {
        // 큐 만들기
        Queue<Integer> queue = new LinkedList<>();

        // 큐에 데이터 삽입
        // queue.add() vs queue.offer()
        // queue.add() : 성공 시 true, 실패 시 IllegalStateException 에러 발생
        // queue.offer() : 성공 시 true, 실패 시 false 발생

        // 1부터 5까지 숫자 삽입
        for (int i=1; i<=5; i++) {
            queue.offer(i);
        }

        // queue.peek() : queue에 맨앞에 있는 값 찾기
        // 비어있을 경우 null 반환
        int first = queue.peek();
        System.out.println(first); // 1

        // 큐에 들어있는 데이터 삭제

        // queue.poll() : 큐 맨 앞에 있는 값 반환 후 삭제, 큐가 비어있을 경우 null 반환
        // queue.remove() : 큐 맨 앞에 있는 값 반환 후 삭제, 큐가 비어 있는 경우 NoSuchElementException 에러 발생
        // queue.clear() : 큐 비우기

        queue.poll();

        System.out.println(queue); // [2, 3, 4, 5]
    }
}