package com.bebektakvimi.ahmetmatematikci.mvcpatternkullanimi;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by a on 18.04.2017.
 */

public class Ziyaret {

    private Date zaman;
    private String kimlik;
    private String aciklama;
    private boolean ispersonel;

    public Ziyaret(String kimlik, String aciklama, boolean ispersonel) {
    }


    public Date getZaman() {
        return zaman;
    }

    public void setZaman(Date zaman) {
        this.zaman = zaman;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public boolean ispersonel() {
        return ispersonel;
    }

    public void setIspersonel(boolean ispersonel) {
        this.ispersonel = ispersonel;
    }

    public Ziyaret(Date zaman, String kimlik, String aciklama, boolean ispersonel) {

    }

    @Override
    public String toString() {
        JSONObject json = new JSONObject();

        try {
            json.put("Stuff", ispersonel);
            json.put("Identity", kimlik);
            json.put("Description", aciklama);
            json.put("DataTime", zaman);
        } catch (JSONException e) {
            Log.e("Hata", e.getMessage());
        }


        return json.toString();
    }
}
