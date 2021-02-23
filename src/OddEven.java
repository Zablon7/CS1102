public class OddEven {
    static int x = 13;
    public static void main(String[] args){
        print3NSequence(x);
    }
    static void print3NSequence(int startingValue){
        int N;
        int count;

        N = startingValue;
        count = 1;
        System.out.println("The 3N+1 sequence starting from " + N);
        System.out.println(N);

        while(N > 1){
            if (N % 2 == 1){
                N = 3 * N + 1;
            }
            else{
                N = N / 2;
            }
            count++;
            System.out.println(N);
        }
        System.out.println();
        System.out.println("There were " + count + " terms in the sequence.");
    }
}
