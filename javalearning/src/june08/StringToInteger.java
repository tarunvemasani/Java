package june08;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class StringToInteger {
    public static int convertToInt(String input) throws CustomException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new CustomException("Error converting string to integer: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = convertToInt(input);
                System.out.println("Conversion successful: " + result);
            } catch (CustomException e) {
                System.out.println("Caught custom exception: " + e.getMessage());
            }
        }
    }
}

