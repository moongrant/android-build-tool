package com.yalla.yalla.model;

import com.facebook.appevents.AppEventsConstants;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public class DyMessageModel {
    public int buytype;
    public long headframeId;
    public String headframeUrl;
    public int viplevel;
    public String medalid = "";
    public String type = "";
    public String headurl = "";
    public String sex = "";
    public String nickname = "";
    public String ispraise = "";
    public String dyid = "";
    public String dyurl = "";
    public String level = "";
    public String coin = "";
    public String upcrystal = "";
    public String language = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public String ExpirationTime = "";

    public String toString() {
        StringBuilder sb = new StringBuilder("DyMessageModel{medalid='");
        sb.append(this.medalid);
        sb.append("', type='");
        sb.append(this.type);
        sb.append("', headurl='");
        sb.append(this.headurl);
        sb.append("', sex='");
        sb.append(this.sex);
        sb.append("', nickname='");
        sb.append(this.nickname);
        sb.append("', ispraise='");
        sb.append(this.ispraise);
        sb.append("', dyid='");
        sb.append(this.dyid);
        sb.append("', dyurl='");
        sb.append(this.dyurl);
        sb.append("', level='");
        sb.append(this.level);
        sb.append("', coin='");
        sb.append(this.coin);
        sb.append("', upcrystal='");
        sb.append(this.upcrystal);
        sb.append("', language='");
        sb.append(this.language);
        sb.append("', ExpirationTime='");
        sb.append(this.ExpirationTime);
        sb.append("', viplevel=");
        sb.append(this.viplevel);
        sb.append(", headframeId=");
        sb.append(this.headframeId);
        sb.append(", headframeUrl='");
        return o0O00o0.OooO0O0(sb, this.headframeUrl, "'}");
    }
}
