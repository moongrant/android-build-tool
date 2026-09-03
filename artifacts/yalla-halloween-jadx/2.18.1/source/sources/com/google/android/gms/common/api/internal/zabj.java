package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zabj {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ExecutorService f15381OooO00o = com.google.android.gms.internal.base.zap.zaa().zac(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService zaa() {
        return f15381OooO00o;
    }
}
