package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Object f15414OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f15415OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ zzef f15416OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(zzef zzefVar, String str, Object obj) {
        super(zzefVar, false);
        this.f15416OooOO0 = zzefVar;
        this.f15415OooO0oo = str;
        this.f15414OooO = obj;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15416OooOO0.f15682OooO)).logHealthData(5, this.f15415OooO0oo, ObjectWrapper.wrap(this.f15414OooO), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
