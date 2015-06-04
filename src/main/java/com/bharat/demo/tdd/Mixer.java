package com.bharat.demo.tdd;

public class Mixer {
    public Paint mixPaint(Paint p1, Paint p2) {
        if(p1.getFinish() != p2.getFinish())
            throw new IllegalArgumentException("Can only mix paint's that are of similar finish");

        return new Paint((p1.getRed()+p2.getRed()) / 2,(p1.getBlue()+p2.getBlue()) / 2, (p1.getYellow() + p2.getYellow()) / 2, (p1.getWhite() + p2.getWhite()) / 2, p1.getFinish());
    }
}
