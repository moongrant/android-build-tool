package com.umeng.analytics.pro;

import o0O0O00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class bq {
    public final String a;
    public final byte b;
    public final int c;

    public bq() {
        this("", (byte) 0, 0);
    }

    public boolean a(bq bqVar) {
        return this.a.equals(bqVar.a) && this.b == bqVar.b && this.c == bqVar.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bq) {
            return a((bq) obj);
        }
        return false;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("<TMessage name:'");
        sbOooO0o0.append(this.a);
        sbOooO0o0.append("' type: ");
        sbOooO0o0.append((int) this.b);
        sbOooO0o0.append(" seqid:");
        return o0ooOOo.OooO00o(sbOooO0o0, this.c, ">");
    }

    public bq(String str, byte b, int i) {
        this.a = str;
        this.b = b;
        this.c = i;
    }
}
