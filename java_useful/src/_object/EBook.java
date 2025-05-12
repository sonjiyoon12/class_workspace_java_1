package _object;

public class EBook {

    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString() 메서드 재정의

    @Override
    public String toString() {
        return  "bookTypeId" + bookTypeId + "title : " + title + "author : " + author;
    }

    // equals() 메서드 재정의

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof EBook){
            if(this.title.equals(((EBook) obj).title) && this.author.equals(((EBook) obj).author)){
                return  true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    // hashCode() 메서드 재정의
    @Override
    public int hashCode() {
        return bookTypeId;
    }


    public static void main(String[] args) {

        EBook ebook1 = new EBook(1,"제목","저자");
        EBook ebook2 = new EBook(1,"제목","저자");

        String str1 = new String("제목");

        System.out.println(ebook1.toString());
        System.out.println(ebook2.toString());

        boolean result1 = ebook1.equals(ebook2);
        boolean result2 = ebook2.equals(str1);

        System.out.println("result1 : " + result1 );
        System.out.println("result2 : " + result2 );
    }
}
