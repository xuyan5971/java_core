package org.xy.callback.async;

/**
 * Created by R9 on 2015/6/24.
 */
/**
 * ������൱�����ͬѧ
 */
public class Remote {

    /**
     * ������Ϣ
     * @param msg   ���յ���Ϣ
     * @param callBack  �ص�����������
     */
    public void executeMessage(String msg,CallBack callBack)
    {
        /**ģ��Զ�������ڴ����������飬������Ҫ�������ʱ��**/
        long t1 = System.currentTimeMillis();
        for(int i=0;i<1000000000;i++)
        {

        }
        System.out.println(System.currentTimeMillis() - t1);
        /**�������������飬������������Ϣ**/
        System.out.println(msg);
        System.out.println("I hava executed the message by Local");
        /**ִ�лص�**/
        callBack.execute(new String[]{"Nice to meet you~!"});  //���൱��ͬѧִ����֮���绰����
    }

}

