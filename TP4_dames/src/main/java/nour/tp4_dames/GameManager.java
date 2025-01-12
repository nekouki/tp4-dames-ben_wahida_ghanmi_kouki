/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nour.tp4_dames;

/**
 *
 * @author nourkouki
 */
import java.util.Scanner;

public class GameManager {
    private final Board board;
    private final Player player1;
    private final Player player2;
    private boolean isPlayer1Turn;

    public GameManager(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.isPlayer1Turn = true;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.printBoard();
            Player currentPlayer = isPlayer1Turn ? player1 : player2;

            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getPiece() + ")");

            System.out.print("Enter the row and column of the piece to move (e.g., 2 3): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            System.out.print("Enter the row and column to move to (e.g., 3 4): ");
            int targetRow = scanner.nextInt();
            int targetCol = scanner.nextInt();

            if (makeMove(currentPlayer, row, col, targetRow, targetCol)) {
                if (checkForPromotion(currentPlayer, targetRow)) {
                    System.out.println("Piece promoted to a Dame!");
                }

                isPlayer1Turn = !isPlayer1Turn; // Switch turn
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private boolean makeMove(Player player, int row, int col, int targetRow, int targetCol) {
        if (!board.isInsideBoard(row, col) || !board.isInsideBoard(targetRow, targetCol)) {
            return false;
        }

        char piece = board.getPiece(row, col);
        if (piece != player.getPiece()) {
            return false;
        }

        // Example logic for a valid move (basic, without captures)
        if (Math.abs(targetRow - row) == 1 && Math.abs(targetCol - col) == 1 && board.getPiece(targetRow, targetCol) == ' ') {
            board.setPiece(row, col, ' ');
            board.setPiece(targetRow, targetCol, piece);
            return true;
        }

        // Add capture and multiple capture logic here
        return false;
    }

    private boolean checkForPromotion(Player player, int row) {
        if (player.getPiece() == 'X' && row == 7) {
            board.setPiece(row, row, 'D'); // 'D' for Dame
            return true;
        } else if (player.getPiece() == 'O' && row == 0) {
            board.setPiece(row, row, 'D'); // 'D' for Dame
            return true;
        }
        return false;
    }
}

