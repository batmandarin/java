package day01;

public class bar2 {
	public static void main(String[] args ) {
		// 변수 (variable)
		//볌ㄴ수 선언 = 생성
		//변수 선언(생성) : 공간 생성
		//자료형 변수이름;
		//bar가 아니라 var
		//숫자형 변수 : 숫자를 저장할 수 있는 공간
		int 정수변수;
		//소수점 숫자형 변수 : 소수점이 있는 숫자를 저장할 수 있는 공간
		double 실수변수;
		//글자 변수 : 글자를 저장할 수 있는 공간
		String 문자열변수;
		
		//변수에 데이터를 넣는 방법 : =을 기준으로 오른쪽에 있는 값을 왼쪽 공간에 넣는다.
		정수변수 = 23498;
		실수변수 = 5.18;
		문자열변수 = "입력할 공간(용량)에 ㄱ르자를 넗자";
		//=은 대입의 의미임. 수학처럼 왼쪽 오른쪽이 같다는 의미가 아님
		정수변수 = 6689;
		실수변수 = 정수변수;          //는을 기준으로 (=) 왼쪽은 공간, 오른쪽은 값의 역할을 함
		
		//위에서부터 아래로 실행됨
		
		// 변수 사용
		System.out.println(정수변수);
		System.out.println(실수변수);
		System.out.println(문자열변수);

		// 선언과 대입을 동시에 한다. 이것을 초기화라 한다.
		String 글자1 = "공간 생성과 동시에 데이터를 넣는 것을 초기화라 한다.";
		System.out.println(글자1);
		글자1 = "초기화와 대입의 차이점은 앞에 자료형이 있냐 없냐다.";
		글자1 = "초기화 혹은 선언은 같은 이름으로 한번만 가능하고 대입은 무한정 가능하다.";
		System.out.println(글자1);
		//String 글자1;   글자1이 이미 있기 때문에 앞에 자료형을 적으면 안됨 
		
		//int = 숫자(정수)
		//double : 소수점있는 숫자(실수)
		//String : 글자(문자열)
	}

}
