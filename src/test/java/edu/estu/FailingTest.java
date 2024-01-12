package edu.estu;

import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */
public class FailingTest {
    @Test(timeout = 1000)
    public void testInfiniteLoopBug() {
        try {
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            fail("An infinite loop was anticipated, but the method finished within the timeout...");
        } catch (Throwable e) {
            // Additional verification might be added here to assert the expected error.
        }
    }
}
