package lotto.model;

import java.util.List;

public interface WinningLottoNumberRepository {

  int getBonusNumber();

  void saveWinningLotto(String winningNumbers);

  void saveBonusNumber(int bonusNumber);

  List<Integer> findWinningLotto();
}
