import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

    private static final String DEFAULT_SEPARATOR = ",|:";
    private static final Pattern PATTERN = Pattern.compile("//(.)\n(.*)");

    public boolean emptyValidate(final String text) {
        if (Objects.isNull(text)) {
            return false;
        }

        return !text.isEmpty();
    }

    public String[] extractStringArray(final String text) {
        Matcher matcher = PATTERN.matcher(text);

        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }
        return text.split(DEFAULT_SEPARATOR);
    }
}
