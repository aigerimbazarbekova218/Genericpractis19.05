import java.util.List;

public class Generic1 <T,Y>{
    private T san;
    private Y san1;

    public Generic1(T san, Y san1) {
        this.san = san;
        this.san1 = san1;
    }

    public Generic1() {
    }

    public T getSan() {
        return san;
    }

    public void setSan(T san) {
        this.san = san;
    }

    public Y getSan1() {
        return san1;
    }

    public void setSan1(Y san1) {
        this.san1 = san1;
    }
    public static  <T extends Number >  void  method1(T[] array){
        for (T t : array) {
            System.out.println(t);
        }

    }

    public static <T extends Comparable>  T method2 (T[] array){
       T max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.compareTo(array[i]) > 0){
                max= array[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Generic1{" +
                "san=" + san +
                ", san1=" + san1 +
                '}';
    }
}
