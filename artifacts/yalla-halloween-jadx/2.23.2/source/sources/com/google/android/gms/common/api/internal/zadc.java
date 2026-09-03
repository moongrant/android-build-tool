package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p256o00ooOO0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class zadc {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final Set<BasePendingResult<?>> f14440OooO00o = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0oOOo f14441OooO0O0 = new o0oOOo(this);

    public final void zab() {
        Set<BasePendingResult<?>> set = this.f14440OooO00o;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                set.remove(basePendingResult);
            }
        }
    }
}
