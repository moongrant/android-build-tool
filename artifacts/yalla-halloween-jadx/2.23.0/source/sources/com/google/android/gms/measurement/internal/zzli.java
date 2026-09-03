package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzli {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f16111OooO00o;

    @VisibleForTesting
    public zzli(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f16111OooO00o = applicationContext;
    }
}
