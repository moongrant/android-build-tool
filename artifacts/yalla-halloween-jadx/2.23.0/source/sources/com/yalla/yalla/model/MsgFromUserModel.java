package com.yalla.yalla.model;

import androidx.compose.foundation.layout.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public class MsgFromUserModel {
    public int hasmic;
    public String headphoto;
    public String level;
    public int morder;
    public String name;
    public int panda;
    public int position;
    public String prettyid;
    public int role;
    public int sex;
    public int silenced;
    public String uid;
    public int vehicle;
    public int vip;

    public String toString() {
        StringBuilder sb = new StringBuilder("MsgFromUserModel{uid='");
        sb.append(this.uid);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', headphoto='");
        sb.append(this.headphoto);
        sb.append("', level='");
        sb.append(this.level);
        sb.append("', sex=");
        sb.append(this.sex);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", silenced=");
        sb.append(this.silenced);
        sb.append(", hasmic=");
        sb.append(this.hasmic);
        sb.append(", vip=");
        sb.append(this.vip);
        sb.append(", vehicle=");
        return OooO0O0.OooO00o(sb, this.vehicle, '}');
    }
}
