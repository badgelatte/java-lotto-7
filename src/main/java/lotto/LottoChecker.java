package lotto;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class LottoChecker {
    private List<Integer> winningNumbers;
    private int bonusNumber;

    public LottoChecker() {
        this.winningNumbers = new ArrayList<>();
        this.bonusNumber = 0;
    }

    public void inputWinningNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String inputWinningNumbers = Console.readLine();
        System.out.println("보너스 번호를 입력해 주세요.");
        String inputBonusNumber = Console.readLine();

        convertToWinningNums(inputWinningNumbers);
        convertToBonusNum(inputBonusNumber);
    }

    public void convertToWinningNums(String input) {
        input = input.trim();
        String[] inputNums = input.split(",");
        try {
            winningNumbers.add(Integer.parseInt(inputNums[0]));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자 이외의 입력이 감지되었습니다.");
        }
    }

    public void convertToBonusNum(String input) {
        try {
            bonusNumber = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자 이외의 입력이 감지되었습니다.");
        }
    }
}
