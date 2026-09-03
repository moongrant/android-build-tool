package p244o00oo0Oo;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.OooO00o;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O0O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f40531OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0ooO f40532OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f40533OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f40534OooO0Oo;

    public o00O0O0O(OooO00o oooO00o, CacheDataSink cacheDataSink) {
        this.f40531OooO00o = oooO00o;
        cacheDataSink.getClass();
        this.f40532OooO0O0 = cacheDataSink;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        long jOooO00o = this.f40531OooO00o.OooO00o(dataSpec);
        this.f40534OooO0Oo = jOooO00o;
        if (jOooO00o == 0) {
            return 0L;
        }
        if (dataSpec.f14167OooO0oO == -1 && jOooO00o != -1) {
            dataSpec = dataSpec.OooO00o(0L, jOooO00o);
        }
        this.f40533OooO0OO = true;
        this.f40532OooO0O0.OooO00o(dataSpec);
        return this.f40534OooO0Oo;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooO0OO(o00O0OO0 o00o0oo1) {
        o00o0oo1.getClass();
        this.f40531OooO00o.OooO0OO(o00o0oo1);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0o0() {
        return this.f40531OooO00o.OooO0o0();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f40531OooO00o.OooOO0O();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws IOException {
        o0O0ooO o0o0ooo = this.f40532OooO0O0;
        try {
            this.f40531OooO00o.close();
        } finally {
            if (this.f40533OooO0OO) {
                this.f40533OooO0OO = false;
                o0o0ooo.close();
            }
        }
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f40534OooO0Oo == 0) {
            return -1;
        }
        int i3 = this.f40531OooO00o.read(bArr, i, i2);
        if (i3 > 0) {
            this.f40532OooO0O0.OooO0O0(bArr, i, i3);
            long j = this.f40534OooO0Oo;
            if (j != -1) {
                this.f40534OooO0Oo = j - ((long) i3);
            }
        }
        return i3;
    }
}
