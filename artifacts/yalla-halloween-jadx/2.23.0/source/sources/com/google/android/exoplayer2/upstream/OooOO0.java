package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p226o00oOo00.o0000;
import p244o00oo0Oo.o00O0O0;
import p244o00oo0Oo.o00oOoo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0<T> implements Loader.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f14246OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DataSpec f14247OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f14248OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0O0 f14249OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public volatile T f14250OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o<? extends T> f14251OooO0o0;

    public interface OooO00o<T> {
        Object OooO00o(Uri uri, o00oOoo o00oooo2) throws IOException;
    }

    public OooOO0() {
        throw null;
    }

    public OooOO0(com.google.android.exoplayer2.upstream.OooO00o oooO00o, Uri uri, int i, OooO00o<? extends T> oooO00o2) {
        Map mapEmptyMap = Collections.emptyMap();
        o00O000o.OooO0o(uri, "The uri must be set.");
        DataSpec dataSpec = new DataSpec(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.f14249OooO0Oo = new o00O0O0(oooO00o);
        this.f14247OooO0O0 = dataSpec;
        this.f14248OooO0OO = i;
        this.f14251OooO0o0 = oooO00o2;
        this.f14246OooO00o = o0000.f39822OooO0O0.getAndIncrement();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
    public final void OooO00o() throws IOException {
        this.f14249OooO0Oo.f40516OooO0O0 = 0L;
        o00oOoo o00oooo2 = new o00oOoo(this.f14249OooO0Oo, this.f14247OooO0O0);
        try {
            if (!o00oooo2.f40538OooO0oO) {
                o00oooo2.f40535OooO0Oo.OooO00o(o00oooo2.f40537OooO0o0);
                o00oooo2.f40538OooO0oO = true;
            }
            Uri uriOooOO0O = this.f14249OooO0Oo.OooOO0O();
            uriOooOO0O.getClass();
            this.f14250OooO0o = (T) this.f14251OooO0o0.OooO00o(uriOooOO0O, o00oooo2);
        } finally {
            o0O00.OooO0oO(o00oooo2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
    public final void OooO0O0() {
    }
}
