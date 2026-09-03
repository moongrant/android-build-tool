package p225o00oOo;

import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.o00OOO00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OoOo0 implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O0O0 f39804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00oO0o f39805OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f39806OooO0OO;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean OooO00o(o00O00o0 o00o00o1) throws IOException {
        boolean zOooO0OO;
        o00Oo0 o00oo1 = new o00Oo0();
        if (o00oo1.OooO00o(o00o00o1, true) && (o00oo1.f39782OooO00o & 2) == 2) {
            int iMin = Math.min(o00oo1.f39787OooO0o0, 8);
            o00Oo00 o00oo00 = new o00Oo00(iMin);
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, iMin, false);
            o00oo00.Oooo00O(0);
            if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 >= 5 && o00oo00.OooOo0O() == 127 && o00oo00.OooOo0o() == 1179402563) {
                this.f39805OooO0O0 = new o000oOoO();
            } else {
                o00oo00.Oooo00O(0);
                try {
                    zOooO0OO = o00OOO00.OooO0OO(1, o00oo00, true);
                } catch (ParserException unused) {
                    zOooO0OO = false;
                }
                if (zOooO0OO) {
                    this.f39805OooO0O0 = new o0ooOOo();
                } else {
                    o00oo00.Oooo00O(0);
                    if (oo000o.OooO0o0(o00oo00, oo000o.f39817OooOOOO)) {
                        this.f39805OooO0O0 = new oo000o();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        o00oO0o o00oo0o2 = this.f39805OooO0O0;
        if (o00oo0o2 != null) {
            o00O0O o00o0o2 = o00oo0o2.f39790OooO00o;
            o00Oo0 o00oo1 = o00o0o2.f39777OooO00o;
            o00oo1.f39782OooO00o = 0;
            o00oo1.f39783OooO0O0 = 0L;
            o00oo1.f39784OooO0OO = 0;
            o00oo1.f39785OooO0Oo = 0;
            o00oo1.f39787OooO0o0 = 0;
            o00o0o2.f39778OooO0O0.OooOooO(0);
            o00o0o2.f39779OooO0OO = -1;
            o00o0o2.f39781OooO0o0 = false;
            if (j == 0) {
                o00oo0o2.OooO0Oo(!o00oo0o2.f39800OooOO0o);
                return;
            }
            if (o00oo0o2.f39797OooO0oo != 0) {
                long j3 = (((long) o00oo0o2.f39789OooO) * j2) / AnimationKt.MillisToNanos;
                o00oo0o2.f39795OooO0o0 = j3;
                o00Ooo o00ooo2 = o00oo0o2.f39793OooO0Oo;
                int i = o0O00.f40595OooO00o;
                o00ooo2.OooO0OO(j3);
                o00oo0o2.f39797OooO0oo = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        try {
            return OooO00o((o00O00o0) o00o0o01);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        o00O00o0 o00o00o1;
        o00Oo00 o00oo00;
        boolean z;
        byte[] bArr;
        o00O000o.OooO0o0(this.f39804OooO00o);
        if (this.f39805OooO0O0 == null) {
            o00O00o0 o00o00o2 = (o00O00o0) o00o0o01;
            if (!OooO00o(o00o00o2)) {
                throw ParserException.OooO00o("Failed to determine bitstream type", null);
            }
            o00o00o2.f39533OooO0o = 0;
        }
        if (!this.f39806OooO0OO) {
            TrackOutput trackOutputOooOOO = this.f39804OooO00o.OooOOO(0, 1);
            this.f39804OooO00o.OooO00o();
            o00oO0o o00oo0o2 = this.f39805OooO0O0;
            o00oo0o2.f39792OooO0OO = this.f39804OooO00o;
            o00oo0o2.f39791OooO0O0 = trackOutputOooOOO;
            o00oo0o2.OooO0Oo(true);
            this.f39806OooO0OO = true;
        }
        o00oO0o o00oo0o3 = this.f39805OooO0O0;
        o00O000o.OooO0o0(o00oo0o3.f39791OooO0O0);
        int i = o0O00.f40595OooO00o;
        int i2 = o00oo0o3.f39797OooO0oo;
        o00O0O o00o0o2 = o00oo0o3.f39790OooO00o;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    o00O00o0 o00o00o3 = (o00O00o0) o00o0o01;
                    long jOooO0O0 = o00oo0o3.f39793OooO0Oo.OooO0O0(o00o00o3);
                    if (jOooO0O0 >= 0) {
                        o00oo0o1.f39548OooO00o = jOooO0O0;
                        return 1;
                    }
                    if (jOooO0O0 < -1) {
                        o00oo0o3.OooO00o(-(jOooO0O0 + 2));
                    }
                    if (!o00oo0o3.f39800OooOO0o) {
                        o00OO0OO o00oo0ooOooO00o = o00oo0o3.f39793OooO0Oo.OooO00o();
                        o00O000o.OooO0o0(o00oo0ooOooO00o);
                        o00oo0o3.f39792OooO0OO.OooO0O0(o00oo0ooOooO00o);
                        o00oo0o3.f39800OooOO0o = true;
                    }
                    if (o00oo0o3.f39799OooOO0O > 0 || o00o0o2.OooO00o(o00o00o3)) {
                        o00oo0o3.f39799OooOO0O = 0L;
                        o00Oo00 o00oo01 = o00o0o2.f39778OooO0O0;
                        long jOooO0O1 = o00oo0o3.OooO0O0(o00oo01);
                        if (jOooO0O1 >= 0) {
                            long j = o00oo0o3.f39796OooO0oO;
                            if (j + jOooO0O1 >= o00oo0o3.f39795OooO0o0) {
                                long j2 = (j * AnimationKt.MillisToNanos) / ((long) o00oo0o3.f39789OooO);
                                o00oo0o3.f39791OooO0O0.OooO0O0(o00oo01.f40593OooO0OO, o00oo01);
                                o00oo0o3.f39791OooO0O0.OooO0o0(j2, 1, o00oo01.f40593OooO0OO, 0, null);
                                o00oo0o3.f39795OooO0o0 = -1L;
                            }
                        }
                        o00oo0o3.f39796OooO0oO += jOooO0O1;
                    } else {
                        o00oo0o3.f39797OooO0oo = 3;
                    }
                } else if (i2 != 3) {
                    throw new IllegalStateException();
                }
                return -1;
            }
            ((o00O00o0) o00o0o01).OooOO0((int) o00oo0o3.f39794OooO0o);
            o00oo0o3.f39797OooO0oo = 2;
            return 0;
        }
        while (true) {
            o00o00o1 = (o00O00o0) o00o0o01;
            boolean zOooO00o = o00o0o2.OooO00o(o00o00o1);
            o00oo00 = o00o0o2.f39778OooO0O0;
            if (!zOooO00o) {
                o00oo0o3.f39797OooO0oo = 3;
                z = false;
                break;
            }
            long j3 = o00o00o1.f39532OooO0Oo;
            long j4 = o00oo0o3.f39794OooO0o;
            o00oo0o3.f39799OooOO0O = j3 - j4;
            if (!o00oo0o3.OooO0OO(o00oo00, j4, o00oo0o3.f39798OooOO0)) {
                z = true;
                break;
            }
            o00oo0o3.f39794OooO0o = o00o00o1.f39532OooO0Oo;
        }
        if (z) {
            OooOo oooOo = o00oo0o3.f39798OooOO0.f39802OooO00o;
            o00oo0o3.f39789OooO = oooOo.f11224OooOoo;
            if (!o00oo0o3.f39801OooOOO0) {
                o00oo0o3.f39791OooO0O0.OooO0OO(oooOo);
                o00oo0o3.f39801OooOOO0 = true;
            }
            o000oOoO.OooO00o oooO00o = o00oo0o3.f39798OooOO0.f39803OooO0O0;
            if (oooO00o == null) {
                long j5 = o00o00o1.f39531OooO0OO;
                if (j5 == -1) {
                    o00oo0o3.f39793OooO0Oo = new o00oO0o.OooO0O0();
                } else {
                    o00Oo0 o00oo1 = o00o0o2.f39777OooO00o;
                    o00oo0o3.f39793OooO0Oo = new Oooo0(o00oo0o3, o00oo0o3.f39794OooO0o, j5, o00oo1.f39785OooO0Oo + o00oo1.f39787OooO0o0, o00oo1.f39783OooO0O0, (o00oo1.f39782OooO00o & 4) != 0);
                }
                o00oo0o3.f39797OooO0oo = 2;
                bArr = o00oo00.f40591OooO00o;
                if (bArr.length != 65025) {
                    o00oo00.OooOooo(o00oo00.f40593OooO0OO, Arrays.copyOf(bArr, Math.max(65025, o00oo00.f40593OooO0OO)));
                }
                return 0;
            }
            o00oo0o3.f39793OooO0Oo = oooO00o;
            o00oo0o3.f39797OooO0oo = 2;
            bArr = o00oo00.f40591OooO00o;
            if (bArr.length != 65025) {
                o00oo00.OooOooo(o00oo00.f40593OooO0OO, Arrays.copyOf(bArr, Math.max(65025, o00oo00.f40593OooO0OO)));
            }
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f39804OooO00o = o00o0o0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
