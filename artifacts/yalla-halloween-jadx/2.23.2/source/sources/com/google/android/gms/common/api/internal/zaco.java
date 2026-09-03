package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zaco {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ExecutorService f14421OooO00o = com.google.android.gms.internal.base.zap.zaa().zaa(new NumberedThreadFactory("GAC_Transform"), 1);

    public static ExecutorService zaa() {
        return f14421OooO00o;
    }
}
