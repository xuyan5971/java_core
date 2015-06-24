package org.xy.callback.async;

import org.junit.Test;

/**
 * Created by R9 on 2015/6/24.
 */
public class AsyncCallBackTest {
    @Test
    public void test(){
        Local local = new Local(new Remote(),"Hello");

        local.sendMessage();
    }
}
