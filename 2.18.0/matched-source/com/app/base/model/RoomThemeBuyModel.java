package com.app.base.model;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class RoomThemeBuyModel extends AbsJavaBean {
    private long balance;
    private long daynum;
    private int paytype;

    public long getBalance() {
        return this.balance;
    }

    public long getDaynum() {
        return this.daynum;
    }

    public int getPaytype() {
        return this.paytype;
    }

    public void setBalance(long j) {
        this.balance = j;
    }

    public void setDaynum(long j) {
        this.daynum = j;
    }

    public void setPaytype(int i) {
        this.paytype = i;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("RoomThemeBuyModel{balance='");
        sbOooO0O0.append(this.balance);
        sbOooO0O0.append('\'');
        sbOooO0O0.append(", daynum='");
        sbOooO0O0.append(this.daynum);
        sbOooO0O0.append('\'');
        sbOooO0O0.append(", paytype='");
        sbOooO0O0.append(this.paytype);
        sbOooO0O0.append('\'');
        sbOooO0O0.append('}');
        return sbOooO0O0.toString();
    }
}
