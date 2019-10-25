package object_oriented;

class Document {
	static int count = 0;
	String name;			// 문서명
	
	Document(){				// 문서생성시에 문서명 지정하지 않았을 경우
		this("제목없음"+ ++count);
	}
	Document(String name){
		this.name = name;
		System.out.println("문서 "+this.name+"가 생성되었습니다.");
	}
}

class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}

}
