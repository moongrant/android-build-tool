package com.umeng.analytics.pro;

import o0O0O00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class bn {
    public final String a;
    public final byte b;
    public final short c;

    public bn() {
        this("", (byte) 0, (short) 0);
    }

    public boolean a(bn bnVar) {
        return this.b == bnVar.b && this.c == bnVar.c;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("<TField name:'");
        sbOooO0o0.append(this.a);
        sbOooO0o0.append("' type:");
        sbOooO0o0.append((int) this.b);
        sbOooO0o0.append(" field-id:");
        return o0ooOOo.OooO00o(sbOooO0o0, this.c, ">");
    }

    public bn(String str, byte b, short s) {
        this.a = str;
        this.b = b;
        this.c = s;
    }
}
