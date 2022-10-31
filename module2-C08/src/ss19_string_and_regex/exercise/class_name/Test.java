package ss19_string_and_regex.exercise.class_name;

public class Test {
    private static ValidateClass validate;
    public static final String[] validName = new String[]{"C0822G1","0988G","C0988"};
    public static final String[] invalidName = new String[]{"C0318G", "P0323A2"};

    public static void main(String[] args) {
        validate = new ValidateClass();
        for (String s : validName) {
            boolean invalid = validate.validate(s);
            System.out.println("Email is " + s + " is valid: " + invalid);
        }
        for (String s : invalidName) {
            boolean invalid = validate.validate(s);
            System.out.println("Email is " + s + " is valid: " + invalid);
        }
    }
}