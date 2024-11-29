public class ReverseString {
    public static void main(String[] args) {

//        StringBuilder str = new StringBuilder("ABCD");
//        System.out.println(str.reverse());

        String str = "ABCD";
        String s = "";
        char ch;
        System.out.println(str);
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            s = ch + s;
        }
        System.out.println(s);
    }
}
