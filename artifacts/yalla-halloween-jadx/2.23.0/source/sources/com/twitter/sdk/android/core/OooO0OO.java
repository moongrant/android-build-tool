package com.twitter.sdk.android.core;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO implements OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f21965OooO00o = 4;

    public OooO0OO(int i) {
    }

    @Override // com.twitter.sdk.android.core.OooOO0O
    public final void OooO00o(String str, String str2) {
        OooO0Oo(str, str2, null);
    }

    @Override // com.twitter.sdk.android.core.OooOO0O
    public final void OooO0O0(String str, String str2) {
        if (this.f21965OooO00o <= 3) {
            Log.d(str, str2, null);
        }
    }

    @Override // com.twitter.sdk.android.core.OooOO0O
    public final void OooO0OO(String str) {
        if (this.f21965OooO00o <= 5) {
            Log.w("Twitter", str, null);
        }
    }

    @Override // com.twitter.sdk.android.core.OooOO0O
    public final void OooO0Oo(String str, String str2, Throwable th) {
        if (this.f21965OooO00o <= 6) {
            Log.e(str, str2, th);
        }
    }

    public OooO0OO() {
    }
}
