package com.yalla.yalla.model.room;

import com.yalla.yalla.model.bean.AbsJavaBean;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
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

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("RoomThemeBuyModel{balance='");
        sb.append(this.balance);
        sb.append("', daynum='");
        sb.append(this.daynum);
        sb.append("', paytype='");
        return OooOO0.OooO00o(sb, this.paytype, "'}");
    }
}
