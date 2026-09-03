package com.facebook.appevents;

import com.facebook.internal.FileLruCache;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12705Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12706Oooo0oO;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f12705Oooo0o = i;
        this.f12706Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12705Oooo0o) {
            case 0:
                AnalyticsUserIDStore.m110setUserID$lambda1((String) this.f12706Oooo0oO);
                break;
            default:
                FileLruCache.m185postTrim$lambda3$lambda2((FileLruCache) this.f12706Oooo0oO);
                break;
        }
    }
}
