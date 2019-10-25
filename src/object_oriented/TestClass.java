package object_oriented;

class TestClass {
	void instanceMethod() {}	  // instance method
	static void staticMethod() {} // static method
	
	void instanceMethod2() {	  // instance method
		instanceMethod();		  // �ٸ� instance method ȣ��
		staticMethod();			  // static method ȣ��
	}
	
	static void staticMethod2() { // static method
		// instanceMethod();	  // error - instance method ȣ���� �� ����
		staticMethod();			  // static method�� ȣ�� ����
	}
}

class TestClass2 {
	int iv;				// insatnce ����
	static int cv;		// class ����
	
	void instanceMethod() {			// instance method
		System.out.println(iv);		// instance ���� ��밡��
		System.out.println(cv);		// class ���� ��밡��
	}
	static void staticMethod() {	// static method
		// System.out.println(iv);  // error - instance ���� ���Ұ���
		System.out.println(cv);		// class ���� ��밡��
	}
}