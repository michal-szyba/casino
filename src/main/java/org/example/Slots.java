package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.Random;
@Getter
@Setter
public class Slots {
    private int[] symbols = new int[3];
    private Bet bet;


    public void play() {
        for(int i = 0; i < 3; i++){
            Random r = new Random();
            this.symbols[i] = r.nextInt(1, 9);
        }
        if(this.symbols[0] == this.symbols[1] && this.symbols[0] == this.symbols[2]){
            this.getBet().setWin(true);
        }
        for(int a = 0; a < 3; a++){
            System.out.println(this.symbols[a]);
        }
    }
    public void result(){
        if(this.getBet().isWin()){
            System.out.println("You win!");
        } else {
            System.out.println("You lost!");
        }
    }
}
