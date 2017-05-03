package com.adif.ahmetmatematikci.kaetoyunu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatDrawableManager;
import android.widget.Button;

/**
 * Created by a on 21.04.2017.
 */

public class kart  extends Button{

    boolean cevrilebilir= true;

    boolean acikMi= false;
    int resimID;
    int arkaPlanID;
    int onPlanID = 0;
    Drawable on, arka;



    public kart(Context context, int id) {
        super(context);
        setId(id);
        arkaPlanID = R.drawable.back;
        if (id%8==1)
            onPlanID = R.drawable.a1;
        if (id%8==2)
            onPlanID = R.drawable.a2;
        if (id%8==3)
            onPlanID = R.drawable.a3;
        if (id%8==4)
            onPlanID = R.drawable.a4;
        if (id%8==5)
            onPlanID = R.drawable.a5;
        if (id%8==6)
            onPlanID = R.drawable.a6;
        if (id%8==7)
            onPlanID = R.drawable.a7;
        if (id%8==0)
            onPlanID = R.drawable.a8;




       arka = AppCompatDrawableManager.get().getDrawable(context,arkaPlanID);
        on = AppCompatDrawableManager.get().getDrawable(context,onPlanID);
        setBackground(arka);
    }

    public void cevir(){
        if(cevrilebilir) {
            if (!acikMi) { // arkasi cevriliyse
                setBackground(on);
                acikMi = true;
            } else {
                setBackground(arka);
                acikMi = false;
            }
        }
    }

}
