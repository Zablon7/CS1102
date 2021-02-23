import javafx.scene.canvas.GraphicsContext;

public class Polygon {

    public void render(){
        System.out.println("Rendering Polygon...");
    }
}

class Square extends Polygon implements Strokeable{

    public void render(){
        System.out.println("Rendering Square...");
    }

    public void stroke(GraphicsContext g){

    }
}

class Circle extends Polygon implements Strokeable{
    public void render(){
        System.out.println("Rendering Circle...");
    }
    public void stroke(GraphicsContext g){

    }
}

class Main{
    public static void main(String[] args){
        Square s1 = new Square();
        s1.render();

        Polygon p1 = new Polygon();
        p1.render();

        Circle c1= new Circle();
        c1.render();
    }
}
