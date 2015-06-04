package com.bharat.demo.tdd;

public class Paint {
    private int red;
    private int blue;
    private int yellow;
    private int white;
    private Finish finish;

    public Paint(int red, int blue, int yellow, int white, Finish finish) {
        if(finish == Finish.GLOSS && white < 50)
            throw new IllegalArgumentException("White cannot be lees than 50 for a glossy paint");
        int count = 0;
        if(red > 200) ++ count;
        if(blue > 200) ++ count;
        if(yellow > 200) ++ count;

        if(count > 1)
            throw new IllegalArgumentException("More than one color factor is over the 200 limit");

        this.red = clipValue(red);
        this.blue = clipValue(blue);
        this.yellow = clipValue(yellow);
        this.white = clipValue(white);
        this.finish = finish;
    }

    private int clipValue(int i) {
      return i > 300 ? 300 : (i < 0 ? 0 : i);
    }
    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getYellow() {
        return yellow;
    }

    public int getWhite() {
        return white;
    }

    public Finish getFinish() {
        return finish;
    }
}
