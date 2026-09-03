package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzbz f14957OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Activity f14958OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f14959OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o000OOo0 o000ooo1, Activity activity, zzbz zzbzVar) {
        super(o000ooo1.f14987OooO0Oo, true);
        this.f14959OooOO0 = o000ooo1;
        this.f14958OooO0oo = activity;
        this.f14957OooO = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f14959OooOO0.f14987OooO0Oo.f15206OooO)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.f14958OooO0oo), this.f14957OooO, this.f14977OooO0o0);
    }
}
