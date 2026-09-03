package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f15440OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f15441OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Object f15442OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f15443OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ zzef f15444OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(zzef zzefVar, String str, String str2, Object obj, boolean z) {
        super(zzefVar, true);
        this.f15444OooOO0o = zzefVar;
        this.f15441OooO0oo = str;
        this.f15440OooO = str2;
        this.f15442OooOO0 = obj;
        this.f15443OooOO0O = z;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15444OooOO0o.f15682OooO)).setUserProperty(this.f15441OooO0oo, this.f15440OooO, ObjectWrapper.wrap(this.f15442OooOO0), this.f15443OooOO0O, this.f15452OooO0Oo);
    }
}
