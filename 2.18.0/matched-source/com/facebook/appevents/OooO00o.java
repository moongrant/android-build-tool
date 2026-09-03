package com.facebook.appevents;

import com.facebook.internal.FileLruCache;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12721Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12722OoooO00;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f12721Oooo = i;
        this.f12722OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12721Oooo) {
            case 0:
                AnalyticsUserIDStore.m110setUserID$lambda1((String) this.f12722OoooO00);
                break;
            default:
                FileLruCache.m185postTrim$lambda3$lambda2((FileLruCache) this.f12722OoooO00);
                break;
        }
    }
}
