# Bianry Search(이진 탐색)

### Binary Search(이진 탐색) 의 전제조건
- `오름차순 또는 내림차순으로 정렬되어 있어야 함`

### 이진탐색
`left`, `right`, `middle` 값을 가진다

#### 초기값(초기 인덱스)
- `left = 0`
- `right = 배열의 요소 갯수 - 1`
- `middle = right / 2`

#### 방법
- `찾고자 하는 값을 X라 하자`
- `배열을 arr이라고 선언하자`
- `오름차순이라고 하자`
- `middle 값을 기준으로 탐색하고자 하는 값이 더 큰지 작은지 판별`


1. `arr[middle] < X` 일 때

   - `X` 보다 `arr[middle]`이 더 작다
   - 따라서 찾고자하는 값은 현재 위치보다 더 오른쪽에 존재
   - left 값을 비교위치 +1로 옮긴다

2. `arr[middle] > X` 일 때

   - `X` 보다 `arr[middle]`이 더 크다
   - 따라서 찾고자하는 값은 현재 위치보다 더 왼쪽에 존재
   - right 값을 비교위치 -1로 옮긴다

3. `arr[middle] == X` 일 때

    - `X`와 `arr[middle]`이 같다
    - 탐색 성공!



