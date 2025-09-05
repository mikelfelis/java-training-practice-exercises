public class Main {
    public static void main(String[] args) {
        StringCharacterEnumeration enumeration = new StringCharacterEnumeration("Hello World!");

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
