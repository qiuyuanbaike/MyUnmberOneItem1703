package com.myunmbertwoitem1703.entity;

/**
 * Created by Administrator on 2017/6/9 0009.
 */

public class PicTextEntity {
    private String textContent;
    private int pic;
    private Long time;

    public PicTextEntity() {
    }

    public PicTextEntity(String textContent, int pic, Long time) {
        this.textContent = textContent;
        this.pic = pic;
        this.time = time;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PicTextEntity{" +
                "pic='" + pic + '\'' +
                ", textContent='" + textContent + '\'' +
                ", time=" + time +
                '}';
    }
}
