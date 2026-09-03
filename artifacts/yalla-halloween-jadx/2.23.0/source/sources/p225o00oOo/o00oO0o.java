package p225o00oOo;

import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o00oO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f39789OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f39791OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00O0O0 f39792OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00Ooo f39793OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f39794OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f39795OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f39796OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f39797OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f39799OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f39800OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f39801OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0O f39790OooO00o = new o00O0O();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO00o f39798OooOO0 = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOo f39802OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o000oOoO.OooO00o f39803OooO0O0;
    }

    public static final class OooO0O0 implements o00Ooo {
        @Override // p225o00oOo.o00Ooo
        public final o00OO0OO OooO00o() {
            return new o00OO0OO.OooO0O0(-9223372036854775807L);
        }

        @Override // p225o00oOo.o00Ooo
        public final long OooO0O0(o00O00o0 o00o00o1) {
            return -1L;
        }

        @Override // p225o00oOo.o00Ooo
        public final void OooO0OO(long j) {
        }
    }

    public void OooO00o(long j) {
        this.f39796OooO0oO = j;
    }

    public abstract long OooO0O0(o00Oo00 o00oo00);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean OooO0OO(o00Oo00 o00oo00, long j, OooO00o oooO00o) throws IOException;

    public void OooO0Oo(boolean z) {
        if (z) {
            this.f39798OooOO0 = new OooO00o();
            this.f39794OooO0o = 0L;
            this.f39797OooO0oo = 0;
        } else {
            this.f39797OooO0oo = 1;
        }
        this.f39795OooO0o0 = -1L;
        this.f39796OooO0oO = 0L;
    }
}
