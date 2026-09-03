package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO extends ContentObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzhf f15479OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(zzhf zzhfVar) {
        super(null);
        this.f15479OooO00o = zzhfVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f15479OooO00o.zzf();
    }
}
