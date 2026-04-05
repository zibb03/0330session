# 📘 Today I learned...

## 1. 오늘 배운 내용

### Week 1 TIL — Java 기초

**날짜**: 2026.04.05 

**학습 주제**: 데이터 타입, 표준 입출력, 조건문, 반복문, 배열

---

### 표준 입출력
Java에서 사용자 입력을 받기 위해서는 **Scanner 패키지**를 별도로 불러와야 한다.  
`System.in`을 통해 키보드 데이터를 읽고, `Scanner` 객체로 타입에 맞게 가공하여 변수에 할당한 뒤,
`System.out`으로 결과를 출력하는 구조다.

```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String s = sc.nextLine();
```

### `sc.nextLine()` 버퍼 처리
`sc.nextInt()` 직후 `sc.nextLine()`을 한 번 더 써야 한다.  
`nextInt()`가 숫자만 읽고 **버퍼에 `\n`을 남기기 때문**이다. 안 쓰면 첫 문자열 입력이 공란이 된다.

### 배열
Java 배열은 한 번 선언하면 **크기를 바꿀 수 없다.**  
그래서 개수를 먼저 입력받고, 그 값으로 배열을 만들어야 한다.

```java
String[] LionNames = new String[LionCount];
for (int i = 0; i < LionCount; i++) {
    LionNames[i] = sc.nextLine();
}
```

## 3. 결과 이미지(스크린샷)
![실행 결과](src/PBL_TIL/week1/week1.png)

---

## 4. 느낀 점

PBL을 하며 세상에는 모르는 함수들이 많다는 생각이 들었다.

차근차근 PBL과 VOD를 수강하며 모르는 부분을 채워가야겠다는 생각이 들었다.

TIL을 적으며 마크다운 연습도 좀 된 것 같다.
