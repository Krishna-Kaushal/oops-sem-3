class MyString {
    private String str;

    MyString(String str) {
        this.str = str;
    }

    boolean equals(String other) {
        return this.str.equals(other);
    }

    String reverse() {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    String toUpperCase() {
        return str.toUpperCase();
    }

    String toLowerCase() {
        return str.toLowerCase();
    }

    String trim() {
        return str.trim();
    }

    int length() {
        return str.length();
    }

    char charAt(int index) {
        return str.charAt(index);
    }

    boolean contains(String substring) {
        return str.contains(substring);
    }

    String substring(int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    String replace(char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    String concat(String other) {
        return str.concat(other);
    }
}

public class q4 {
    public static void main(String[] args) {
        MyString myString = new MyString("  Hello World  ");

        System.out.println("Original String: '" + myString.trim() + "'");
        System.out.println("Equals 'Hello World': " + myString.equals("Hello World"));
        System.out.println("Reversed String: " + myString.reverse());
        System.out.println("Uppercase: " + myString.toUpperCase());
        System.out.println("Lowercase: " + myString.toLowerCase());
        System.out.println("Trimmed String: '" + myString.trim() + "'");
        System.out.println("Length: " + myString.length());
        System.out.println("Character at index 4: " + myString.charAt(4));
        System.out.println("Contains 'World': " + myString.contains("World"));
        System.out.println("Substring (0, 5): " + myString.substring(0, 5));
        System.out.println("Replace 'l' with 'x': " + myString.replace('l', 'x'));
        System.out.println("Concatenation with '!!!': " + myString.concat("!!!"));
    }
}
