import java.util.ArrayList;

public class Generic <T,V>{
    private T name;
    private V age;

    public Generic(T name, V age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }
    public  <A> void genericMethod(ArrayList<A> list){
       for (A t:list){
           System.out.println(t);
       }
    }

    @Override
    public String toString() {
        return "Generic{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
