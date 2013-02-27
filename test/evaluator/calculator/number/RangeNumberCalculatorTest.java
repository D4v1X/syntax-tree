package evaluator.calculator.number;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class RangeNumberCalculatorTest {

    private NumberCalculator coreNumberCalculator;

    @Before
    public void createCoreCalculator() {
        coreNumberCalculator = mock(NumberCalculator.class);
        when(coreNumberCalculator.add(2.0, 2.0)).thenReturn(4.0);
    }

    private RangeNumberCalculator getCalculator() {
        return getCalculator(null, null);
    }

    private RangeNumberCalculator getCalculator(Double upperLimit, Double lowerLimit) {
        return new RangeNumberCalculator(coreNumberCalculator, new Range(upperLimit, lowerLimit));
    }
    
    @Test
    public void add(){
        assertEquals(4.0, getCalculator().add(2.0, 2.0), 0.000001);
        verify(coreNumberCalculator).add(2.0, 2.0);
    }
}
