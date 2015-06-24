package org.xy.callback.async;

/**
 * Created by R9 on 2015/6/24.
 */
public interface CallBack {
    /**
     * 执行回调方法
     * @param objects   将处理后的结果作为参数返回给回调方法
     */
    public void execute(Object... objects );
}
