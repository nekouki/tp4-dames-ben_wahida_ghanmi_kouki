/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nour.tp4_dames;

/**
 *
 * @author nourkouki
 */
public class Player {
    private final String name;
    private final char piece;

    public Player(String name, char piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public char getPiece() {
        return piece;
    }
}

