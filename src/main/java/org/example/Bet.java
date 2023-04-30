package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bet {
    private Integer amount;
    private boolean win;

    public Bet(Integer amount){
        this.amount = amount;
        this.win = false;
    }
}
