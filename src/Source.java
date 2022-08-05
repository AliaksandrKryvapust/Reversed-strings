public class Source {
    public static void main(String[] args) {
        String str = "world";
        System.out.println(solution(str).equals("dlrow"));
    }
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
