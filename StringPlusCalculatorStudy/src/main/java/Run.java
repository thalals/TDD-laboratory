public class Run {

    public static Input input = new Input();
    public static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        String[] inputStringArray = {
            "1,2,3",
            "1:2:3",
            "//s\n1s2s3",
            "",
            null

        };

        for (String text : inputStringArray) {
            run(text);
        }
    }

    public static void run(final String text) {
        if (!input.isEmpty(text)) {
            System.out.println("1");
            return;
        }

        System.out.println(calculator.strSum(input.extractStringArray(text)));
    }

}
