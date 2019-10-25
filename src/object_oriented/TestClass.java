package object_oriented;

class TestClass {
	void instanceMethod() {}	  // instance method
	static void staticMethod() {} // static method
	
	void instanceMethod2() {	  // instance method
		instanceMethod();		  // 다른 instance method 호출
		staticMethod();			  // static method 호출
	}
	
	static void staticMethod2() { // static method
		// instanceMethod();	  // error - instance method 호출할 수 없음
		staticMethod();			  // static method는 호출 가능
	}
}

class TestClass2 {
	int iv;				// insatnce 변수
	static int cv;		// class 변수
	
	void instanceMethod() {			// instance method
		System.out.println(iv);		// instance 변수 사용가능
		System.out.println(cv);		// class 변수 사용가능
	}
	static void staticMethod() {	// static method
		// System.out.println(iv);  // error - instance 변수 사용불가능
		System.out.println(cv);		// class 변수 사용가능
	}
}