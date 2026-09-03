package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f15480OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Activity f15481OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f15482OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ zzef f15483OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(zzef zzefVar, Activity activity, String str, String str2) {
        super(zzefVar, true);
        this.f15483OooOO0O = zzefVar;
        this.f15481OooO0oo = activity;
        this.f15480OooO = str;
        this.f15482OooOO0 = str2;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15483OooOO0O.f15682OooO)).setCurrentScreen(ObjectWrapper.wrap(this.f15481OooO0oo), this.f15480OooO, this.f15482OooOO0, this.f15452OooO0Oo);
    }
}
