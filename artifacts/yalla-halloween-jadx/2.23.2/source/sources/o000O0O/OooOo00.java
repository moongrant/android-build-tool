package o000O0O;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSink;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooOo00 implements androidx.media3.datasource.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o f34185OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f34186OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f34187OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f34188OooO0Oo;

    public OooOo00(androidx.media3.datasource.OooO00o oooO00o, CacheDataSink cacheDataSink) {
        this.f34185OooO00o = oooO00o;
        cacheDataSink.getClass();
        this.f34186OooO0O0 = cacheDataSink;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        DataSpec dataSpec2 = dataSpec;
        long jOooO00o = this.f34185OooO00o.OooO00o(dataSpec2);
        this.f34188OooO0Oo = jOooO00o;
        if (jOooO00o == 0) {
            return 0L;
        }
        long j = dataSpec2.f6976OooO0oO;
        if (j == -1 && jOooO00o != -1) {
            dataSpec2 = j == jOooO00o ? dataSpec2 : new DataSpec(dataSpec2.f6970OooO00o, dataSpec2.f6971OooO0O0, dataSpec2.f6972OooO0OO, dataSpec2.f6973OooO0Oo, dataSpec2.f6975OooO0o0, dataSpec2.f6974OooO0o + 0, jOooO00o, dataSpec2.f6977OooO0oo, dataSpec2.f6969OooO, dataSpec2.f6978OooOO0);
        }
        this.f34187OooO0OO = true;
        this.f34186OooO0O0.OooO00o(dataSpec2);
        return this.f34188OooO0Oo;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final Map<String, List<String>> OooO0Oo() {
        return this.f34185OooO00o.OooO0Oo();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void OooO0oO(OooOo oooOo) {
        oooOo.getClass();
        this.f34185OooO00o.OooO0oO(oooOo);
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f34185OooO00o.OooOO0O();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() throws IOException {
        OooO0OO oooO0OO = this.f34186OooO0O0;
        try {
            this.f34185OooO00o.close();
        } finally {
            if (this.f34187OooO0OO) {
                this.f34187OooO0OO = false;
                oooO0OO.close();
            }
        }
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f34188OooO0Oo == 0) {
            return -1;
        }
        int i3 = this.f34185OooO00o.read(bArr, i, i2);
        if (i3 > 0) {
            this.f34186OooO0O0.OooO0O0(bArr, i, i3);
            long j = this.f34188OooO0Oo;
            if (j != -1) {
                this.f34188OooO0Oo = j - ((long) i3);
            }
        }
        return i3;
    }
}
