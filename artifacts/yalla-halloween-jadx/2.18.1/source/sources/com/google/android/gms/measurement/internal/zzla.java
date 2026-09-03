package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzla {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f16314OooO00o;

    @VisibleForTesting
    public zzla(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f16314OooO00o = applicationContext;
    }
}
