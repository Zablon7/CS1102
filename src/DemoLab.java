public class DemoLab{
    public static void main(String[] args){

    }
    public interface Readable{

        public char readChar();

        default public String readLine(){
            StringBuilder line = new StringBuilder();
            char ch = readChar();
            while (ch != '\n'){
                line.append(ch);
                ch = readChar();
            }
            return line.toString();
        }
    }
}


class Stars implements DemoLab.Readable{
    public char readChar() {
        if (Math.random() > 0.05){
            return '*';
        }
        else{
            return '\n';
        }
    }

    public static void main(String[] args){
        Stars stars = new Stars();
        for(int i = 0; i < 10; i++){
            String line = stars.readLine();
            System.out.println(line);
        }
    }
}

