package com.group820.demos.entity;

public class Goods {
    private int Gid;
    private String Gname;
    private int Gprice;
    private String Gtype;
    private int Gdelete;
    private String Gintroduce;

    public Goods(){

    }
    public Goods(int Gid, String gname, int gprice, String gtype, int gdelete,String Gintroduce) {
        this.Gid = Gid;
        Gname = gname;
        Gprice = gprice;
        Gtype = gtype;
        Gdelete = gdelete;
        this.Gintroduce = Gintroduce;
    }

    public int getGid() {
        return Gid;
    }

    public void setGid(int Gid) {
        this.Gid = Gid;
    }

    public String getGname() {
        return Gname;
    }

    public void setGname(String gname) {
        Gname = gname;
    }

    public int getGprice() {
        return Gprice;
    }

    public void setGprice(int gprice) {
        Gprice = gprice;
    }

    public String getGtype() {
        return Gtype;
    }

    public void setGtype(String gtype) {
        Gtype = gtype;
    }

    public int getGdelete() {
        return Gdelete;
    }

    public void setGdelete(int gdelete) {
        Gdelete = gdelete;
    }

    public String getGintroduce() {
        return Gintroduce;
    }

    public void setGintroduce(String gintroduce) {
        Gintroduce = gintroduce;
    }
}
