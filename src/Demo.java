import java.util.ArrayList;

public class Demo{
    public static void main(String[] args){
        Demo outer = new Demo();

        print1to100();
    }

    void myMethod(){
        int num = 23;
        class MethodInner{
            public void display(){
                System.out.println("This is method inner class " + num);
            }
        }
        MethodInner inner = new MethodInner();
        inner.display();
    }

    static void print1to100(){
        ArrayList<Runnable> printers = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            int x = i;
            printers.add(() -> System.out.println(x));
        }
        printers.parallelStream().forEach(Runnable::run);
    }
}
