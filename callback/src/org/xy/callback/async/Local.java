package org.xy.callback.async;

/**
 * Created by R9 on 2015/6/24.
 */
/**
 * ������൱�����Լ�
 */
public class Local implements CallBack,Runnable{

    private Remote remote;

    /**
     * ���ͳ�ȥ����Ϣ
     */
    private String message;

    public Local(Remote remote, String message) {
        super();
        this.remote = remote;
        this.message = message;
    }

    /**
     * ������Ϣ
     */
    public void sendMessage()
    {
        /**��ǰ�̵߳�����**/
        System.out.println(Thread.currentThread().getName());
        /**����һ���µ��̷߳�����Ϣ**/
        Thread thread = new Thread(this);
        thread.start();
        /**��ǰ�̼߳���ִ��**/
        System.out.println("Message has been sent by Local~!");
    }

    /**
     * ������Ϣ��Ļص�����
     */
    public void execute(Object... objects ) {
        /**��ӡ���ص���Ϣ**/
        System.out.println(objects[0]);
        /**��ӡ������Ϣ���߳�����**/
        System.out.println(Thread.currentThread().getName());
        /**�жϷ�����Ϣ���߳�**/
        Thread.interrupted();
    }

    public static void main(String[] args)
    {
        Local local = new Local(new Remote(),"Hello");

        local.sendMessage();
    }
    @Override
    public void run() {
        remote.executeMessage(message, this);  //���൱�ڸ�ͬѧ��绰������绰֮������߳̾Ϳ���ȥ�����������ˣ�ֻ�����ȵ����ͬѧ��ص绰�����ʱ����Ҫ������Ӧ

    }
}
