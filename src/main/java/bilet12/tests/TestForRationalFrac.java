package bilet12.tests;

import bilet12.RationalFrac;
import bilet12.RationalFracException;


/**
 * Created by Ruslan on 10.06.2017.
 */
public class TestForRationalFrac{
    private static RationalFrac frac;

    @Before
    public void createFrac(){
        frac = new RationalFrac();
    }

    @Test
    public void testDefaultValue(){
        assertEquals(frac.getNumerator(),1);
        assertEquals(frac.getDenominator(),2);
        assertEquals(frac.getIntPart(),0);

    }
    @Test(expected  = RationalFracException)
    void testToProperFracException(){
        frac.setNumerator(3);
        frac.setDenominator(5);
        frac.toProperFrac();
    }

    @Test
    void testToProperFrac() throws RationalFracException {
        frac = new RationalFrac(15,4,0);
        frac.toProperFrac();
        assertEquals(frac.getNumerator(),3);
        assertEquals(frac.getDenominator(),4);
        assertEquals(frac.getIntPart(),3);

    }
    @Test
    void testSumm(){
        frac = new RationalFrac(5,6,0);
        RationalFrac tempFrac = new RationalFrac(-2,6,0);
        frac.summ(tempFrac);
        assertEquals(frac.getNumerator(),3);
        assertEquals(frac.getDenominator(),6);
    }

    @Test
    void testMult() throws RationalFracException {
        frac = new RationalFrac(3,5,0);
        RationalFrac tempFrac = new RationalFrac(1,2,0);
        frac.mult(tempFrac);
        assertEquals(frac.getNumerator(),3);
        assertEquals(frac.getDenominator(),10);
        assertEquals(frac.getIntPart(),0);

    }

    @Test
    @Ignore
    void testPrint(){

    }
}
