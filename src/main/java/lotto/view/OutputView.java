package lotto.view;

import static lotto.constant.message.OutputMessage.PURCHASE;
import static lotto.constant.message.OutputMessage.TOTAL_RETURN;
import static lotto.constant.message.OutputMessage.WINNING_RESULT;
import static lotto.constant.message.OutputMessage.WINNING_RESULT_BALL;
import static lotto.constant.message.OutputMessage.WINNING_STATUS;

import java.util.List;
import java.util.Map;
import lotto.domain.LottoRank;

public class OutputView {
    public static void printPurchaseCount(int count) {
        System.out.printf(PURCHASE.getMessage(), count);
    }

    public static void printLottoNumbers(List<Integer> lotto) {
        System.out.println(lotto);
    }

    public static void printWinningStatus() {
        System.out.println(WINNING_STATUS.getMessage());
    }

    public static void printWinningResult(Map<LottoRank, Integer> winningResult) {
        for (LottoRank rank : LottoRank.values()) {
            if (rank.equals(LottoRank.DEFAULT)) {
                continue;
            }
            showRankResult(winningResult, rank);
        }
    }

    private static void showRankResult(Map<LottoRank, Integer> winningResult, LottoRank rank) {
        if (rank.equals(LottoRank.SECOND)) {
            System.out.printf(WINNING_RESULT_BALL.getMessage(), rank.getMatchCount(), rank.getPrize(),
                    winningResult.getOrDefault(rank, 0));
        }
        System.out.printf(WINNING_RESULT.getMessage(), rank.getMatchCount(), rank.getPrize(),
                winningResult.getOrDefault(rank, 0));
    }

    public static void printProfitRate(double profitRate) {
        System.out.printf(TOTAL_RETURN.getMessage(), profitRate);
    }

    public static void printError(String error) {
        System.out.println(error);
        printLineChanging();
    }

    public static void printLineChanging() {
        System.out.println();
    }
}
