package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f14157OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f14158OooO0Oo;

    public DataSourceException(int i) {
        this.f14158OooO0Oo = i;
    }

    public DataSourceException(int i, @Nullable Throwable th) {
        super(th);
        this.f14158OooO0Oo = i;
    }

    public DataSourceException(@Nullable String str, int i) {
        super(str);
        this.f14158OooO0Oo = i;
    }

    public DataSourceException(@Nullable Throwable th, int i, @Nullable String str) {
        super(str, th);
        this.f14158OooO0Oo = i;
    }
}
