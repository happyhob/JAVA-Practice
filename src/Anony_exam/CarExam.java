package Anony_exam;

public class CarExam {
    public static void main(String[] args){
        //추상클래스는 인스턴스 객체를 생성할 수 없다.
//        Car c1 = new Car();
        Car c1 = new Car(){
            @Override
            public void a() {
                System.out.println("이름 없는 객체의 a()메소드 오버라이딩");
            }
        };

        c1.a();

        //추상클래스를 상속받은 객체는 인스턴스 생성 가능
        Car c2= new Bus();
    }
}
