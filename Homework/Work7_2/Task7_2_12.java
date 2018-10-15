// Из кода Java удалить все комментарии ( //, /*, /**).

public class Task7_2_12 {
    public static void main(String[] args) {
    }

    public static String delAllComments(String sourceCode) {
        return sourceCode.replaceAll("//.*|(\"(?:\\\\[^\"]|\\\\\"|.)*?\")|(?s)/\\*.*?\\*/", "");
    }
}
