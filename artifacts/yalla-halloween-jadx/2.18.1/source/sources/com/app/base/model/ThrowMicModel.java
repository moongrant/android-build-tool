package com.app.base.model;

import OooO00o.OooO00o;
import Oooo000.o000O0;

/* JADX INFO: loaded from: classes.dex */
public class ThrowMicModel extends BaseRoomModel {
    public int micorder;
    public int reason;
    public long userid;

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ThrowMicModel{micorder=");
        sbOooO0o0.append(this.micorder);
        sbOooO0o0.append(", reason=");
        sbOooO0o0.append(this.reason);
        sbOooO0o0.append(", userid=");
        return o000O0.OooO0O0(sbOooO0o0, this.userid, '}');
    }
}
