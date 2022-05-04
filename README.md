### 코딩테스트에서 꼭 알아야 할 자바 함수
* substring(0, 7)
  * 0에서 6까지만 표시
  * (7)이면 7부터 끝까지 표시
* replace('#', '1')
  * #을 1로 바꿔줌
* Integer.parseInt(tmp, 2) 
  * 2진수인 tmp를 10진수로 바꿔줌
* nextInt() 
  * 숫자 하나를 입력으로 처리(스페이스바 또는 엔터로 개행 가능)
* Integer.MIN_VALUE 
  * Integer 타입 중 제일 작은 숫자
* Math.max(a, b, c)
  * a,b,c 중 가장 큰 숫자
* HashSet 
  * 중복 제거
  * size 메소드로 갯수 파악
* HashMap
  * map.getOrDefault!!!
  * ketSet!!!
* STACK 
  * pop 은 꺼낸 값을 리턴해주기도 함
  * peek : 스택의 가장 위쪽에 있는 값을 확인만 함(pop은 꺼내면서 확인)
* Character.isDigit : 숫잔지 확인 !!
* Queue queue = new LinkedList<>();
  * offer로 넣고 poll로 확인
  * peek()로 꺼내지는 않고 확인
  * contain(x) - x가 있으면 참