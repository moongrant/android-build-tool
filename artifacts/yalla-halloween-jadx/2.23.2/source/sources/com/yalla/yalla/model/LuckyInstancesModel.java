package com.yalla.yalla.model;

import androidx.compose.foundation.layout.OooO0O0;
import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class LuckyInstancesModel extends AbsJavaBean {
    private int llevel;
    private int lmultiple;
    private int lnumtime;
    private int lreward;

    public int getLlevel() {
        return this.llevel;
    }

    public int getLmultiple() {
        return this.lmultiple;
    }

    public int getLnumtime() {
        return this.lnumtime;
    }

    public int getLreward() {
        return this.lreward;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("LuckyInstancesModel{llevel=");
        sb.append(this.llevel);
        sb.append(", lnumtime=");
        sb.append(this.lnumtime);
        sb.append(", lmultiple=");
        sb.append(this.lmultiple);
        sb.append(", lreward=");
        return OooO0O0.OooO00o(sb, this.lreward, '}');
    }
}
