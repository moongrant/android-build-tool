package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 extends ContentObserver {
    public o00O00() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzha.f15698OooO00o.set(true);
    }
}
