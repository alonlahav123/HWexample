public class TwoStringMethods {

    public static void main(String[] args) {
        String uno = "asdfabcnjbsk";
        String dos = "Okay";

        if( abcTest(uno) ) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        String output = alternateStrings(uno, dos);

        System.out.println(output);
    }

    public static String alternateStrings(String uno, String dos) {
        int longest = returnLongest(uno, dos);
        String output = "";

        for (int i = 0; i < longest; i++) {

            if( i < uno.length() ) {
                output += uno.substring(i, i+1);
            }

            if( i < dos.length() ) {
                output += dos.substring(i, i+1);
            }

        }

        return output;
    }

    public static int returnLongest(String uno, String dos) {
        if( uno.length() >= dos.length() ) {
            return uno.length();
        } else {
            return dos.length();
        }
    }

    public static boolean abcTest(String uno) {
        uno = " " + uno;

        for (int i = 0; i < uno.length()-2; i++) {
            if( !uno.substring(i, i+1).equals(".") ){
                if( uno.substring(i+1, i+2).equals("a") ){
                    if( uno.substring(i+2, i+3).equals("b") ){
                        if( uno.substring(i+3, i+4).equals("c") ){
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
