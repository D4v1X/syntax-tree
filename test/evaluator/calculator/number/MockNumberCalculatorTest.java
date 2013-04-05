package evaluator.calculator.number;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MockNumberCalculatorTest {

    private NumberCalculator coreNumberCalculator;

    @Before
    public void createCoreCalculator() {
        coreNumberCalculator = mock(NumberCalculator.class);
        when(coreNumberCalculator.add(2.0, 2.0)).thenReturn(4.0);
        when(coreNumberCalculator.subtract(4.0, 2.0)).thenReturn(2.0);
        when(coreNumberCalculator.mul(3.0, 2.0)).thenReturn(6.0);
    }

    private NumberCalculator getCalculator() {
        return new CoreNumberCalculator();
    }

    @Test
    public void add() {
        assertEquals(4.0, getCalculator().add(2.0, 2.0), 0.000001);
        verify(coreNumberCalculator).add(2.0, 2.0);
    }

    @Test
    public void subtract() {
        assertEquals(2.0, getCalculator().subtract(4.0, 2.0), 0.000001);
        verify(coreNumberCalculator).subtract(4.0, 2.0);
    }

    @Test
    public void mul() {
        assertEquals(6.0, getCalculator().mul(2.0, 3.0), 0.000001);
        verify(coreNumberCalculator).mul(2.0, 3.0);
    }
}
