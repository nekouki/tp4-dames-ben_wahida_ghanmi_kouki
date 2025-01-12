/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package nour.tp4_dames;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nourkouki
 */
public class BoardTest {
    
    public BoardTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of initializeBoard method, of class Board.
     */
    @org.junit.jupiter.api.Test
    public void testInitializeBoard() {
        System.out.println("initializeBoard");
        Board board = new Board();
        assertEquals('X', board.getPiece(0, 0)); // Exemple pour un pion du joueur 1
        assertEquals('O', board.getPiece(7, 7)); // Exemple pour un pion du joueur 2
}

    /**
     * Test of printBoard method, of class Board.
     */
    @Disabled
    @org.junit.jupiter.api.Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        Board instance = new Board();
        instance.printBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPiece method, of class Board.
     */
    @Disabled
    @org.junit.jupiter.api.Test
    public void testGetPiece() {
        System.out.println("getPiece");
        int row = 0;
        int col = 0;
        Board instance = new Board();
        char expResult = ' ';
        char result = instance.getPiece(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPiece method, of class Board.
     */
    @Disabled
    @org.junit.jupiter.api.Test
    public void testSetPiece() {
        System.out.println("setPiece");
        int row = 0;
        int col = 0;
        char piece = ' ';
        Board instance = new Board();
        instance.setPiece(row, col, piece);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInsideBoard method, of class Board.
     */
    @Disabled
    @org.junit.jupiter.api.Test
    public void testIsInsideBoard() {
        System.out.println("isInsideBoard");
        int row = 0;
        int col = 0;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isInsideBoard(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
