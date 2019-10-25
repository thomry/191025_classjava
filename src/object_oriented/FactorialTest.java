package object_oriented;

class FactorialTest {
	/*
	 * �� ����� static over flow�� �Ͼ �� ���� �Ӹ��ƴ϶�
	 * �Ű����� n�� ũ�� �����Ѱ谡 �Ѿ�Ե˴ϴ�.
	 * ���� �Ű����� ��ȿ���˻縦 �ؾ���
	 */

	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if (n<=0 || n >12) return -1; // �Ű����� ��ȿ���˻� �߰���
		
		if (n == 1)
			result = 1;
		else
			result = n * factorial(n-1); // �ڱ� �ڽ� �ٽ� ȣ��
		
		return result;
	}

}
