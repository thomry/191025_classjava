package object_oriented;

class MemberCall {
	
	int        iv = 10;
	static int cv = 20;
	int       iv2 = cv;
	// static int cv2 = iv; 에러남. class변수는 인스턴스 변수 사용불가능함.
	static int cv2 = new MemberCall().iv; // 객체 생성시 사용가능

	static void staticMethod1() {
		System.out.println(cv);
		// System.out.println(iv)l // error. class method에서 instance 변수 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		/*
		 * instanceMethod1(); - error
		 * class method에서는 instance method를 호출할 수 없습니다.
		 */
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {	/* instance method에서 instance method & class method
								 * 전부 instance 생성없이 호출 가능
								 */
		staticMethod1();
		instanceMethod1();
	}

}
