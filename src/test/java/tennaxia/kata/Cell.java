package tennaxia.kata;

public class Cell {

    private boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public Cell evolve(int nbAliveNeighbors) {
        if (alive) {
            if (nbAliveNeighbors < 2 || nbAliveNeighbors > 3) {
                return new Cell(false);
            } else {
                return new Cell(true);
            }
        } else if (nbAliveNeighbors == 3) {
            return new Cell(true);
        }
        return null;
    }
}
