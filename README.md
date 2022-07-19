# java STUDY

## 환경변수 설정

    - 환경변수 설정을 해줌으로서 명령프롬프트에서 Javac.exe와 Java.exe를
     어느 경로에서든 실행 가능하게 해줌.

    - 하는 방법은 윈도우 기준 시스템 - 고급시스템 관리 - 환경 변수설정

    * Class path
      - 클래스 패스란 자바 가상머신이 클래스 파일을 찾는 경로이다.
      - 명령 프롬포트에서는 set classpath로 현재 클래스패스를 확인
      그 후 없다면 set classpath=C:\java\javastudy 이런식으로 활용 가능

      - 현재 디렉토리도 같이 설정해주기 위해서는
      set classpath=.;C:\java\javastudy와 같이 설정한다.

## 패키지

    - 패키지는 클래스를 묶는 수단
    - 패키지는 수많이 있기에 그 안의 클래스 이름이 서로 겹칠 수도 있다.
    - 패키지로 인해
      1. 서로 다른 패키지의 두 클래스는 인스턴스 생성시 사용하는 이름이 다름. 
      2. 서로 다른 패키지의 두 클래스 파일은 저장되는 위치가 다르다.

    - 패키지 이름은 모두 소문자로 구성한다.
    - 패키지 선언 방법 : 
    ex) package javastudy;를 java 소스파일 앞에 기입함으로써 패키지로 묶였다고 표현
    
    - 패키지 컴파일 방법 
      : javac -d <directory> <filename>
      ex) javac -d . practice1/PrinterDriver.java
    
    - 컴파일 된 패키지로 묶인 클래스 실행 방법
      주의할점) java PrinterDriver로 실행하면 안된다.
      올바른 방법) java practice1.PrinterDriver 앞에 package이름이 붙어야 한다.

    패키지의 이름을 계속 달고 다니는 것은 힘들기에
    패키지 이름 생략을 사용하는데 import키워드를 통해 선언 가능하다.

## 자바에서 주의할 특이점

    - 하나의 소스파일에는 public으로 선언된 클래스의 정의를 하나만 둘 수 있다.
    - 소스파일의 이름은 public으로 선언된 클래스의 이름과 동일해야 한다.

  

## 컴파일
    - Javac <java file>로 컴파일 가능하다.
    (패키지로 안 묶여 있는 파일의 경우)
    + ex) javac PrinterDriver.java
    - 컴파일 후 확인해보면 class파일이 생성된 것을 확인 가능하다.

    - Javac.exe : 자바 컴파일러
        - 자바 컴파일러에 의해서 생성되는 코드 : 자바 바이트 코드

    - Java.exe : 자바 런처(자바 가상머신 구동 후 자바 프로그램이 실행되게 해줌)

    - 컴파일 후 실행
      
      - 컴파일 된 class 파일을 cmd로 실행시키는 법
      (패키지로 안 묶여 있는 파일의 경우)
        -> ex) java PrinterDriver

## 자바의 실행 원리

    - 자바 프로그램은 운영체제 위에서 동작하는 JVM(java virtual Machine)
    에 의해 동작하게 된다.
    - 자바 가상머신은 다른 운영체제에 의해 존재하는 차이점을 해결해준다.


## 자바의 기본 자료형

    1. 정수 자료형 : byte, short(2byte), int(4byte), long(8byte)
      - 자바 가상머신은 정수형 연산을 4바이트인 int형으로만 해결

    2. 실수 자료형 : float(4byte), double(8byte)
    
    3. 문자 자료형 : char

    4. 논리 자료형 : boolean (true or false)

    - 자바에서 상수 표현
      : final이라는 선언 추가
      ex) final int Max = 100;
      
      * 정수형 상수 표현 

        - 10진수일 경우 : 그대로
        - 8진수일 경우 : 숫자앞에 0삽입 ex) 011
        - 16진수일 경우 : 숫자앞에 0x삽입 ex) 0x11

      * 형 변환

        - 자동 형 변환 : 자료형의 크기가 큰 방향으로 형 변환
        or 자료형의 크기에 상관없이 정수 자료형보다 실수 자료형이 우선
      
        - 명시적 형 변환 : 명시적으로 형 변환 ex) (int)num1

## 조건문과 반복문

    * 조건문

      - if else문

        - elif문은 없어짐.
      
      - 조건 연산자 (if-else문과 같은 방식)
        
        - 조건? true일 경우 실행할 문 : false일 경우 실행할 문
        ex) (num1 > num2)? -50 : 50;

      - switch case문
        - break로 빠져나와야 한다.
        - default가 없다면 컴파일 오류 발생
        - 제대로 사용하고 싶다면 적절하게 break문을 섞어가면서 사용
    
    * 반복문

      - while문

      - do while문
        - 무조건 한번은 실행되는 차이

      - for문

      - 반복문에서 break활용
        - break문 실행될 시 가장 근접한 거리에서 감싸고 있는 반복문 찾아서 빠져나감
      
      - 반복문에서 continue활용
        - continue에 걸릴 경우 반복문의 나머지 부분을 실행하지 않고 반복을 이어나감

## 메서드

    - 자바 프로그램은 main이라는 이름의 메서드에서부터 시작을 한다.
    - 메서드는 반환 값이 있을 경우 앞에 형을 같이 써준다.
    - 만약 return값이 없을 경우에는 반환형은 void이다.

    * 재귀 메서드
      - 재귀 메서드의 경우 호출시 메서드의 바이트 코드가 복사가 되어 실행된다.

## 메서드 오버로딩

    - 메서드 오버로딩이란 동일한 이름의 메서드를 한 클래스 내에 정의하는 것
    - 생성자도 메서드 오버로딩의 대상이다.
    - 이름은 동일하되 매개변수의 형(type)이 달라야 한다.
    - 반환형이 다른 경우에는 메서드 오버로딩이 성립하지 않는다.

      * 키워드 this
        - this는 오버로딩 된 다른 생성자를 의미
        - this를 이용해 인스턴스 변수에 접근이 가능하다.
        ex) this.data = data; 이런식으로 받아오는 매개변수와 
        인스턴스 변수의 이름이 같을때에도 사용한다.

## 변수의 스코프

    - 중괄호 내에서 선언된 지역변수는 중괄호를 벗어나면 메모리 공간에서 소멸

    * 인스턴스 변수는 같은 클래스 내에 위치한 메소드 내에서 접근 가능
       - 인스턴스(객체) 변수? = 멤버 변수 = 필드
       : class안에서 인스턴스가 생성되면서 초기화 시켜주는 변수들

    * private만 선언된 인스턴스 변수 -> 클래스 내부 접근만 허용
    -> 클래스 외부에서 확인하기 위해 Getter메서드와 Setter메서드를 같이 사용
      - Getter
        -> 인스턴스 변수의 값을 참조하는 용도로 정의된 메서드
        -> 변수 이름이 name일 때 메서드 이름은 getName으로 짓는것이 관례

      - Setter
        -> 인스턴스 변수의 값을 설정하는 용도로 정의된 메서드
        -> 변수이름이 name일 때 메서드 이름은 setName으로 짓는것이 관례
    

## 접근 수준 지시자

    1. public
    2. protected
    3. private
    4. default

    - 클래스 정의 대상 : public, default
      -> public클래스일 경우 어디서든 인스턴스 생성이 가능
      -> default클래스일 경우 동일 패키지로 묶인 클래스 내에서만 인스턴스 생성 가능

    - 인스턴스 멤버 대상 : public, protected, private, default

      -> public : 어디서든 접근 가능
      -> default : 동일 패키지로 묶인 클래스 내에서만 접근 가능
      // default는 int num =0; 이런식으로 사용해야 한다.
      default라는 키워드는 따로 존재하지 않는다.
      -> private : 클래스 내부에서만 접근 가능
      -> protected : 클래스 내부, 동일 패키지, 상속 받은 클래스에서 접근 가능

## 캡슐화

    - 캡슐화는 해당 클래스와 관련 있는 내용을 하나의 클래스에 담되
    가능한 적절하게 담는다는 것

## 클래스 변수 -> static

    - 클래스 변수(static 변수)
    : 선언된 클래스의 모든 인스턴스가 공유하는 변수
    즉 인스턴스 내에 존재하는 변수가 아니라 어떤 인스턴스에 속하지 않은 상태로
    메모리 공간에 딱 하나만 존재하는 변수

    - 클래스 변수 또한 접근 수준 지시자의 규칙을 그대로 적용받음
    - 접근 방법
      
      1. 클래스 내부 접근 : 변수의 이름을 통해 직접 접근
      2. 클래스 외부 접근 : 클래스 또는 인스턴스의 이름을 통해 접근

    - 클래스 변수의 초기화 시점 : 인스턴스 생성 이전에 메모리 공간에 존재
    즉 해당 클래스 정보가 가상머신에 의해 읽히는 순간 메모리 공간에 할당되고 초기화 된다.

    * 고로 클래스 변수의 초기화를 생성자를 통해 하지 않아야 한다.

    -> 클래스 변수는 인스턴스 간에 데이터 공유가 필요한 상황에서 사용

    * static 메서드

      -> 동일하게 인스턴스 생성 이전부터 접근 가능하다.
      -> 어느 인스턴스에도 속하지 않는다.

      -> static 메서드는 인스턴스 변수의 값을 참조하거나 수정하지 않는다.(못한다)
        : 클래스 메서드는 인스턴스에 속하지 않으므로 인스턴스 변수에 접근 불가
        : 같은 이유로 클래스 메서드는 인스턴스 메서드 호출도 불가!
      
      ex) System.out.println
      -> System클래스 내에 위치한 클래스 변수 out이 참조하는 
      인스턴스의 println 메서드를 호출하는 문장

      public static void main : 자바에서의 메인메서드
      -> 메인 메서드는 클래스 외부에서 호출하기에 public이어야 하며
      메인 메서드는 인스턴스가 생성되기 이전에 호출되므로 static이어야 한다.

    - static 초기화 블록 사용
    => 클래스 변수를 선언과 동시에 초기화할 수 있다.
    즉 날짜와 같이 메서드나 다른 변수 값으로 초기화 시키고 싶을때 유용하다.

    ex) static{         // 클래스 로딩 시 단 한번 실행이 된다.
          LocalDate nDate = LocalDate.now();
          date = nDate.toString();
        }

## 클래스

    - 자바에서 클래스는 하나의 틀로 생각하는 것이 좋다.
    - 클래스 = 데이터 + 메서드

    * 클래스(하나의 틀)로 인스턴스를 찍어낸다.
      - 인스턴스의 생성은 new 키워드를 통해서 한다.
      이떄 인스턴스를 참조하는 변수는 참조변수라 부른다.

      ex) BankAccount myAcnt1 = new BankAccount(); 
      -> myAcnt1은 BankAccount객체를 가리키는 참조변수

      * 참조 변수의 특성
        - 참조하는 인스턴스 변경 가능
        - 참조변수로 메서드의 매개로서 객체를 전달도 가능하고
        메서드의 반환으로도 객체를 전달 가능하다.

        - 가르키는 인스턴스(객체)와 관계를 끊을때는 null값을 대입하면 된다.

## 클래스의 상속

    - 상속은 연관된 일련의 클래스들에 대해 공통적인 규약을 정의하는 것이다.
    즉 , 코드의 재활용을 위한 것이 아니다.

    - 상속 정의
      ex) class BusinessMan extends Man {
            //Man을 상속하는 BusinessMan
          }
        => BusinessMan 클래스는 Man 클래스를 상속받음
        => 상속받았기에 Man 클래스의 변수와 메서드가 존재한다.
      상속은 UML로 상속받는 클래스로부터 상속한 클래스로의 화살표로 표시

      => 하위 클래스의 인스턴스 생성 시 상위,하위 클래스의 생성자가 모두 호출된다.
      => 상위 클래스의 생성자가 먼저 호출된다.

      * 상위 클래스의 생성자를 명시적으로 호출하는 방법은 키워드 super을 사용한다.
      * 키워드 super는 상위 클래스의 생성자 호출을 의미한다.
      * 자바는 상속관계에 있을지라도 상위 클래스의 멤버는 
      상위 클래스의 생성자를 통해 초기화하도록 유도하고 있다.

      => 자바에서는 단일 상속만을 지원한다. 
      즉 하나의 클래스는 무조건 하나의 클래스로부터 상속을 받아야 한다.
      대신, 상속의 깊이를 더하는 것은 가능하다 (조부모 클래스 등)

      * Static 선언이 붙는 클래스 변수와 클래스 메소드의 상속

        - 인스턴스의 생성과 상관 없이 접근이 가능하다.
        - 클래스 내부와 외부에서(접근 수준 지시자가 허용하면) 접근이 가능하다.
        - 클래스 변수와 클래스 메서드가 위치한 클래스 내에서는 직접 접근이 가능하다.

        => 상속받은 하위 클래스에서도 상위 클래스처럼 이름만으로
        클래스 변수와 메서드에 접근이 가능하다.
        단) private로 선언이 되었다면 접근 불가능하다.

## 상속의 overriding (오버라이딩)

    - 상속을 위해서는 두 클래스의 관계가 Is-A관계여야 한다.
    - Has-A에 대해서는 말이 많지만 상속관계로 보지 않는것이 옳다.

    * 메서드 오버라이딩

      1. 메서드의 이름, 메서드의 반환형, 메서드의 매개변수 선언
      => 이 모두가 같아야 메서드 오버라이딩이 성립한다.

      * 만약 ChesseCake클래스가 Cake클래스를 상속받았으며 
      Cake클래스의 yummy 메서드를 오버라이딩 했다고 한다면
      Cake인스턴스에서 yummy 메서드를 호출해도 CheeseCake 메서드의
      메서드가 호출된다.
      => Cake의 메서드가 오버라이딩에 의해 '무효화'되었기 때문
      => 오버라이딩 된 메서드를 호출하기 위해서는 super키워드 사용
      ex) super.yummy()로 호출

      => 인스턴스 변수나 클래스 변수는 오버라이딩 되지 않는다.
      * 그러므로 같은 이름의 변수를 사용하는 것은 좋지 않다.

      - 하위 클래스에서 상위 클래스에서 정의된 메서드를 다시 정의
      MobilePhone을 상속받은 SmartPhone이 존재한다고 가정하자.
      여기서 MobilePhone phone = new SmartPhone();
      으로 인스턴스 생성한다해도 문제가 안된다.
      why?) 결국 SmartPhone이 MobilePhone이기 때문 (Is-A관계 형성)

      => 하지만 phone이 SmartPhone에 정의된 메서드의 호출하는 건
      불가능하다. 실제 참조하는 인스턴스가 SmartPhone이지만 안된다.

      why?) phone은 MobilePhone형 참조변수이기 때문에 접근이 가능한 멤버는
      MobilePhone class에 정의되었거나 이 클래스가 상속하는 클래스 멤버로 제한된다.
      즉 , phone이 참조하는 인스턴스가 무엇인지는 상관이 없다.

      => 자바는 메서드 호출 시 참조변수의 형을 참조하여 메서드 호출이 옳은지
      판단한다. (속도가 빠른 판단) (O)
      => 만약 실제 참조하는 인스턴스를 대상으로 호출가능성을 판단하면 
      참조하는 인스턴스가 코드의 흐름에 따라 계속 바뀔수있기에 오래걸리게 된다. (X)

      * 즉 참조변수의 형을 기준으로 접근 가능한 멤버를 제한한다.
      => 명시적 형 변환을 통해서 해줄 수는 있다.

      또한 자바는 참조변수의 형을 기준으로 대입의 가능성을 판단한다!!

## 상속을 사용하는 이유와 instanceof 연산자

    - instanceof 연산자는 참조변수가 참조하는 인스턴스의 클래스나
    참조하는 인스턴스가 상속하는 클래스를 묻는 연산자이다.

    ex) if (ca instanceof Cake) 위와 같이 사용한다.
    => ca가 Cake의 인스턴스이거나 Cake를 상속하는 클래스의 인스턴스인지 묻는 것
    => instanceof 연산자는 명시적 형변환의 가능성을 판단해주는 연산자.

      * 상속을 사용하는 이유

        - 동네친구와 대학친구가 있다고 하자.
        각각을 클래스로 정의해서 따로 저장한다면 두개의 배열을 통해 관리가 필요하다.
        하지만 친구라는 공통규약으로 묶어서 관리한다면 훨씬 편하고 빠르다.
        친구를 상속받게 하면 Friends배열에 모두 넣을 수 있다.

    * Object 클래스 
    => 자바의 모든 클래스는 Object 클래스를 상속한다.
    => Object 클래스는 java.lang 패키지에 묶여 있다.

    * 클래스와 메서드의 final선언
      1. 클래스에 final 선언
        => 다른 클래스가 상속하지 못하게 선언하는 것이다.

      2. 메서드에 final 선언
        => 다른 클래스에서 오버라이딩 하는 것을 금지한다.

    * annotation @Override
      => 이는 개발에서의 실수를 줄여주는 것으로
      Override를 하려는 의도였다는 것을 컴파일러에게 알려줌으로서
      실수를 했을때 컴파일 오류가 생성되게 도와주는 것이다.


## 인터페이스

    - 

## String 클래스

    - 클래스이기에 인스턴스 생성으로 new키워드를 사용한다.
    - 하지만 new키워드를 생략하고 큰따옴표를 이용해 
    문자열을 표현하면 인스턴스 자동생성된다.

    - new키워드를 사용해 생성된 인스턴스는 각각 다른 인스턴스이다.
    - new키워드 없이 생성된 인스턴스는 하나의 인스턴스를 저장해놓고
    참조변수로 가리키게 되어 참조변수가 같은 값을 가리키게 된다.

    * String 인스턴스는 Immutable(변경할 수 없는) 인스턴스이다.

    * String 클래스의 메서드

      - concat (String str)
      : 문자열 연결시키기

      - substring (int beginIndex)
      : 문자열의 일부 추출 (beginIndex ~ 끝까지 추출)

      - compareTo (String anotherString)
      : 문자열 내용 비교

      - valueOf (여러가지 자료형(type))
      : 기본 자료형의 값을 문자열로 바꿈

## StringBuilder 클래스

    - 내부적으로 문자열을 저장하기 위한 메모리 공간을 지님.
    - 메모리 공간의 크기를 인스턴스 생성과정에서 지정가능
    ex) StringBuilder stbuf = new StringBuilder(64);

    - StringBuilder 인스턴스는 메모리 공간을 자기 스스로 관리
    즉 , 부족하면 공간을 스스로 늘린다. (하지만 굉장히 시간이 소요되는 작업)

    * StringBuilder클래스의 생성자
      
      -public StringBuilder()
      => 16개의 문자를 저장할 수 있는 메모리 공간 확보

      - public StringBuilder(int capacity)
      => capacity개의 문자를 저장할 수 있는 메모리 공간 확보

      - public STringBuilder(String str)
      => 전달되는 문자열과 16개의 문자를 저장할 수 있는 메모리 공간 확보

    * StringBuilder 클래스의 메서드

      - public StringBuilder append (여러가지 자료형(type))
      : 기본 자료형 데이터를 문자열 내용에 추가

      - public StringBuilder delete (int start, int end)
      : 인덱스 start부터 end이전까지의 내용을 삭제

      - public StringBuilder insert(int offset, String str)
      : 인덱스 offset의 위치에 str에 전달된 문자열 추가

      - public StringBuilder replace(int start, int end, String str)
      : 인덱스 start부터 end이전까지의 내용을 str의 문자열로 대체

      - public StringBuilder reverse()
      : 저장된 문자열의 내용을 뒤집음

      - public String substring(int start, int end)
      : 인덱스 start에서부터 end 이전까지의 내용만 
      담은 String 인스턴스의 생성 및 반환

      - public String toString()
      : 저장된 문자열의 내용을 담은 String 인스턴스의 생성 및 반환

      ** StringBuilder클래스의 메서드의 반환은 왠만하면 StringBuilder
      이기에 toString()메서드를 적절히 써서 사용한다.

    * StringBuffer클래스는 StringBuilder클래스와 거의 비슷하지만 StringBuffer클래스는
    쓰레드에 안전하지만 StringBuilder클래스는 안전하지 않다는 차이가 있다.
    멀티 쓰레드에 안전하게 설계된 StringBuffer클래스는 속도가 느리다.


## 생성자

    - 생성자는 인스턴스의 초기화를 위한 메서드이다.
    - 인스턴스 생성시 반드시 한번 호출해서 초기화 진행해야 한다.
    * 생성자의 이름은 클래스의 이름과 같아야 한다.
    * 생성자는 값을 반환하지 않고 반환형도 표시하지 않는다.

    - 디폴트 생성자 : 생성자를 생략하면 자바 컴파일러가 디폴트 생성자를 넣어서 컴파일한다.
      ex) public BankAccount(){
        
      }

## 자바의 이름 규칙

    * 자바의 이름 규칙은 권함이고 필수는 아니다.

    - 클래스의 이름 규칙
      * camel case사용
      1. 클래스 이름의 첫 문자는 대문자로 시작한다.
      2. 둘 이상의 단어가 묶여서 하나의 이름을 이룰 때, 새로 시작하는 단어는 대문자로 한다.

      ex) CirclePoint
    
    - 메서드와 변수의 이름 규칙
      1. 변형된 camel case사용
      ex) addYourMoney

    - 상수의 이름 규칙
      1. 변수와 구분이 되게 모두 대문자로 하는것이 관례

## 자바 콘솔 출력과 입력

    - 자바 콘솔 출력

      - System.out.println
      => 참조값이 전달되면, 이 값의 인스턴스를 대상으로 
      toString메서드를 호출하고 반환되는 문자열을 출력
      
      - System.out.print
      => 동일하게 작동하되, 문자열 출력 후 개행하지 않는다.

      - System.out.printf
      => C에서와 마찬가지로 서식 지정자와 같이 출력한다.

    - 자바 콘솔 입력

      - Scanner 클래스
        * java.util패키지에 속해 있다.

        - Scanner(File source)
        - Scanner(String source)
        - Scanner(InputStream source)

        ex) Scanner sc = new Scanner(source);
        => Scanner 인스턴스와 인자로 전달된 source와의 연결로 이어짐.

        Scanner 클래스의 키보드 적용
        ex) Scanner sc = new Scanner(Sysem.in);
        => Source대신 전달된 System.in은 키보드를 의미하는 인스턴스의 참조변수이다.

        - 주요 메서드

        1. int nextInt()
        2. byte nextByte()
        3. String nextLine()
        4. double nextDouble()
        5. boolean nextBoolean()


## 자바에서의 배열

    - 배열은 자료형이 같은 둘 이상의 값을 저장할 수 있는 메모리 공간이다.
    - 자바에서는 배열도 인스턴스로 처리한다.

    - 1차원 배열

      - String [] ref = new String[5];
      => 길이가 5인 String형 1차원 배열의 생성 문
      String [] ref -> String형 1차원 배열 인스턴스를 참조할 수 있는 참조변수 선언

      new String[5] -> String형 값 5개를 저장할 수 있는 '배열 인스턴스의 생성'

      * 할당
      ex) ref[0] = new String("Java");
      
      * 생성과 동시에 초기화
      ex) int [] arr = new int[3] {1,2,3};
      int[] arr = new int[10]; //기본적으로 모든 요소를 0으로 초기화한다.
      String[] ar = new String[10]; //String타입의 경우 기본으로 null로 초기화

      * 초기화에 대한 메서드
        - java.util.Arrays 클래스에 정의되어 있다.
        - public static void fill(int []a, int val)
        => 두번째 인자로 전달된 값으로 배열 초기화
        - public static void fill(int []a, int fromIndex, int toIndex, int val)
        => 인덱스 fromIndex~(toIndex-1)의 범위까지 val의 값으로 배열 초기화

      * 배열의 복사
        - public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        => java.lang.System 클래스에 정의되어 있다.
        => 복사원본의 위치 : 배열 src의 인덱스 srcPos
        => 복사대상의 위치 : 배열 dest의 인덱스 destPos
        => 복사할 요소의 수 : length

      * 배열의 복사를 이용해 main메소드에 매개변수 넣기
        - public static void main(String [] args)
        => 이러한 형태의 args에 매개변수를 넣어주는 방법은
        명령 프롬포트에서 실행할때 java Simple Coffee Milk Orange
        => Simple.java에 Coffee,Milk,Orange 매개변수를 넘겨줌
      
      * enhanced for
        ex) for(int e : ar){
              System.out.println(e)
            }
            => ar 배열에 담긴 인스턴스에 대해서 모두 출력하라
      
      * 다차원 배열
        ex) int arr[][] new int[3][4];
        이런식의 이차원 배열일 때에 참조변수 arr가 참조하는 배열은
        arr[0], arr[1] , arr[2] 배열이다.
        그리고 각 arr[0], arr[1], arr[2], arr[3]은 
        길이가 4인 1차원 배열을 참조한다.

