package dongwu;

public class Animal {
    public int age;
    public int weight;
    public static void run(){
        System.out.println("我是一只动物");
    }
    public static void eat(){
        System.out.println("我什么都吃");
    }
    public  void setAge(int age){
        this.age=age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
