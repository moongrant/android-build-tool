package p244o00oo0Oo;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f40515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f40516OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Uri f40517OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, List<String>> f40518OooO0Oo;

    public o00O0O0(OooO00o oooO00o) {
        oooO00o.getClass();
        this.f40515OooO00o = oooO00o;
        this.f40517OooO0OO = Uri.EMPTY;
        this.f40518OooO0Oo = Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        this.f40517OooO0OO = dataSpec.f14161OooO00o;
        this.f40518OooO0Oo = Collections.emptyMap();
        long jOooO00o = this.f40515OooO00o.OooO00o(dataSpec);
        Uri uriOooOO0O = OooOO0O();
        uriOooOO0O.getClass();
        this.f40517OooO0OO = uriOooOO0O;
        this.f40518OooO0Oo = OooO0o0();
        return jOooO00o;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooO0OO(o00O0OO0 o00o0oo1) {
        o00o0oo1.getClass();
        this.f40515OooO00o.OooO0OO(o00o0oo1);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0o0() {
        return this.f40515OooO00o.OooO0o0();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f40515OooO00o.OooOO0O();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws IOException {
        this.f40515OooO00o.close();
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f40515OooO00o.read(bArr, i, i2);
        if (i3 != -1) {
            this.f40516OooO0O0 += (long) i3;
        }
        return i3;
    }
}
