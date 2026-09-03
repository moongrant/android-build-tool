package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zaad {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f14810OooO00o = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<TaskCompletionSource<?>, Boolean> f14811OooO0O0 = Collections.synchronizedMap(new WeakHashMap());

    public final void OooO00o(Status status, boolean z) {
        HashMap map;
        HashMap map2;
        synchronized (this.f14810OooO00o) {
            map = new HashMap(this.f14810OooO00o);
        }
        synchronized (this.f14811OooO0O0) {
            map2 = new HashMap(this.f14811OooO0O0);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    public final void zaf() {
        OooO00o(GoogleApiManager.zaa, false);
    }
}
