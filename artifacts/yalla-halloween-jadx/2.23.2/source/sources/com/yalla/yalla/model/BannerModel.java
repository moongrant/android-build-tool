package com.yalla.yalla.model;

import androidx.compose.foundation.layout.OooO0O0;
import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class BannerModel<T> extends AbsJavaBean {
    public static final int EXTYPE_ROOM = 1;
    public static final int EXTYPE_WEB = 0;
    public static final int TYPE_ORDINARY = 0;
    public static final int TYPE_WEEK_GIFT = 1;
    private String barid;
    private int extype;
    public String id;
    private String imageurl;
    private int isshare;
    private int jumptype;
    private String roomserverip;
    private String title;
    private int type;
    private String url;

    public String getBarid() {
        return this.barid;
    }

    public int getExtype() {
        return this.extype;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public int getJumptype() {
        return this.jumptype;
    }

    public String getRoomserverip() {
        return this.roomserverip;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int isIsshare() {
        return this.isshare;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("BannerModel{jumptype=");
        sb.append(this.jumptype);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", imageurl='");
        sb.append(this.imageurl);
        sb.append("', url='");
        sb.append(this.url);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', barid='");
        sb.append(this.barid);
        sb.append("', roomserverip='");
        sb.append(this.roomserverip);
        sb.append("', extype=");
        return OooO0O0.OooO00o(sb, this.extype, '}');
    }
}
