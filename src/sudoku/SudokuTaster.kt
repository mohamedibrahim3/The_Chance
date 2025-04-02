package sudoku

data class SudokuTester(
    val name: String,
    val puzzle: List<List<Char>>,
    val isSolvable: Boolean
)