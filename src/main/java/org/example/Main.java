package org.example;

public class Main {
    public static void main(String[] args) {
        Slots slots = new Slots();
        for(int i = 0; i < 101; i++) {
            slots.setBet(new Bet(400));
            slots.play();
            slots.result();
        }
    }
}