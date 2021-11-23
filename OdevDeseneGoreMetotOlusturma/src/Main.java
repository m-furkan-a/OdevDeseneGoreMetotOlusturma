public class Main {

    static int desen(int a){
        if (a < 0) {
            return a;

        }
        System.out.print(a + " ");
        return desen(a-5);
        
    }

    public static void main(String[] args) {
        System.out.println(desen(16));
    }
}
