public class Main {
    public static void main(String[] args) {

        /** Version 1 of main()
         *

        PlainInterface plainInterface = new PlainInterface() {
            @Override
            public String action(int x, int y) {
                return String.valueOf(x + y);
            }
        };
         */

//        PlainInterface plainInterface = (x, y) -> x + y; // version lambda for short functions

        PlainInterface plainInterface = Integer::sum;

//        PlainInterface plainInterface = (x, y) -> { // version lambda for few-strings functions
//            int a = x + y;                          // version lambda for few-strings functions
//            return String.valueOf(a);               // version lambda for few-strings functions
//        };

        PlainInterface plainInterface1 =  Integer::compare;

        System.out.println(plainInterface.action(5, 3));
        System.out.println(plainInterface1.action(1, 5));

    }


}
