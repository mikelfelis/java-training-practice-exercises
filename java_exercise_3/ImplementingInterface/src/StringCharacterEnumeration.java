import java.util.Enumeration;

public class StringCharacterEnumeration implements Enumeration<Character> {

    private final String text;
    private int index;

    public StringCharacterEnumeration(String text) {
        this.text = text;
        this.index = 0;
    }

    @Override
    public boolean hasMoreElements() {
        return index < text.length();
    }

    @Override
    public Character nextElement() {
        return text.charAt(index++);
    }
}