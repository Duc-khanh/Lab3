package ThucHanh4;

public class Test {
    public static void main(String[] args) {
        StutentImpl student = new StutentImpl("Nguyen Duc khanh", 20, false);
        student.eat();
        student.registerCourse("Java");
        student.attendClass();
    }
}
