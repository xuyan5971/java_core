package org.xy.callback.benladeng;

/**
 * Created by R9 on 2015/6/24.
 */
//相当于class B
public class TerroristAttack{
    public TerroristAttack(){
    }

    public void attack(BoomWTC bmw){//这相当于【背景3】
        //
        System.out.println("TerroristAttack call At$911's method");
        if(bmw.benLaDengDecide()){//class B在方法中回调class A的方法，相当于【i call you back】
            //let's go.........
        }
    }
}
