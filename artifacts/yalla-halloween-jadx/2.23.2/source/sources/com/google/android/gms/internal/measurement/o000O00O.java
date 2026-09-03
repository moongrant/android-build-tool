package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00O extends o000O0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Activity f14968OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f14969OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f14970OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o000OOo0 o000ooo1, Bundle bundle, Activity activity) {
        super(o000ooo1.f14987OooO0Oo, true);
        this.f14970OooOO0 = o000ooo1;
        this.f14969OooO0oo = bundle;
        this.f14968OooO = activity;
    }

    @Override // com.google.android.gms.internal.measurement.o000O0o
    public final void OooO00o() throws RemoteException {
        Bundle bundle;
        if (this.f14969OooO0oo != null) {
            bundle = new Bundle();
            if (this.f14969OooO0oo.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f14969OooO0oo.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((zzcc) Preconditions.checkNotNull(this.f14970OooOO0.f14987OooO0Oo.f15206OooO)).onActivityCreated(ObjectWrapper.wrap(this.f14968OooO), bundle, this.f14977OooO0o0);
    }
}
