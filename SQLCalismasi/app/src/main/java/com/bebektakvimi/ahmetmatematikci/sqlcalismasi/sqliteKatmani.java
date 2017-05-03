package com.bebektakvimi.ahmetmatematikci.sqlcalismasi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a on 19.04.2017.
 */

public class sqliteKatmani  extends SQLiteOpenHelper{
    public sqliteKatmani(Context c) {
        super(c,"kullanici",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table kullanici (id integer primary key autoincrement, isim text not null)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int eski, int yeni) {
        String upgradeSql = "drop table if exists kullanici";
        db.execSQL(upgradeSql);

    }
}
