package object_oriented;

class BlockTest {
	static {	// class �ʱ�ȭ ��
		System.out.println("static()");
	}
	
	{	// instance �ʱ�ȭ ��
		System.out.println("{ }");
	}
	public BlockTest() {
		System.out.println("������");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest bt  = new BlcotkTest(); ");
		BlockTest bt = new BlockTest();
		System.out.println("BlockTest bt2 = new BlcotkTest(); ");
		BlockTest bt2 = new BlockTest();
	}

}
