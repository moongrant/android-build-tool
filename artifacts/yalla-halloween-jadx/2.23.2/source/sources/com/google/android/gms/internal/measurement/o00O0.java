package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0 extends ContentObserver {
    public o00O0() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzib.zzc();
    }
}
