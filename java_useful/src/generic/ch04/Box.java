package generic.ch04;

/**
 * 제네릭 클래스 Box 설계 <T> 대체 문자열을 설계해보세요
 */
public class Box<T> {

    // 변수 선언
    T contents;

    // 생성자 선언
    public Box(T contents) {
        this.contents = contents;
    }

    // 내용물 설정 (set 메서드)
    public void setContents(T contents) {
        this.contents = contents;
    }

    // 내용물 반환 (get 메서드)
    public T getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return contents.toString();
    }

    // 내용물 출력 (sout..)
    public static void main(String[] args) {

        Toy toy1 = new Toy();
        Box<Toy> box1 = new Box<>(toy1);
        box1.setContents(toy1);
        System.out.println(box1.toString());
    }
}
