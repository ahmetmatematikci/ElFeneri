package com.bebektakvimi.ahmetmatematikci.sqlcalismasi;

/**
 * Created by a on 19.04.2017.
 */

public class kullanici {
    String isim;
    int id;

    public kullanici(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ". " + isim ;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public kullanici(String isim) {
        this.isim = isim;
    }
}
