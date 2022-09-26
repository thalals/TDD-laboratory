import org.apache.commons.lang3.StringUtils;

public class Calculator {

    public int strSum(final String[] numbers) {
        int result = 0;
        for (String s : numbers) {
            preNumberValidate(s);
            result += Integer.parseInt(s);
        }
        return result;
    }

    private void preNumberValidate(final String number) {
        if (!StringUtils.isNumeric(number)) {
            throw new RuntimeException();
        }
        if (Integer.parseInt(number) < 0) {
            throw new RuntimeException();
        }
    }
}
