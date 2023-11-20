package newproject;

import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;

public class Project1pt2Test {

    @Before
    public void setUp() {
        // Initialize gameBoardPanel before each test
        Project1pt2.gameBoardPanel = new JPanel();
        Project1pt2.boardSize = 3; // Set a small board for simplicity
        Project1pt2.board = new String[Project1pt2.boardSize][Project1pt2.boardSize];
    }

    @Test
    public void testComputerMove() {
        // Set up the initial state for the test
        Project1pt2.isRedTurn = false;

        // Call the computerMove method
        Project1pt2.computerMove();

        // Validate the result
        // Assuming the computerMove method simulates a button click and updates the board
        boolean isBoardUpdated = false;
        for (int i = 0; i < Project1pt2.boardSize; i++) {
            for (int j = 0; j < Project1pt2.boardSize; j++) {
                if (Project1pt2.board[i][j] != null) {
                    isBoardUpdated = true;
                    break;
                }
            }
        }

        if (!isBoardUpdated) {
            // Print the board for debugging purposes
            for (int i = 0; i < Project1pt2.boardSize; i++) {
                for (int j = 0; j < Project1pt2.boardSize; j++) {
                    System.out.print(Project1pt2.board[i][j] + " ");
                }
                System.out.println();
            }
        }

        assertTrue("ComputerMove did not update the board.", isBoardUpdated);

        // Additional assertions based on your specific implementation can be added here
    }
}