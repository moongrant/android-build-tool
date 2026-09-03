package o000O0O;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooOOOO implements androidx.media3.datasource.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o f34181OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f34182OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Uri f34183OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, List<String>> f34184OooO0Oo;

    public OooOOOO(androidx.media3.datasource.OooO00o oooO00o) {
        oooO00o.getClass();
        this.f34181OooO00o = oooO00o;
        this.f34183OooO0OO = Uri.EMPTY;
        this.f34184OooO0Oo = Collections.emptyMap();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        this.f34183OooO0OO = dataSpec.f6970OooO00o;
        this.f34184OooO0Oo = Collections.emptyMap();
        long jOooO00o = this.f34181OooO00o.OooO00o(dataSpec);
        Uri uriOooOO0O = OooOO0O();
        uriOooOO0O.getClass();
        this.f34183OooO0OO = uriOooOO0O;
        this.f34184OooO0Oo = OooO0Oo();
        return jOooO00o;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final Map<String, List<String>> OooO0Oo() {
        return this.f34181OooO00o.OooO0Oo();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void OooO0oO(OooOo oooOo) {
        oooOo.getClass();
        this.f34181OooO00o.OooO0oO(oooOo);
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f34181OooO00o.OooOO0O();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() throws IOException {
        this.f34181OooO00o.close();
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f34181OooO00o.read(bArr, i, i2);
        if (i3 != -1) {
            this.f34182OooO0O0 += (long) i3;
        }
        return i3;
    }
}
