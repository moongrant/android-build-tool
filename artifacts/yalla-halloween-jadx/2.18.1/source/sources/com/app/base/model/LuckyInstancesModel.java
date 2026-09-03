package com.app.base.model;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
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

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("LuckyInstancesModel{llevel=");
        sbOooO0o0.append(this.llevel);
        sbOooO0o0.append(", lnumtime=");
        sbOooO0o0.append(this.lnumtime);
        sbOooO0o0.append(", lmultiple=");
        sbOooO0o0.append(this.lmultiple);
        sbOooO0o0.append(", lreward=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.lreward, '}');
    }
}
