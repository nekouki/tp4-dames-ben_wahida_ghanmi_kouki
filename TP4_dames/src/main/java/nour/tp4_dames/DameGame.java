/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nour.tp4_dames;

/**
 *
 * @author nourkouki
 */
public class DameGame {
    
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player("Player 1", 'X'); // Pions du joueur 1
        Player player2 = new Player("Player 2", 'O'); // Pions du joueur 2

        GameManager gameManager = new GameManager(board, player1, player2);
        gameManager.startGame();
    }
}
