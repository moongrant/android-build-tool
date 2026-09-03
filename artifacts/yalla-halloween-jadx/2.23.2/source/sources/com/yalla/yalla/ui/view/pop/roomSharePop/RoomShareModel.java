package com.yalla.yalla.ui.view.pop.roomSharePop;

import androidx.compose.foundation.layout.OooO0O0;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.fragment.ContributionFragment;

/* JADX INFO: loaded from: classes4.dex */
public class RoomShareModel extends AbsJavaBean {
    private String content;
    private String imagesUrl;
    private String roomIdx;

    @SerializedName(alternate = {ContributionFragment.ARG_1}, value = "roomid")
    private String roomid;
    private String title;
    private int type;
    private String url;

    public RoomShareModel(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.title = str;
        this.content = str2;
        this.url = str3;
        this.imagesUrl = str4;
        this.roomid = str5;
        this.roomIdx = str6;
        this.type = i;
    }

    public String getContent() {
        return this.content;
    }

    public String getImageUrl() {
        return this.imagesUrl;
    }

    public String getRoomIdx() {
        return this.roomIdx;
    }

    public String getRoomid() {
        return this.roomid;
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

    public RoomShareModel setRoomIdx(String str) {
        this.roomIdx = str;
        return this;
    }

    public void setRoomid(String str) {
        this.roomid = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("RoomShareModel{title='");
        sb.append(this.title);
        sb.append("', content='");
        sb.append(this.content);
        sb.append("', url='");
        sb.append(this.url);
        sb.append("', imagesUrl='");
        sb.append(this.imagesUrl);
        sb.append("', roomId='");
        sb.append(this.roomid);
        sb.append("', roomIdx='");
        sb.append(this.roomIdx);
        sb.append("', type=");
        return OooO0O0.OooO00o(sb, this.type, '}');
    }
}
