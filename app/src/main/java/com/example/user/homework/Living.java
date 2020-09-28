package com.example.user.homework;

import android.widget.BaseAdapter;
import android.widget.Filterable;

public class Living {
    private String na;
    private String aa;
    private String pa;

    public Living(){
    }

    public Living(String na, String aa, String pa) {
        this.na = na;
        this.aa = aa;
        this.pa = pa;
    }

    public String getN() {
        return na;
    }

    public void setN(String na) {
        this.na = na;
    }

    public String getA() {
        return aa;
    }

    public void setA(String aa) {
        this.aa = aa;
    }

    public String getP() {
        return pa;
    }

    public void setP(String pa) {
        this.pa = pa;
    }
}

