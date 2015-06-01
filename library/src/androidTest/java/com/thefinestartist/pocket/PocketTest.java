package com.thefinestartist.pocket;

import android.content.Context;
import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by TheFinestArtist on 4/29/15.
 */
public class PocketTest extends InstrumentationTestCase {

    Context context;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        context = getInstrumentation().getContext();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        context = null;
    }

    @SmallTest
    public void testPeek() {
        Object i = 1;
        assertEquals(true, i.getClass().isPrimitive());
    }
}
