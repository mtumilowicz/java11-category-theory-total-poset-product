import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-12-20.
 */
public class TotalPosetProductIntegerTest {
    
    @Test
    public void min_1_10() {
        var posetProduct = new TotalPosetProduct<>(1, 10);
        
        assertThat(posetProduct.min, is(1));
    }

}