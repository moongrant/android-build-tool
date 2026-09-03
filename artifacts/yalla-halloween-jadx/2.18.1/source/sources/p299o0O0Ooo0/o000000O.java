package p299o0O0Ooo0;

import com.google.android.exoplayer2.extractor.mkv.EbmlProcessor;
import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;
import p296o0O0OoO0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f35981OooO00o = new byte[8];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f35982OooO0O0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000OO f35983OooO0OO = new o00000OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public EbmlProcessor f35984OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f35985OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f35986OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f35987OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35988OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f35989OooO0O0;

        public OooO00o(int i, long j) {
            this.f35988OooO00o = i;
            this.f35989OooO0O0 = j;
        }
    }

    public final long OooO00o(o000oOoO o000oooo2, int i) throws IOException {
        o000oooo2.readFully(this.f35981OooO00o, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f35981OooO00o[i2] & UByte.MAX_VALUE));
        }
        return j;
    }
}
