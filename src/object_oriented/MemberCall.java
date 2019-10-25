package object_oriented;

class MemberCall {
	
	int        iv = 10;
	static int cv = 20;
	int       iv2 = cv;
	// static int cv2 = iv; ������. class������ �ν��Ͻ� ���� ���Ұ�����.
	static int cv2 = new MemberCall().iv; // ��ü ������ ��밡��

	static void staticMethod1() {
		System.out.println(cv);
		// System.out.println(iv)l // error. class method���� instance ���� ��� �Ұ�
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
		 * class method������ instance method�� ȣ���� �� �����ϴ�.
		 */
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {	/* instance method���� instance method & class method
								 * ���� instance �������� ȣ�� ����
								 */
		staticMethod1();
		instanceMethod1();
	}

}
