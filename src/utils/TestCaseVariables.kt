package utils

import sudoku.SudokuTester


// This Objects will contain all the test cases for each week task
object TestCaseVariables {

    // region week1
    // region Sudoku
    val SudokuTestCases = listOf(
        // region 3x3 sub-grids sudoku
        SudokuTester(
            name = "Valid 9*9 solvable puzzle",
            puzzle = listOf(
                listOf('5', '-', '-', '6', '-', '-', '-', '-', '2'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('1', '-', '-', '3', '-', '-', '5', '-', '-'),
                listOf('-', '5', '-', '7', '-', '-', '-', '-', '-'),
                listOf('4', '-', '-', '-', '-', '-', '-', '-', '1'),
                listOf('-', '-', '3', '-', '2', '-', '8', '-', '-'),
                listOf('-', '6', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '7', '-', '1', '-', '6', '-', '-'),
                listOf('-', '4', '-', '-', '-', '-', '-', '7', '-')
            ),
            isSolvable = true,
        ),
        SudokuTester(
            name = "Valid 9*9 solvable puzzle",
            puzzle = listOf(
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
            ),
            isSolvable = true
        ),

        SudokuTester(
            name = "9*9 Unsolvable puzzle - row constraint violation (5's - row 0)",
            puzzle = listOf(
                listOf('5', '-', '5', '-', '2', '-', '9', '-', '-'),
                listOf('-', '-', '-', '8', '-', '3', '-', '2', '-'),
                listOf('-', '7', '-', '-', '-', '-', '-', '-', '1'),
                listOf('2', '-', '-', '5', '-', '7', '-', '-', '3'),
                listOf('-', '4', '-', '-', '-', '-', '7', '-', '-'),
                listOf('-', '-', '9', '-', '-', '-', '-', '5', '-'),
                listOf('-', '-', '-', '3', '8', '-', '-', '-', '2'),
                listOf('8', '-', '3', '-', '-', '1', '-', '-', '-'),
                listOf('-', '1', '-', '-', '6', '-', '-', '7', '-')
            ),
            isSolvable = false
        ),

        SudokuTester(
            name = "9*9 Unsolvable puzzle - column constraint violation (4's - column 1)",
            puzzle = listOf(
                listOf('7', '-', '-', '5', '-', '-', '3', '-', '6'),
                listOf('-', '3', '-', '-', '9', '-', '-', '-', '-'),
                listOf('-', '4', '-', '-', '-', '1', '-', '-', '-'),
                listOf('-', '4', '3', '-', '-', '-', '1', '-', '-'),
                listOf('-', '-', '5', '9', '-', '4', '-', '-', '2'),
                listOf('9', '-', '-', '-', '-', '-', '5', '3', '-'),
                listOf('-', '-', '-', '2', '-', '-', '-', '5', '-'),
                listOf('-', '-', '-', '-', '5', '-', '-', '1', '8'),
                listOf('3', '-', '8', '-', '-', '6', '-', '-', '-')
            ),
            isSolvable = false
        ),

        SudokuTester(
            name = "9*9 Unsolvable puzzle - box constraint violation (1's - box 0)",
            puzzle = listOf(
                listOf('1', '8', '-', '-', '-', '2', '-', '-', '5'),
                listOf('-', '1', '3', '7', '-', '-', '-', '-', '-'),
                listOf('-', '-', '1', '-', '-', '9', '-', '4', '-'),
                listOf('-', '3', '-', '-', '8', '-', '-', '-', '-'),
                listOf('5', '-', '7', '-', '-', '-', '3', '-', '1'),
                listOf('-', '-', '-', '-', '6', '-', '-', '9', '-'),
                listOf('-', '5', '-', '2', '-', '-', '9', '-', '-'),
                listOf('-', '-', '-', '-', '-', '6', '1', '-', '-'),
                listOf('9', '-', '-', '5', '-', '-', '-', '2', '3')
            ),
            isSolvable = false
        ),

        // region 2x2 sub-grids sudoku
        SudokuTester(
            name = "Valid solvable 4*4 puzzle",
            puzzle = listOf(
                listOf('-', '-', '3', '-'),
                listOf('4', '-', '-', '1'),
                listOf('-', '2', '-', '-'),
                listOf('-', '-', '-', '-')
            ),
            isSolvable = true
        ),
        SudokuTester(
            name = "Valid solvable 4*4 puzzle",
            puzzle = listOf(
                listOf('-', '-', '-', '-'),
                listOf('-', '-', '-', '-'),
                listOf('-', '-', '-', '-'),
                listOf('-', '-', '-', '-')
            ),
            isSolvable = true
        ),
        SudokuTester(
            name = "4*4 Unsolvable puzzle - row constraint violation (1's - row 0)",
            puzzle = listOf(
                listOf('1', '1', '-', '-'),
                listOf('-', '-', '2', '3'),
                listOf('3', '-', '-', '-'),
                listOf('-', '4', '-', '-')
            ),
            isSolvable = false
        ),
        SudokuTester(
            name = "4*4 Unsolvable puzzle - column constraint violation (1's - column 0)",
            puzzle = listOf(
                listOf('1', '-', '-', '-'),
                listOf('-', '3', '2', '-'),
                listOf('1', '-', '-', '4'),
                listOf('-', '-', '3', '-')
            ),
            isSolvable = false
        ),
        SudokuTester(
            name = "4*4 Unsolvable puzzle - subgrid constraint violation (2's - Box 0)",
            puzzle = listOf(
                listOf('2', '-', '-', '-'),
                listOf('-', '2', '3', '-'),
                listOf('-', '4', '-', '-'),
                listOf('-', '-', '-', '-')
            ),
            isSolvable = false
        ),

        // region 4x4 sub-grids sudoku
        SudokuTester(
            name = "Valid 16×16 Sudoku",
            puzzle = listOf(
                listOf('-', '4', '-', '-', '-', '-', '-', '-', '-', '-', 'D', '-', '-', '7', '-', '2'),
                listOf('-', '-', '6', '-', '-', '3', '-', '-', '4', '-', '-', '-', 'F', '-', '-', '-'),
                listOf('-', '-', '-', '1', '-', '-', '9', '-', '-', '-', '-', '5', '-', '-', 'C', '-'),
                listOf('8', '-', '-', '-', 'A', '-', '-', '-', '-', '-', '-', '-', '-', '5', '-', '-'),

                listOf('-', '-', '-', '7', '-', '-', '-', 'B', '-', '8', '-', '-', '-', '-', '-', '3'),
                listOf('-', '2', '-', '-', '-', '-', '5', '-', '-', '-', '1', '-', '-', '-', '-', '-'),
                listOf('9', '-', '-', '-', '-', '-', '-', '3', '-', '-', '-', '-', '-', '6', '-', '-'),
                listOf('-', '-', '5', '-', '-', '8', '-', '-', '-', 'E', '-', '-', '-', '-', '-', '9'),

                listOf('-', '-', '-', '-', '6', '-', '-', '-', '2', '-', '-', '-', '-', '-', 'A', '-'),
                listOf('-', '-', '3', '-', '-', '-', '-', '-', '-', '-', '-', '7', '-', '-', '-', '5'),
                listOf('-', '-', '-', '-', '-', '1', '-', '-', '-', '9', '-', '-', '8', '-', '-', '-'),
                listOf('4', '-', '-', '-', '-', 'F', '-', '7', '-', '-', '-', '-', '-', '-', '-', '-'),

                listOf('-', '-', 'B', '-', '-', '-', '-', '-', '-', '-', '3', '-', '-', '-', '1', '-'),
                listOf('-', '8', '-', '-', '-', '-', 'C', '-', '-', '-', '-', '-', '5', '-', '-', '-'),
                listOf('-', '-', '-', 'E', '-', '-', '-', '1', '-', '-', '-', '9', '-', '-', '-', '-'),
                listOf('1', '-', '-', '5', '-', '-', '-', '-', '-', '-', '-', '-', '-', '3', '-', '-')
            ),
            isSolvable = true
        ),
        SudokuTester(
            name = "16*16 Unsolvable puzzle - Row Constraint Violation (1's - row 0)",
            puzzle = listOf(
                listOf('1', '-', '-', '-', '5', '-', '-', '8', '-', '-', '-', '-', '9', '-', '1', '4'),
                listOf('-', '-', '9', '-', '-', '-', '2', '-', '7', '-', '-', '-', '-', '6', '-', '-'),
                listOf('-', '3', '-', '-', '-', '1', '-', '-', '-', '6', '5', '-', 'C', '-', '8', '-'),
                listOf('-', '-', '-', '6', '-', '-', '-', '4', '-', '2', '-', '-', '-', '-', '-', '-'),

                listOf('3', '-', '-', '-', '-', '-', '-', '-', '9', '-', '-', '1', '-', '-', '-', '6'),
                listOf('-', '-', '-', '5', 'C', '9', '-', '-', '-', '-', '-', '-', '8', '-', '-', '-'),
                listOf('-', '-', '6', '-', '-', '-', '4', '-', '2', '-', '-', '-', '-', '-', '7', '-'),
                listOf('-', '-', '-', '-', '-', '-', '3', '-', '-', '1', '-', '-', '-', '2', '-', '-'),

                listOf('-', '9', '-', '-', '-', '8', '-', '-', '-', '-', '7', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '2', '-', '-', '-', '5', '-', 'E', '-', '-', '-', '9', '-', '-'),
                listOf('-', '5', '-', '-', '1', '-', '-', '-', '3', '-', '-', '-', '-', '-', '4', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '7', '-', '8', '-', '-', '-', '-', '-', '3'),

                listOf('5', '-', '-', '9', '-', '-', '-', '-', '-', '-', '-', '2', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '6', '-', '-', '-', '-'),
                listOf('-', '-', 'G', '-', '-', '-', '8', '-', '-', '-', '3', '-', '-', '-', '6', '-'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '5', '-', '-', '-', '-', '8', '-', '9')
            ),
            isSolvable = false
        ),
        SudokuTester(
            name = "16*16 Unsolvable puzzle - Column Constraint Violation (1's - Column 0)",
            puzzle = listOf(
                listOf('1', '-', '-', '-', '5', '-', '-', '8', '-', '-', '-', '-', '9', '-', '-', '4'),
                listOf('-', '-', '9', '-', '-', '-', '2', '-', '7', '-', '-', '-', '-', '6', '-', '-'),
                listOf('-', '3', '-', '-', '-', '1', '-', '-', '-', '6', '5', '-', '-', '-', '8', '-'),
                listOf('-', '-', '-', '6', '-', '-', '-', '4', '-', '2', '-', '-', '-', '-', '-', '-'),

                listOf('3', '-', '-', '-', '-', '-', '-', '-', '9', '-', '-', '1', '-', '-', '-', '6'),
                listOf('-', '-', '-', '5', '-', '9', '-', '-', '-', '-', '-', '-', '8', '-', '-', '-'),
                listOf('-', '-', '6', '-', '-', '-', '4', '-', '2', '-', '-', '-', '-', '-', '7', '-'),
                listOf('-', '-', '-', '-', '-', '-', '3', '-', '-', '1', '-', '-', '-', '2', '-', '-'),

                listOf('-', '9', '-', '-', '-', '8', '-', '-', '-', '-', '7', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '2', '-', '-', '-', '5', '-', '-', '-', '-', '-', '9', '-', '-'),
                listOf('-', '5', '-', '-', '1', '-', '-', '-', '3', '-', '-', '-', '-', '-', '4', '-'),
                listOf('1', '-', '-', '-', '-', '-', '-', '7', '-', '8', '-', '-', '-', '-', '-', '3'),

                listOf('5', '-', '-', '9', '-', '-', '-', '-', '-', '-', '-', '2', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '6', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '8', '-', '-', '-', '3', '-', '-', '-', '6', '-'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '5', '-', '-', '-', '-', '8', '-', '9')
            ),
            isSolvable = false
        ),
        SudokuTester(
            name = "16*16 Unsolvable puzzle - Subgrid Constraint Violation (A's - Box 13)",
            puzzle = listOf(
                listOf('1', '-', '-', '-', '5', '-', '-', '8', '-', '-', '-', '-', '9', '-', '-', '4'),
                listOf('-', '-', '9', '-', '-', '-', '2', '-', '7', '-', '-', '-', '-', '6', '-', '-'),
                listOf('-', '3', '-', '-', '-', '1', '-', '-', '-', '6', '5', '-', '-', '-', '8', '-'),
                listOf('-', '-', '-', '6', '-', '-', '-', '4', '-', '2', '-', '-', '-', '-', '-', '-'),

                listOf('3', '-', '-', '-', '-', '-', '-', '-', '9', '-', '-', '1', '-', '-', '-', '6'),
                listOf('-', '-', '-', '5', '-', '9', '-', '-', '-', '-', '-', '-', '8', '-', '-', '-'),
                listOf('-', '-', '6', '-', '-', '-', '4', '-', '2', '-', '-', '-', '-', '-', '7', '-'),
                listOf('-', '-', '-', '-', '-', '-', '3', '-', '-', '1', '-', '-', '-', '2', '-', '-'),

                listOf('-', '9', '-', '-', '-', '8', '-', '-', '-', '-', '7', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '2', '-', '-', '-', '5', '-', '-', '-', '-', '-', '9', '-', '-'),
                listOf('-', '5', '-', '-', '1', '-', '-', '-', '3', '-', '-', '-', '-', '-', '4', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '7', '-', '8', '-', '-', '-', '-', '-', '3'),

                listOf('A', '-', '-', '9', '-', '-', '-', '-', '-', '-', '-', '2', '-', '-', '-', '-'),
                listOf('-', 'A', '-', '-', '-', '-', '-', '-', '-', '-', '-', '6', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '8', '-', '-', '-', '3', '-', '-', '-', '6', '-'),
                listOf('7', '-', '-', '-', '2', '-', '9', '-', '5', '-', '-', '-', '-', '8', '-', '9')
            ),
            isSolvable = false
        )
    )
    // endregion



}