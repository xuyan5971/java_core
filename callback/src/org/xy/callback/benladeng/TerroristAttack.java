package org.xy.callback.benladeng;

/**
 * Created by R9 on 2015/6/24.
 */
//�൱��class B
public class TerroristAttack{
    public TerroristAttack(){
    }

    public void attack(BoomWTC bmw){//���൱�ڡ�����3��
        //
        System.out.println("TerroristAttack call At$911's method");
        if(bmw.benLaDengDecide()){//class B�ڷ����лص�class A�ķ������൱�ڡ�i call you back��
            //let's go.........
        }
    }
}
