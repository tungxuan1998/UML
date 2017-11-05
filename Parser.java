public class Parser {
    public static String[] getMethodDeclaration(String input) {
        String[] res = input.replace("\n", " ").split("throws")[0].split("\\(");
        res[0] = res[0].trim();
        res[1] = res[1].split("\\)")[0].trim().replace(",", " ");

        return res;
    }

    public static void main(String[] args) {

    }
}
