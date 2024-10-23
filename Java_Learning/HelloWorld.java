public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // int a=5,b=10;
        String s="Hello, World!";
        swi(s);
        // System.out.println(add(a,b)+s);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void swi(String s) {
        int vs = 0, cs = 0;
        for (int i=0; i<s.length(); i++) {
        char c = s.charAt(i);
        switch (c) {
        case 'a':
        break;
        case 'e':
        // …
        vs++;
        break;
        case 'b':
        case 'c':
        // …
        cs++;
        break;
        default:
        System.out.println ("other");
        }
        }
        System.out.println("Vowels:"+ vs + "Consonants:"+ cs);
    }
}
