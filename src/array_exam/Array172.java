package array_exam;

import java.util.Arrays;
import java.util.Comparator;

/*
배열의 정렬 */

public class Array172 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("python", 3000);
        items[2] = new Item("c#", 4500);
        items[3] = new Item("자바스크립트", 4000);
        items[4] = new Item("dart", 2000);

        // sort(Object[]) - Object는 모든 객체의 조상이니깐, 어떤 객체의 배열이든 올 수 있다.
        //ClassCastingException
        //Arrays.sort(items, 정렬방법정의);
        //-----방법 1------ 외부정의
        Arrays.sort(items, new ItemSorter());

        //-----방법 2------ 내부에 한번에 정의

        Arrays.sort(items,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Item item1 = (Item) o1;
                Item item2 = (Item) o2;
                return item1.getName().compareTo(item2.getName());
            }
        });

        //-----방법 3------ 람다식으로 정읜
        Arrays.sort(items,(Object o1, Object o2)->{
                Item item1 = (Item) o1;
                Item item2 = (Item) o2;
                return item1.getName().compareTo(item2.getName());
            }
        );

        //-----방법 4------
        //Object 타입이라고 했는데, 자체적으로 유추하는 기능이있어서, item으로만 적어도 내부적으로 item으로 인식을 한다
        Arrays.sort(items,(item1,item2)-> item1.getName().compareTo(item2.getName()));


        
        //출력부
        for(Item item : items){
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }
}

//외부에서 정렬을 정의할 수 있다.
//Arrays.sort(배열, 배열정렬방법정의)
class ItemSorter implements Comparator {

    //o1 - o2
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item) o1;
        Item item2 = (Item) o2;
        return item1.getName().compareTo(item2.getName());
    }
}

//내부에서 정렬 방식을 정의하고 있다.
//Comparable 어떤 Item이 큰지 작은지 기준을 정하는 interface
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //compareTo: 파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    //compareTo에는 Object를 받아들이도록 했지만 실제로는 Item이 들어온다.
    @Override
    public int compareTo(Object o) {
        Item d =(Item) o;
        return this.price - d.price;    //가격이 낮은 순으로 정렬
//        return this.name.compareTo(d.name); //양수, 0 ,음수
        // 가나다 순으로 비교를 한다(유니코드 순서로비교한다.)
        // 한국어보다는 영어가 우선순위를 갖는다/
        // 영어에서 알파벳도 대문자가 우선순위
    }
}
