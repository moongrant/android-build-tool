package com.yalla.yalla.model;

import androidx.compose.animation.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public class ThrowMicModel extends BaseRoomModel {
    public int micorder;
    public int reason;
    public long userid;

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("ThrowMicModel{micorder=");
        sb.append(this.micorder);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", userid=");
        return o000oOoO.OooO00o(sb, this.userid, '}');
    }
}
