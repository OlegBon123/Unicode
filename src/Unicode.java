public class Unicode {
    public static void main(String[] args) {
        String Text = "Бондаренко Олег";
        System.out.println(Text);

        String unicodeText = "Смайлики: 😀😁😂🤩";
        System.out.println(unicodeText);

        char unicodeChar1 = '\u2764';
        char unicodeChar2 = '\u263A';
        System.out.println("Символи: " + unicodeChar1 + " " + unicodeChar2);

        String otherUnicodeText = "Спеціальні символи: \u00A9 \u00AE \u2122";
        System.out.println(otherUnicodeText);
    }
}
