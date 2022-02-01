package Hyperskill;

public class arrayVarArgs { // takes a variable number of arguments
    public static void main(String ... args) {
        System.out.println("hi");

        varArg(new int[]{10, 60, 90});
    }

    static void varArg(int ... data){
        System.out.println(data.length);
    }
}
