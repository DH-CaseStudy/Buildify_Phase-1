# 📦 BuildiFy - WMS 시스템 (1차 프로젝트)

## 프로젝트 개요
**BuildiFy**는 Java CLI 환경에서 구현된 창고 관리 시스템(Warehouse Management System, WMS)입니다.  
조립형 PC 부품의 입출고 및 재고 관리를 위한 시스템으로, MySQL 데이터베이스를 활용하여 제품의 입고, 출고, 재고 현황을 효율적으로 관리할 수 있습니다.

---

## 🖥 주요 기술 스택
- **Language**: Java
- **Database**: MySQL
- **Framework/Library**: JDBC
- **Version Control**: Git

---

## 📂 프로젝트 구조


```
BuildiFy
├── common
├── config
├── controller
├── domain
│   ├── inbound
│   ├── outbound
│   ├── inventory
│   └── accountManagement
│       ├── User
│       └── Admin
├── dto
├── exception
├── MySql
└── resources
```


- `common`: 공통 유틸 및 상수 정의
- `config`: 환경 설정 파일
- `controller`: 사용자 요청 처리
- `domain`: 도메인별 비즈니스 로직 관리
   - `inbound`: 입고 관리
   - `outbound`: 출고 관리
   - `inventory`: 재고 관리
   - `accountManagement`: 계정 관리 (User, Admin)
- `dto`: 데이터 전달 객체 정의
- `exception`: 예외 처리 모듈
- `MySql`: DB 연결 및 쿼리 처리
- `resources`: 리소스 파일 관리

---

# 프로젝트 실행 가이드

## 실행 방법
- `src` 폴더의 **`Main` 클래스**에서 실행합니다.
- **MySQL Connector JAR** 및 **Lombok 라이브러리**를 미리 세팅해야 합니다.

## 계정 정보
### ✅ 관리자 (ADMIN)
- ID : `admin01`
- 비밀번호 : `admin123`

### ✅ 사용자 (USER)
- ID : `SalesTeam1`
- 비밀번호 : `!dlehdgnl3546`

## 데이터베이스 세팅 방법
기본적인 제품 등록과 / 입고요청은 sql문에 구성되어있습니다.
MySQL 데이터베이스를 아래 방법 중 하나로 설정하세요.


### 1️⃣ 터미널에서 실행
```sh
mysql -u [사용자명] -p [비밀번호] < src/MySql/wmsdb.sql
```




## 🛠 주요 기능

### 사용자(입점 회사)
- 회원가입 신청 → **관리자의 승인 후** 가입 완료
- 로그인
- **입고 요청** 등록
- **출고 요청** 등록
- 자사 **재고 조회**
- **회원 정보 조회 및 수정**

### 관리자
- 사용자 **가입 승인 및 관리**
- **입고 요청 처리 및 입고 관리**
- **출고 요청 처리 및 출고 관리**
- 전체 **재고 관리**
- **관리자 정보 조회 및 수정**

---

## 📦 제품 카테고리 (1차 프로젝트 기준)
- CPU
- 메모리
- RAM
- 그래픽카드
- 모니터
- 마우스
- 키보드

> 📌 **Note**: 2차 프로젝트에서 웹 환경으로 확장 시, 카테고리 추가 및 기능 개선 예정

---

## 🚧 개발 예정 (2차 프로젝트)

- 기존 순수 Java 기반 프로젝트를 **Spring Boot 프레임워크**로 전환  
- 데이터 접근 계층에 **MyBatis**를 적용하여 생산성과 유지보수성 향상  
- 웹 기반 UI 및 기능 확장  
- 제품 카테고리 세분화 및 추가  
- 사용자 경험 향상을 위한 UI 개선


---

## 👥 팀원
- **김선민**
- **김성준**
- **이동휘**
- **신민혁**

---

# 📝 개발 컨벤션


## Git Rule
깃 허브 연동 순서
1. git add . (본인이 작성 혹은 수정한 사항을 commit 대기 상태로 등록)
2. git commit -m “#이슈번호 커밋타입: 커밋메시지”
3. git pull origin main (본인 프로젝트를 현재 깃허브의 프로젝트 코드와 동기화)
4. git push origin 본인브랜치명
5. pull request  (조원 모두 참여 및 확인)

## Commit Message 규칙
1. 제목과 본문을 빈 행으로 구분한다.
2. 제목은 50글자 이내로 제한한다.
3. 제목의 첫 글자는 대문자로 작성한다.
4. 제목 끝에는 마침표를 넣지 않는다.
5. 제목은 명령문으로 사용하며 과거형을 사용하지 않는다.
6. 본문의 각 행은 72글자 내로 제한한다.
7. 어떻게 보다는 무엇과 왜를 설명한다.



## ✅ Commit Message 구조

> `Header`, `Body`, `Footer`는 **빈 줄**로 구분합니다.

타입(스코프): 제목  // Header (헤더)

본문  // Body (바디)

바닥글  // Footer (푸터)

---

## 📌 Commit 타입(Type)

| 타입       | 설명                                                   |
|------------|--------------------------------------------------------|
| `feat`     | 새로운 기능 추가                                       |
| `fix`      | 버그 수정                                              |
| `build`    | 빌드 관련 파일 수정 / 모듈 설치 또는 삭제              |
| `chore`    | 기타 자잘한 작업 (ex. 패키지 정리, 주석 등)            |
| `ci`       | CI 관련 설정 변경                                      |
| `docs`     | 문서 관련 변경                                         |
| `style`    | 코드 포맷, 스타일 변경 (기능에 영향 없음)              |
| `refactor` | 코드 리팩토링 (동작 변경 없이 구조 개선)               |
| `test`     | 테스트 코드 추가 및 수정                              |
| `perf`     | 성능 개선                                              |

---

## 🧾 Commit 작성 규칙

- `Header`, `Body`, `Footer`는 반드시 **빈 줄**로 구분합니다.
- `Header`는 **명령문** 형태로 작성하며, 50자 이내로 간결하게 씁니다.
- `Header`는 **대문자로 시작**, **마침표는 생략**합니다.
- `Body`는 선택 사항이며, **무엇을, 왜 했는지** 설명합니다.
  - 어떻게 했는지는 생략 가능
  - 각 줄은 72자 이내로 작성 권장
- `Footer`에는 관련 이슈 번호를 작성합니다. (예: `resolves: #123`)
  - 생략 가능

---

## ✅ 예시

git commit -m "feat: 식당관리화면에서 상단 탭 클릭시 화면 전환(spa)

식당관리자가 볼 수 있는 식당관리 화면에서,
상단에 식당관리, 전체예약현황, 리뷰전체보기 탭을 추가함.
탭 클릭 시 해당 화면으로 전환되도록 기능 구현.

resolves: #7"


## ✅ 컨벤션 정의

### 1. 변수 및 함수 Naming Convention

1.1 변수, 함수, 인스턴스  
- `camelCase` 사용  
  예: `userList`, `getUserData()`

1.2 함수명 작성  
- `동사 + 명사` 형태  
  예: `getUserInformation()`

1.3 클래스 및 생성자  
- `PascalCase` 사용 (= Upper CamelCase)  
  예: `UserService`, `OrderManager`

1.4 글자 길이 제한  
- 변수명은 **20자 이내**로 작성  
- 4단어 이상이거나, 불가피하게 20자 초과 시 팀원과 상의

1.5 플래그(Boolean) 변수  
- `조동사 + 의미 있는 단어` 조합 사용  
  예: `isAvailable`, `hasPermission`

1.6 약어(축약어) 사용 금지  
- 축약어는 되도록 사용하지 않음  
  예:  
  - `let idx; // bad`  
  - `let index; // good`

1.7 들여쓰기(tab) 깊이 제한  
- 최대 **4 depth**  
- 초과 시 함수로 분리  
  예:
  ```java
  function example() {
      if (condition) {
          array.reduce((prev, curr) => {
              // 최대 4 depth 이하 유지
          });
      }
  }
  ```

1.8 주석 작성 규칙  
- 한 줄: `//`  
- 여러 줄: `/** ... */`

1.9 함수 파라미터 개수 제한  
- **최대 3개까지** 허용  
  예:
  ```js
  function test(a, b, c) {
      console.log(a, b, c); // Good
  }
  ```

1.10 비동기 함수  
- `async/await` 사용을 권장

---

## ✅ DB 네이밍 규칙

### 2.1 데이터베이스 이름 (스키마)
- 영어 **소문자**만 사용  
- 길이는 **8자 이내**로 제한  
  예: `wmsdb`, `orderdb`

### 2.2 테이블 이름
- **단수형** 사용 (예: `user`, `product`)  
- 형식: `대분류_의미있는이름`  
- 규칙:
  - 영어 소문자 사용
  - 최대 3단어까지
  - 단어당 최대 8자
  - 전체 테이블명은 26자 이내

  예:  
  - `user_info`  
  - `product_stock`  

### 2.3 컬럼 이름
- **snake_case** 사용  
- `의미 있는 컬럼명 + 접미사` 형태  
- 접미사는 데이터 타입이 아닌 **성격**을 나타냄  

  예:  
  - `user_id`
  - `created_at`
  - `is_deleted`

---





