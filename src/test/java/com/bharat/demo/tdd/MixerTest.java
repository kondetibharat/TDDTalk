package com.bharat.demo.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MixerTest {
    private Mixer mixer;

    @Before
    public void setUp() {
        this.mixer = new Mixer();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMixPaintShouldThrowIllegalArgumentExceptionWhenItTriesToMixGlossFinishPaintWithFlatFinishPaint() {
        Paint paint = mixer.mixPaint(new Paint(0,50,25,50,Finish.GLOSS), new Paint(50,0,0,100,Finish.FLAT));
    }

    @Test
    public void testMixPaintShouldResultInPaintThatIsAverageOfEachColorFactorOfTheMixedPaints() {
        Paint paint = mixer.mixPaint(new Paint(0,50,25,50,Finish.GLOSS), new Paint(50,0,0,100,Finish.GLOSS));

        Assert.assertEquals(25, paint.getRed());
        Assert.assertEquals(25, paint.getBlue());
        Assert.assertEquals(12, paint.getYellow());
        Assert.assertEquals(75, paint.getWhite());
    }
}
