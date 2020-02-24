package bookapp;

import java.util.*;


public class Boookmanagement {
	private static List<Book> booklist = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			Book book = new Book("책" + i, "저자" + i, 1);
			booklist.add(book);
		}
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.도서등록 | 2.도서대여 | 3.도서반납 | 4.도서현황 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				addBook();
			} else if (selectNo == 2) {
				rentalBook();
			} else if (selectNo == 3) {
				returnBook();
			} else if (selectNo == 4) {
				bookList();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

	private static void rentalBook() {
		System.out.println("--------");
		System.out.println("도서대여");
		System.out.println("--------");
		System.out.print("책 제목 검색> ");
		String bookName = scanner.next();
		
		for (Book book : booklist) {
			if (book.getTitle().equals(bookName)) {
				if (book.getIsAvailable().equals("대여중")) {
					System.out.println("대여중입니다.");
					break;
				}
				book.setIsAvailable("대여중");
				System.out.println(book.getTitle() + "이 대여되었습니다.");
				return;
			}
			
		}
		
	}	
	
	

	private static void bookList() {
		System.out.println("--------");
		System.out.println("도서현황");
		System.out.println("--------");
		System.out.println("총 " + booklist.size() + "권");
		for (Book book : booklist) {
	         String title = book.getTitle();
	         String writer = book.getWriter();
	         int genre = book.getGenre();
	         String status = book.getIsAvailable();
	        
	         System.out.println("제목: " + title +"  "+ "저자: " + writer + "  "+ genre +" "+ status );
	  }
	}
		

	private static void returnBook() {
		System.out.println("--------");
		System.out.println("도서 반납");
		System.out.println("--------");
		System.out.println(	"반납할 도서명 >");
		String bookName = scanner.next();

		for (Book book : booklist) {
			if (book.getTitle().equals(bookName)) {
				book.setIsAvailable("대여 가능");
				System.out.println(book.getTitle() + "이 반납되었습니다.");
				return;
			} 
			
		}
		
	}	
	
	
		
	
	
	private static void addBook() {
		
		System.out.println("--------");
		System.out.println("도서 등록");
		System.out.println("--------");
		System.out.print("책이름:");
		String title = scanner.next();
		System.out.print("저자:");
		String writer = scanner.next();
		System.out.print("장르(1.문학 2.비문학):");
		int genre = scanner.nextInt();
		
		Book addbook = new Book(title, writer, genre);
		addbook.setTitle(title);
		addbook.setWriter(writer);
		addbook.setGenre(genre);
		
		booklist.add(addbook);
		
		System.out.println("등록성공!");
		
	 }
	 
}
		

