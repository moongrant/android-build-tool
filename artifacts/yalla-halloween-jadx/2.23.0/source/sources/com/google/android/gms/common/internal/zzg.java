package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import p255o00ooOOo.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg extends o0oOOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f15163OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzg(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, i, null);
        this.f15163OooO0o0 = baseGmsClient;
    }

    @Override // p255o00ooOOo.o0oOOo
    public final void OooO0OO(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f15163OooO0o0;
        baseGmsClient.getClass();
        baseGmsClient.f15024OooOOOo.onReportServiceBinding(connectionResult);
        baseGmsClient.OooO0o(connectionResult);
    }

    @Override // p255o00ooOOo.o0oOOo
    public final boolean OooO0Oo() {
        this.f15163OooO0o0.f15024OooOOOo.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
