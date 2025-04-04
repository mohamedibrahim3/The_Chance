package week1.sudoku

import kotlin.math.sqrt

fun main() {
    println(
        sudokuChecker(
            listOf(
                listOf('5', '5', '-', '6', '-', '-', '-', '-', '8'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('1', '-', '-', '3', '-', '-', '5', '-', '-'),
                listOf('-', '5', '-', '7', '-', '-', '-', '-', '-'),
                listOf('4', '-', '-', '-', '-', '-', '-', '-', '1'),
                listOf('-', '-', '3', '-', '2', '-', '8', '-', '-'),
                listOf('-', '6', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '7', '-', '1', '-', '6', '-', '-'),
                listOf('-', '4', '-', '-', '-', '-', '-', '7', '-')
            )
        )
    )
}

/**
 * This function is made to check if the entered sudoku puzzle
 * is a valid sudoku puzzle or not
 *
 * @param puzzle A multi-dimension list which contains the sudoku puzzle
 * @return Boolean which indicates if the puzzle is solvable or not
 */
fun sudokuChecker(puzzle: List<List<Char>>): Boolean {
    val puzzleSize = puzzle.size
    // Check if the puzzle is square (rows == columns)
    if (puzzle.any { it.size != puzzleSize }) return false

    // Calculate the size of each sub-grid
    val subgridSize = sqrt(puzzleSize.toDouble()).toInt()

    // Arrays to store seen numbers for each sub-grid, row, and column
    val boxNumbers = Array(puzzleSize) { HashSet<Char>() }
    val rowNumbers = Array(puzzleSize) { HashSet<Char>() }
    val columnNumbers = Array(puzzleSize) { HashSet<Char>() }

    for (row in 0..<puzzleSize) {
        for (column in 0..<puzzleSize) {
            val cell = puzzle[row][column]
            if(cell != '-' && cell !in '1'..'9'&& cell !in 'A'..'G') return false

            if (cell == '-') continue

            // The sub-grid number to which the cell belongs
            val subgridIndex = (row / subgridSize) * subgridSize + (column / subgridSize)

            // If the number already exists in the row, column, or sub-grid, it's an invalid Sudoku
            if (!boxNumbers[subgridIndex].add(cell) ||
                !rowNumbers[row].add(cell) ||
                !columnNumbers[column].add(cell)
            ) return false
        }
    }
    return true
}