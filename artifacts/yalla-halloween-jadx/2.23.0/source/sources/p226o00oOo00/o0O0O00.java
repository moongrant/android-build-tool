package p226o00oOo00;

import com.google.android.exoplayer2.source.o00Oo0;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O0O00 implements o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo0[] f39896OooO0Oo;

    public o0O0O00(o00Oo0[] o00oo0Arr) {
        this.f39896OooO0Oo = o00oo0Arr;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooO0o0() {
        long jMin = Long.MAX_VALUE;
        for (o00Oo0 o00oo1 : this.f39896OooO0Oo) {
            long jOooO0o0 = o00oo1.OooO0o0();
            if (jOooO0o0 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jOooO0o0);
            }
        }
        if (jMin == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooO0oo() {
        for (o00Oo0 o00oo1 : this.f39896OooO0Oo) {
            if (o00oo1.OooO0oo()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooOOo0(long j) {
        boolean zOooOOo0;
        boolean z = false;
        do {
            long jOooO0o0 = OooO0o0();
            if (jOooO0o0 == Long.MIN_VALUE) {
                break;
            }
            zOooOOo0 = false;
            for (o00Oo0 o00oo1 : this.f39896OooO0Oo) {
                long jOooO0o1 = o00oo1.OooO0o0();
                boolean z2 = jOooO0o1 != Long.MIN_VALUE && jOooO0o1 <= j;
                if (jOooO0o1 == jOooO0o0 || z2) {
                    zOooOOo0 |= o00oo1.OooOOo0(j);
                }
            }
            z |= zOooOOo0;
        } while (zOooOOo0);
        return z;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooOOoo() {
        long jMin = Long.MAX_VALUE;
        for (o00Oo0 o00oo1 : this.f39896OooO0Oo) {
            long jOooOOoo = o00oo1.OooOOoo();
            if (jOooOOoo != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jOooOOoo);
            }
        }
        if (jMin == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final void OooOo0(long j) {
        for (o00Oo0 o00oo1 : this.f39896OooO0Oo) {
            o00oo1.OooOo0(j);
        }
    }
}
