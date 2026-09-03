package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import p257o00ooOOo.o0OOO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f14687OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzg(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, i, null);
        this.f14687OooO0o0 = baseGmsClient;
    }

    @Override // p257o00ooOOo.o0OOO0OO
    public final void OooO0OO(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f14687OooO0o0;
        baseGmsClient.getClass();
        baseGmsClient.f14548OooOOOo.onReportServiceBinding(connectionResult);
        baseGmsClient.OooO0o(connectionResult);
    }

    @Override // p257o00ooOOo.o0OOO0OO
    public final boolean OooO0Oo() {
        this.f14687OooO0o0.f14548OooOOOo.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
