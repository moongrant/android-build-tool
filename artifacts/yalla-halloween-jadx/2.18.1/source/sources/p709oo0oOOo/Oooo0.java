package p709oo0oOOo;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f53418OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f53419OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Uri f53420OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, List<String>> f53421OooO0Oo;

    public Oooo0(OooO00o oooO00o) {
        Objects.requireNonNull(oooO00o);
        this.f53418OooO00o = oooO00o;
        this.f53420OooO0OO = Uri.EMPTY;
        this.f53421OooO0Oo = Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws IOException {
        this.f53420OooO0OO = dataSpec.f14801OooO00o;
        this.f53421OooO0Oo = Collections.emptyMap();
        long jOooO0o = this.f53418OooO00o.OooO0o(dataSpec);
        Uri uriOooOO0o = OooOO0o();
        Objects.requireNonNull(uriOooOO0o);
        this.f53420OooO0OO = uriOooOO0o;
        this.f53421OooO0Oo = OooO0oo();
        return jOooO0o;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0oo() {
        return this.f53418OooO00o.OooO0oo();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooOO0O(o000oOoO o000oooo2) {
        Objects.requireNonNull(o000oooo2);
        this.f53418OooO00o.OooOO0O(o000oooo2);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        return this.f53418OooO00o.OooOO0o();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws IOException {
        this.f53418OooO00o.close();
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f53418OooO00o.read(bArr, i, i2);
        if (i3 != -1) {
            this.f53419OooO0O0 += (long) i3;
        }
        return i3;
    }
}
