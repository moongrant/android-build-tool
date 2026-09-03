package com.ishumei.l111l11111Il.l1111l111111Il;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class l11l1111I1ll extends l111l1111lI1l {
    private Context l1111l111111Il;

    public l11l1111I1ll(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.l111l11111Il.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            return (String) cls.getMethod("getOAID", Context.class).invoke(cls.newInstance(), this.l1111l111111Il);
        } catch (Exception unused) {
            return "";
        }
    }
}
