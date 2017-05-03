package com.bebektakvimi.ahmetmatematikci.mvcpatternkullanimi;

import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by a on 18.04.2017.
 */

public class ZiyaretciController {

    private MainActivity activity;

    public ZiyaretciController(MainActivity activity) {
        this.activity = activity;
    }

    public Ziyaret getZiyaret() {

        String kimlik = ((EditText) activity.findViewById(R.id.txtKimlik)).getText().toString();
        String aciklama = ((EditText) activity.findViewById(R.id.txtAciklama)).getText().toString();
        boolean ispersonel = ((RadioButton)activity.findViewById(R.id.rdoPersonel)).isChecked();

        return new Ziyaret(kimlik,aciklama,ispersonel);
    }


}
