/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nour.tp4_dames;

/**
 *
 * @author nourkouki
 */
import java.util.Arrays;

public class Board {
    private final char[][] board;

    public Board() {
        board = new char[8][8];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            Arrays.fill(board[i], ' ');
        }

        // Placer les pions du joueur 1
        for (int i = 0; i < 3; i++) {
            for (int j = (i % 2); j < 8; j += 2) {
                board[i][j] = 'X'; // Pions du joueur 1
            }
        }

        // Placer les pions du joueur 2
        for (int i = 5; i < 8; i++) {
            for (int j = (i % 2); j < 8; j += 2) {
                board[i][j] = 'O'; // Pions du joueur 2
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("  0 1 2 3 4 5 6 7");
    }

    public char getPiece(int row, int col) {
        return board[row][col];
    }

    public void setPiece(int row, int col, char piece) {
        board[row][col] = piece;
    }

    public boolean isInsideBoard(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}
