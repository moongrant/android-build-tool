package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p244o00oo0Oo.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0O f14252OooO00o = new OooOO0O();

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooO0OO(o00O0OO0 o00o0oo1) {
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map OooO0o0() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() {
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
