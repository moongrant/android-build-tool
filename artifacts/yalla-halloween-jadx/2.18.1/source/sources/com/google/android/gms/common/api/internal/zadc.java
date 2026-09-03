package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p331o0O0oooO.o0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zadc {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final Set<BasePendingResult<?>> f15418OooO00o = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO0 f15419OooO0O0 = new o0OO0(this);

    public final void zab() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f15418OooO00o.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.f15418OooO00o.remove(basePendingResult);
            }
        }
    }
}
