import java.text.Normalizer;
import java.util.regex.Pattern;

class UnsignText {
    public static void main(String[] args) {
        String input = "Xin chào mọi người";
        String output = convertToUnSign(input);
        System.out.println(output);
    }

    public static String convertToUnSign(String input) {
        String temp = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replaceAll("đ", "d");
    }
}