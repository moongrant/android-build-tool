package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p260o00ooOoo.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f14813OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f14814OooO0O0 = new AtomicInteger();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ThreadFactory f14815OooO0OO = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String str) {
        Preconditions.checkNotNull(str, "Name must not be null");
        this.f14813OooO00o = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread threadNewThread = this.f14815OooO0OO.newThread(new ooo0Oo0(runnable));
        threadNewThread.setName(this.f14813OooO00o + "[" + this.f14814OooO0O0.getAndIncrement() + "]");
        return threadNewThread;
    }
}
