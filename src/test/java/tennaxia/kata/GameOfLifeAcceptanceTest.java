package tennaxia.kata;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GameOfLifeAcceptanceTest {

    @Test
    public void shouldDieWhenLessThanTwoLivingNeighbours() {
        Cell cell = aliveCell();

        Cell evolvedCell = cell.evolve(1);

        Assertions.assertThat(evolvedCell.isAlive()).isFalse();
    }

    @Test
    public void shouldDieWhenMoreThanThreeLivingNeighbours() throws Exception {
        Cell cell = aliveCell();

        Cell evolvedCell = cell.evolve(4);

        Assertions.assertThat(evolvedCell.isAlive()).isFalse();
    }

    @Test
    public void shouldLiveWhenTwoOrThreeLivingNeighbours() throws Exception {
        Cell cell = aliveCell();

        Cell evolvedCell = cell.evolve(2);

        Assertions.assertThat(evolvedCell.isAlive()).isTrue();
    }

    @Test
    public void aDeadCellShouldLiveWhenThreeLivingNeighbours() throws Exception {
        Cell deadCell = new Cell(false);

        Cell evolvedCell = deadCell.evolve(3);

        Assertions.assertThat(evolvedCell.isAlive()).isTrue();
    }

    private Cell aliveCell() {
        return new Cell(true);
    }
}
