package Anony_exam;

public class MyRunnableMain2 {
    public static void main(String[] args){

        // 방법 1 _____________________________________
//        MyRunnable myrunnable = new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("hello my runnable!!!!");
//            }
//        };
//
//        RunnableExecute runnableExecute = new RunnableExecute();
//        runnableExecute.execute(myrunnable);

        // 방법 2 ______________________________________

//        RunnableExecute runnableExecute = new RunnableExecute();
//        System.out.println("--------------");
//        runnableExecute.execute(new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("hello my runnable!!!!");
//            }
//        });
//        System.out.println("--------------");
        
        
        /*
        기존 함수를
        new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello my runnable!!!!");
            }
        }
        람다형식으로 변환
        ()->{
            System.out.println("hello my runnable!!!!");
        }
        */

        // 방법 3 ______________________________________


        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("--------------");

        //람다식
        runnableExecute.execute(()->{
            System.out.println("hello my runnable!!!!");
        }
        );
    }
}
