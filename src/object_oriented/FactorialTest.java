package object_oriented;

class FactorialTest {
	/*
	 * 이 방법은 static over flow가 일어날 수 있을 뿐만아니라
	 * 매개변수 n이 크면 저장한계가 넘어가게됩니다.
	 * 따라서 매개변수 유효성검사를 해야함
	 */

	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if (n<=0 || n >12) return -1; // 매개변수 유효성검사 추가함
		
		if (n == 1)
			result = 1;
		else
			result = n * factorial(n-1); // 자기 자신 다시 호출
		
		return result;
	}

}
