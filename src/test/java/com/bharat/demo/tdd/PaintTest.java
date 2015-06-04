package com.bharat.demo.tdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: kondetib
 * Date: 7/31/13
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */

public class PaintTest {

    @Test
    public void testPaintObjectCreation() {
        Paint paint = new Paint(100, 110, 120, 130, Finish.GLOSS);
        Assert.assertEquals(100, paint.getRed());
        Assert.assertEquals(110, paint.getBlue());
        Assert.assertEquals(120, paint.getYellow());
        Assert.assertEquals(130, paint.getWhite());
        Assert.assertEquals(Finish.GLOSS, paint.getFinish());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPaintObjectCreationShouldThrowIllegalArgumentExceptionWhenWhiteIsLessThan50AndFinishIsGloss() {
        new Paint(100, 110, 120, 49, Finish.GLOSS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPaintObjectCreationShouldThrowIllegalArgumentExceptionWhenMoreThanOneColorFactorIsOver200Limit() {
        new Paint(201, 110, 201, 51, Finish.GLOSS);
    }

    @Test
    public void testPaintObjectCreationShouldMakeAnyColorValueAbove300to300() {
        Paint paint = new Paint(310, 120, 130, 340, Finish.GLOSS);
        Assert.assertEquals(300, paint.getRed());
        Assert.assertEquals(300, paint.getWhite());
    }

    @Test
    public void testPaintObjectCreationShouldMakeAnyColorValueBelow0to0() {
        Paint paint = new Paint(-1310, -120, -130, 51, Finish.GLOSS);
        Assert.assertEquals(0, paint.getRed());
        Assert.assertEquals(0, paint.getBlue());
        Assert.assertEquals(0, paint.getYellow());
    }

}
