package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import o000O0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooOO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f7021OooO00o = new OooOO0();

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.OooO00o
    public final Map OooO0Oo() {
        return Collections.emptyMap();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void OooO0oO(OooOo oooOo) {
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return null;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() {
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
