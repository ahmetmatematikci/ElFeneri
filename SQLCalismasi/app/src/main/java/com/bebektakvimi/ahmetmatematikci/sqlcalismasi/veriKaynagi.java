package com.bebektakvimi.ahmetmatematikci.sqlcalismasi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 19.04.2017.
 */

public class veriKaynagi {

    SQLiteDatabase db;
    sqliteKatmani bdb;

    public veriKaynagi(Context c) {
        bdb = new sqliteKatmani(c);
    }

    public void ac() {
        db = bdb.getWritableDatabase();
    }

    public void kapat() {
        bdb.close();
    }

    public int kullaniciOlustur(String isim) {
        //String isim = "Ahmet KILIÇ";
       // kullanici k = new kullanici();
       // k.setIsim(isim);

        ContentValues val = new ContentValues();
        val.put("isim", isim); //Buradaki isim veritabanı tablo oluştururken tutulan table ismidir
      int sonid =  (int) db.insert("kullanici", null, val);
        return sonid;

    }

    public void  kullaniciSil(kullanici k) {
        int id = k.getId();
        db.delete("kullanici", "id =" + id, null);


    }


    public List<kullanici> listele() {
        List<kullanici> liste = new ArrayList<kullanici>();
        String kolonlar[] = {"id", "isim"};
        Cursor c = db.query("kullanici", kolonlar, null, null,null,null,null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            int id = c.getInt(0);
            String isim = c.getString(0);
            String eleman = "" + id + "-" + isim;

            kullanici k = new kullanici(isim,id);
                       liste.add(k);
            c.moveToNext();

        }
        c.close();
          return liste;

    }

}
