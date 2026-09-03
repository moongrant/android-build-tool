package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends o0O.OooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f15670OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzg(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, i, null);
        this.f15670OooO0o0 = baseGmsClient;
    }

    @Override // o0O.OooO
    public final void OooO0OO(ConnectionResult connectionResult) {
        java.util.Objects.requireNonNull(this.f15670OooO0o0);
        this.f15670OooO0o0.f15528OooOOOo.onReportServiceBinding(connectionResult);
        this.f15670OooO0o0.OooO0o(connectionResult);
    }

    @Override // o0O.OooO
    public final boolean OooO0Oo() {
        this.f15670OooO0o0.f15528OooOOOo.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
