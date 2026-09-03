package o000O;

import androidx.media3.common.util.UnstableApi;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0OO implements androidx.media3.exoplayer.source.o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.o00Oo0[] f33834OooO0Oo;

    public OooO0OO(androidx.media3.exoplayer.source.o00Oo0[] o00oo0Arr) {
        this.f33834OooO0Oo = o00oo0Arr;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooO0O0() {
        long jMin = Long.MAX_VALUE;
        for (androidx.media3.exoplayer.source.o00Oo0 o00oo1 : this.f33834OooO0Oo) {
            long jOooO0O0 = o00oo1.OooO0O0();
            if (jOooO0O0 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jOooO0O0);
            }
        }
        if (jMin == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0o0() {
        for (androidx.media3.exoplayer.source.o00Oo0 o00oo1 : this.f33834OooO0Oo) {
            if (o00oo1.OooO0o0()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0oo(long j) {
        boolean zOooO0oo;
        boolean z = false;
        do {
            long jOooO0O0 = OooO0O0();
            if (jOooO0O0 == Long.MIN_VALUE) {
                break;
            }
            zOooO0oo = false;
            for (androidx.media3.exoplayer.source.o00Oo0 o00oo1 : this.f33834OooO0Oo) {
                long jOooO0O1 = o00oo1.OooO0O0();
                boolean z2 = jOooO0O1 != Long.MIN_VALUE && jOooO0O1 <= j;
                if (jOooO0O1 == jOooO0O0 || z2) {
                    zOooO0oo |= o00oo1.OooO0oo(j);
                }
            }
            z |= zOooO0oo;
        } while (zOooO0oo);
        return z;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooOOOo() {
        long jMin = Long.MAX_VALUE;
        for (androidx.media3.exoplayer.source.o00Oo0 o00oo1 : this.f33834OooO0Oo) {
            long jOooOOOo = o00oo1.OooOOOo();
            if (jOooOOOo != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jOooOOOo);
            }
        }
        if (jMin == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final void OooOOo(long j) {
        for (androidx.media3.exoplayer.source.o00Oo0 o00oo1 : this.f33834OooO0Oo) {
            o00oo1.OooOOo(j);
        }
    }
}
