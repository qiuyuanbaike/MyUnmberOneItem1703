package com.tedu.unmber.one.item;

/**
 * Created by Administrator on 2017/5/26 0026.
 */

public class Sault {
    private int img;
    private String title;

    public Sault() {
    }

    public Sault(String title, int img) {
        this.title = title;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
