package problem2;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	int stateCode;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void rent() {
		if (stateCode > 0) {
			stateCode--;
			System.out.println(title + "이(가) 대여 됐습니다.");
		}
		else if (stateCode <= 0) {
			System.out.println("재고가 없어 대여할 수 없습니다.");
		}
	}
	
	public void print() {
		String info = "";
		info += "책 제목:" + title + ", ";
		info += "작가: " + author + ", ";
		info += "대여 유무: ";
		if (stateCode > 0) {
			info += "재고있음";
		}
		else if (stateCode <= 0) {
			info += "대여중";
		}
		System.out.println(info);
	}
}
