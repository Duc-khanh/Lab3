package ThucHanh4;

class StutentImpl extends People implements Student {
    public StutentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }
    @Override
    public void eat(){
        System.out.println("Eat");
    }

    @Override
    public void registerCourse(String course) {

    }

    @Override
    public void attendClass() {
        System.out.printf("ngủ");

    }
}
