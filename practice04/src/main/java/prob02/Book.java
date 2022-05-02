package prob02;

public class Book {
	private int stateCode =1; // 0이면 대여중 1이면 재고있음
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public Book(int i, String string, String string2) {
		System.out.println("책제목 : "+string+
				" 작가 : "+string2+
				" 대여 유무 : "+(stateCode>0 ? "재고있음" : "대여중"));
	}
	public void print() {
		
		return;
	}
}
