package dongwu;

public class Test {
    public static void main(String[] args){
        Tiger ti=new Tiger();
        ti.setAge(2);
        ti.setWeight(25);
        ti.sing();
        System.out.println("age="+ti.getAge()+"weight="+ti.getWeight());
    }
}
