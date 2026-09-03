package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import p709oo0oOOo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends HttpDataSource.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f14837OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o000oOoO f14838OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f14839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f14840OooO0o0;

    public OooO(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f14837OooO0O0 = str;
        this.f14838OooO0OO = null;
        this.f14839OooO0Oo = 8000;
        this.f14840OooO0o0 = 8000;
    }
}
