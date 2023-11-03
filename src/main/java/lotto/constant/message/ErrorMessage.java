package lotto.constant.message;

public enum ErrorMessage {
    NON_INTEGER_MONEY("올바른 숫자의 금액을 입력해 주세요."),
    NON_INTEGER_WINNING_NUMBER("올바른 숫자의 당첨 번호를 입력해 주세요"),
    NON_INTEGER_BONUS_NUMBER("올바른 숫자의 보너스 번호를 입력해 주세요");

    public static final String ERROR = "[ERROR] %s";
    private final String message;

    ErrorMessage(String message) {
        this.message = String.format(ERROR, message);
    }

    public String getMessage() {
        return message;
    }
}
