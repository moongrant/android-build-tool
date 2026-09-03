package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO0O extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f15460OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Activity f15461OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(o000OOo0 o000ooo1, Activity activity) {
        super(o000ooo1.f15464OooO0Oo, true);
        this.f15460OooO = o000ooo1;
        this.f15461OooO0oo = activity;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f15460OooO.f15464OooO0Oo.f15682OooO)).onActivityPaused(ObjectWrapper.wrap(this.f15461OooO0oo), this.f15454OooO0o0);
    }
}
