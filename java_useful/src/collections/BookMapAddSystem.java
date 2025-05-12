package collections;

import java.util.HashMap;

public class BookMapAddSystem {

    private HashMap<String, Book> bookHashMap;

    public BookMapAddSystem(){
        bookHashMap = new HashMap<>();
    }

    // 저장하는 메서드만 만들어 보세요 (자료구조에 저장하는 기능만 설계)
    public void addBook(String name, String author){
        Book b1 = new Book(name, author);
        bookHashMap.put(name, new Book(name, author));
    }

    // 콘솔창에 출력하는 메서드를 만들어 보세요 단, 책 제목과 저자를 모두 출력해야 합니다.
    public void printAllBook(){
        for(Book b : bookHashMap.values()){
            System.out.println(b.toString());
        }
    }

    public static void main(String[] args) {
        BookMapAddSystem bookMapAddSystem = new BookMapAddSystem();
        bookMapAddSystem.addBook("해리포터","J.K.롤링");
        bookMapAddSystem.addBook("1984","조지오웰");

        bookMapAddSystem.printAllBook();
    }


} // end of class

// 데이터 타입 선언 - 설계
class Book{

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
