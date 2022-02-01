package Hyperskill;

import java.util.Date;

class Test2 {
    static Date date;
    Test2() {
        date = new Date();
    }
}

public class StaticMembers {
    public static void main(String ... h) {
        new Test2();
        System.out.println(Test2.date);
        new Test2();
        System.out.println(Test2.date);

        System.out.println(Math.min(100, 200)+" "+Math.abs(-20)+" "+Math.pow(10, 3));
    }
}
