package com.dev.won.gridviewexample;

public class Item_GridView {
    private int iv_thumbnail;
    private String tv_title;

    public Item_GridView(int iv_thumbnail, String tv_title) {
        this.iv_thumbnail = iv_thumbnail;
        this.tv_title = tv_title;
    }

    public int getIv_thumbnail() {
        return iv_thumbnail;
    }

    public void setIv_thumbnail(int iv_thumbnail) {
        this.iv_thumbnail = iv_thumbnail;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }
}
