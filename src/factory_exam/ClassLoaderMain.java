package factory_exam;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{

        //!!!!!!!!!!!!!!!기존 인스턴스 생성 호출!!!!!!!!!!!!!!!!!
//        Car b1 = new Car();
//        b1.a();

        //!!!!!!!!!!!!!!!!!!!!!클래스 로더!!!!!!!!!!!!!!!!!!!!!!
        // a() 메소드를 가지고 있는 클래스가 있다.
        // 이 클래스이름이 아직 무엇인지 모르겠다.
        // 나중에 이 클래스 이름을 알려주겠다.
        // a() 메소드를 실핼할 수 있도록 코드를 작성

        String className = "factory_exam.Bus";
        //static한 메서드, forName에 넘겨준 클래스의 이름을 CLASSPATH에서 찾음
        // 그 정보를 clazz가 참조하도록 한다.
        Class clazz = Class.forName(className);
        //이 클래스가 가지고 있는 메소드 정보를 모두 리턴해준다.
        Method[] declaredMethods = clazz.getDeclaredMethods();

        //foreach문
        for(Method m: declaredMethods){
            System.out.println(m.getName());
        }

        Object o = clazz.newInstance();     // == Object o = new Car();와 같은 코드가 입니다.
//        Car b = (Car)o;
//        b.a();


        Method m = clazz.getDeclaredMethod("a", null); //a() 메소드 정보를 가지고 있는 Method를 반환
        m.invoke(o, null);          //invoke: m이 가지고 있는 메서드 정보를 가지고 함수를 실행하라
        // Object o가 참조하는 객체의 m 메소드를 실행하라
    }
}
