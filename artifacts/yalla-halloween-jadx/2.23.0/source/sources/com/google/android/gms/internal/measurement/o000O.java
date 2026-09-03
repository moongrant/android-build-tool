package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzbz f15434OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Activity f15435OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f15436OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o000OOo0 o000ooo1, Activity activity, zzbz zzbzVar) {
        super(o000ooo1.f15464OooO0Oo, true);
        this.f15436OooOO0 = o000ooo1;
        this.f15435OooO0oo = activity;
        this.f15434OooO = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15436OooOO0.f15464OooO0Oo.f15682OooO)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.f15435OooO0oo), this.f15434OooO, this.f15454OooO0o0);
    }
}
