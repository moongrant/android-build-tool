package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0O0 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f14971OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Activity f14972OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(o000OOo0 o000ooo1, Activity activity) {
        super(o000ooo1.f14987OooO0Oo, true);
        this.f14971OooO = o000ooo1;
        this.f14972OooO0oo = activity;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f14971OooO.f14987OooO0Oo.f15206OooO)).onActivityStopped(ObjectWrapper.wrap(this.f14972OooO0oo), this.f14977OooO0o0);
    }
}
