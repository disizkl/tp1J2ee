package metier;

import org.junit.Assert;
import org.junit.Test;

public class Calcultest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=10;
        double b=20;
        double expected=30;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
