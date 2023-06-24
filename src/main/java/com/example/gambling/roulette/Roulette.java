package com.example.gambling.roulette;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Roulette {
    private Integer number;
    private Colors color;


    public void spin(){
        Random r = new Random();
        int rolled = r.nextInt(0, 37);
        int range = 0;
        boolean even = rolled % 2 == 0;
        if(rolled == 0){
            range = 1;
        } else if ((rolled > 0 && rolled < 11) || (rolled > 18 && rolled < 29)){
            if(even) {
                range = 3;
            } else {
                range = 2;
            }
        } else if ((rolled > 10 && rolled < 19) || (rolled > 28 && rolled < 37)){
            if(even) {
                range = 2;
            } else {
                range = 3;
            }
        }
        this.number = rolled;
        switch(range){
            case 1 -> this.color = Colors.GREEN;
            case 2 -> this.color = Colors.RED;
            case 3 -> this.color = Colors.BLACK;
        }
    }
    public void play(){
    }

    private int straightUp(int number){
        if(number == this.number){
            return 35;
        } else {
            return -1;
        }
    }
    private int splitBet(int number1, int number2){
        if(this.number == number1 || this.number == number2){
            return 17;
        } else {
            return -1;
        }
    }
    private int streetBet(int row){
        if(row == getRow(this.number) ){
            return 11;
        } else {
            return -1;
        }
    }
    private int cornerBet(int corner){
        List<Integer> numbers = new ArrayList<>();
        int offset = (corner - 1) / 2;
        int input = corner + offset;
        numbers.add(input);
        numbers.add(input + 1);
        numbers.add(input + 3);
        numbers.add(input + 4);
        if(numbers.contains(this.number)){
            return 8;
        } else {
            return -1;
        }
    }
    private int getRow(int num){
        if(num % 3 == 0){
            return num / 3;
        }
        return num / 3 + 1;
    }
    private int lineBet(int line1, int line2){
        List<Integer> numbers = new ArrayList<>();
        int input1 = line1 * 3;
        numbers.add(input1);
        numbers.add(input1 - 1);
        numbers.add(input1 - 2);
        int input2 = line2 * 3;
        numbers.add(input2);
        numbers.add(input2 - 1);
        numbers.add(input2 - 2);
        if(numbers.contains(this.number)){
            return 5;
        } else {
            return -1;
        }
    }
    private int dozenBet(int dozen){
        List<Integer> numbers = new ArrayList<>();
        int first = 12 * dozen;
        numbers.add(first);
        for(int i = 1; i < 12; i++){
            numbers.add(first - i);
        }
        if(numbers.contains(this.number)){
            return 2;
        } else {
            return -1;
        }
    }
    private int columnBet(int column){
        List<Integer> numbers = new ArrayList<>();
        int input = column;
        numbers.add(input);
        for(int i = 1; i < 12; i++){
            input += 3;
            numbers.add(input);
        }
        if(numbers.contains(this.number)){
            return 2;
        } else {
            return -1;
        }
    }
}