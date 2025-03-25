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
git add . (본인이 작성 혹은 수정한 사항을 commit 대기 상태로 등록)
git commit -m “#이슈번호 커밋타입: 커밋메시지”
git pull origin main (본인 프로젝트를 현재 깃허브의 프로젝트 코드와 동기화)
git push origin 본인브랜치명
pull request  (조원 모두 참여 및 확인)

## Commit Message 규칙
제목과 본문을 빈 행으로 구분한다.
제목은 50글자 이내로 제한한다.
제목의 첫 글자는 대문자로 작성한다.
제목 끝에는 마침표를 넣지 않는다.
제목은 명령문으로 사용하며 과거형을 사용하지 않는다.
본문의 각 행은 72글자 내로 제한한다.
어떻게 보다는 무엇과 왜를 설명한다.


## Commit Message 구조
// Header, Body, Footer는 빈 행으로 구분한다.
타입(스코프): 주제(제목) // Header(헤더)

본문 // Body(바디)

바닥글 // Footer
Commit 규칙
#feat

본문 // Body(바디)

바닥글 // Footer
타입 이름 내용     feat 새로운 기능에 대한 커밋   fix 버그 수정에 대한 커밋   build 빌드 관련 파일 수정 / 모듈 설치 또는 삭제에 대한 커밋   chore 그 외 자잘한 수정에 대한 커밋   ci ci 관련 설정 수정에 대한 커밋   docs 문서 수정에 대한 커밋   style 코드 스타일 혹은 포맷 등에 관한 커밋   refactor 코드 리팩토링에 대한 커밋   test 테스트 코드 수정에 대한 커밋   perf 성능 개선에 대한 커밋   Body는 Header에서 표현할 수 없는 상세한 내용을 적는다.
Header에서 충분히 표현할 수 있다면 생략 가능하다.
Footer는 바닥글로 어떤 이슈에서 왔는지 같은 참조 정보들을 추가하는 용도로 사용한다.
예를 들어 특정 이슈를 참조하려면 Issues #1234 와 같이 작성하면 된다.
Footer는 생략 가능하다. 아무튼 이슈번호 쓰면됨

Commit Message 예시
git commit -m "feat: 식당관리화면에서 상단 탭 클릭시 화면 전환(spa)

식당관리자가 볼 수 있는 식당관리 화면에서, 상단에 식당관리, 전체예약현황, 리뷰전체보기 탭을 추가하여 해당 탭 클릭시 해당 화면으로 전환

resolves: #7

## 컨벤션 규칙 정의

1. 변수(함수) 명에 대한 Naming Convention
   1.1 변수, 함수, 인스턴스
   ex) camelCase
   1.2 함수명 작성
   함수명을 작성할 때는 동사+명사 형태로 구성
   ex) getUserInfomation()
   1.3 Class, Constructor
   Pascal Case(=upper 카멜 케이스)
   ex) CamelCase
   1.4 글자의 길이
   글자의 길이는 20자 이내로 제한
   4 단어 이상이 들어가거나, 부득이하게 20자 이상이 되는 경우 팀원과의 상의를 거친다.
   1.5 Flag로 사용되는 변수
   플래그(flag)란 ‘깃발’이란 의미이지만, 프로그래밍에서는 ‘상태를 기록하거 처리 흐름을 제어하기 위한 boolean 변수’
   Boolean의 경우 조동사 + flag 종류로 구성됨 ex) isNum, hasNum
   1.6 약칭의 사용
   약어는 되도록 사용하지 않는 것이 좋음
   ex)
   let idx; // bad
   let index; // good
   1.7 최대 tab depth
   tab의 최대 depth는 4로 제한
   이 이상으로 depth가 깊어지면 함수를 통해 나눌 것
   ex)
   function func () {
   //tab1
   if() {
   //tab2
   array.reduce((pre,cur) ⇒ {
   1.8 주석 규칙
   한줄은 //로 적고, 그 이상은 /** */ 로 주석작성
   1.9 함수 파라미터 개수 제한
   함수의 인자로 변수를 선언하는 것은 3개까지 가능
   function test (a,b,c) {
   console.log(a,b,c) ⇒ good
   }
   1.10 비동기 함수의 사용
   async, await를 사용

## DB 이름 , Table 이름

데이터 베이스 명명 규칙
2.1 DB 이름 (스키마)
데이터베이스 명은 영어 소문자, 길이는 8자 이내로 구성

2.2 테이블
테이블명은 단수로한다.
테이블은 영어 소문자로 구성, 대분류_의미 있는 테이블 명 형태
테이블 명의 구성은 최대 3 단어까지 사용할 수 있음
각 단어의 최대 길이는 8자 이내로 구성
최대 길이는 26자 이내로 구성

2.3 컬럼
컬럼은 snake 표기법을 따르고, 의미 있는 컬럼명_접미사 형태로 작성
snake 표기법, 의미 있는 컬럼명_접미사 형태로 작성
컬럼의 성질을 나타내는 접미사 사용(사용 하는 데이터 타입 나타내는 것 아님)

## 개선점

기존 순수 Java 기반 프로젝트를 Spring Boot 프레임워크로 전환하고, 데이터 접근 계층에는 MyBatis를 적용하여 생산성과 유지보수성을 향상시켜야 한다.


