package org.xy.callback.benladeng;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by R9 on 2015/6/24.
 */
//�൱��class A
public class At$911 implements BoomWTC{//�൱�ڡ�����1��
    private boolean decide;
    private TerroristAttack ta;//�൱�ڡ�����2��

    public At$911(){
        Date now=new Date();
        SimpleDateFormat myFmt=new SimpleDateFormat("yy/MM/dd HH:mm");
        this.decide= myFmt.format(now).equals("01/09/11 09:44");
        this.ta=new TerroristAttack();
    }

    //������ǵľ���
    public boolean benLaDengDecide(){
        return decide;
    }

    // ִ�к�ը��ó
    public void boom(){
        System.out.println("At$911 call TerroristAttack's method");
        ta.attack(new At$911());//class A����class B�ķ��������Լ��Ķ����൱�ڡ�you call me��
    }
}
