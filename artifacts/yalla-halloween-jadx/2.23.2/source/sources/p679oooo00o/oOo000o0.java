package p679oooo00o;

import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.Arrays;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000000;
import o000OOoO.o00000O0;
import o000OOoO.o000OOo;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class oOo000o0 implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Oooo0 f60453OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oO0O00O f60454OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f60455OooO0OO;

    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        OooOO0O oooOO0O;
        o000O000 o000o001;
        boolean z;
        byte[] bArr;
        o00Oo0.OooO0o(this.f60453OooO00o);
        if (this.f60454OooO0O0 == null) {
            OooOO0O oooOO0O2 = (OooOO0O) oooo000;
            if (!OooO0Oo(oooOO0O2)) {
                throw ParserException.OooO00o("Failed to determine bitstream type", null);
            }
            oooOO0O2.f34679OooO0o = 0;
        }
        if (!this.f60455OooO0OO) {
            TrackOutput trackOutputOooOOOO = this.f60453OooO00o.OooOOOO(0, 1);
            this.f60453OooO00o.OooOO0O();
            oO0O00O oo0o00o = this.f60454OooO0O0;
            oo0o00o.f60412OooO0OO = this.f60453OooO00o;
            oo0o00o.f60411OooO0O0 = trackOutputOooOOOO;
            oo0o00o.OooO0Oo(true);
            this.f60455OooO0OO = true;
        }
        oO0O00O oo0o00o2 = this.f60454OooO0O0;
        o00Oo0.OooO0o(oo0o00o2.f60411OooO0O0);
        int i = o00.f34910OooO00o;
        int i2 = oo0o00o2.f60417OooO0oo;
        oO0 oo0 = oo0o00o2.f60410OooO00o;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    OooOO0O oooOO0O3 = (OooOO0O) oooo000;
                    long jOooO0OO = oo0o00o2.f60413OooO0Oo.OooO0OO(oooOO0O3);
                    if (jOooO0OO >= 0) {
                        o000ooo2.f34713OooO00o = jOooO0OO;
                        return 1;
                    }
                    if (jOooO0OO < -1) {
                        oo0o00o2.OooO00o(-(jOooO0OO + 2));
                    }
                    if (!oo0o00o2.f60420OooOO0o) {
                        o000000 o000000VarOooO00o = oo0o00o2.f60413OooO0Oo.OooO00o();
                        o00Oo0.OooO0o(o000000VarOooO00o);
                        oo0o00o2.f60412OooO0OO.OooO(o000000VarOooO00o);
                        oo0o00o2.f60420OooOO0o = true;
                    }
                    if (oo0o00o2.f60419OooOO0O > 0 || oo0.OooO00o(oooOO0O3)) {
                        oo0o00o2.f60419OooOO0O = 0L;
                        o000O000 o000o002 = oo0.f60395OooO0O0;
                        long jOooO0O0 = oo0o00o2.OooO0O0(o000o002);
                        if (jOooO0O0 >= 0) {
                            long j = oo0o00o2.f60416OooO0oO;
                            if (j + jOooO0O0 >= oo0o00o2.f60415OooO0o0) {
                                long j2 = (j * AnimationKt.MillisToNanos) / ((long) oo0o00o2.f60409OooO);
                                oo0o00o2.f60411OooO0O0.OooO0OO(o000o002.f34964OooO0OO, o000o002);
                                oo0o00o2.f60411OooO0O0.OooO0o0(j2, 1, o000o002.f34964OooO0OO, 0, null);
                                oo0o00o2.f60415OooO0o0 = -1L;
                            }
                        }
                        oo0o00o2.f60416OooO0oO += jOooO0O0;
                    } else {
                        oo0o00o2.f60417OooO0oo = 3;
                    }
                } else if (i2 != 3) {
                    throw new IllegalStateException();
                }
                return -1;
            }
            ((OooOO0O) oooo000).OooOO0((int) oo0o00o2.f60414OooO0o);
            oo0o00o2.f60417OooO0oo = 2;
            return 0;
        }
        while (true) {
            oooOO0O = (OooOO0O) oooo000;
            boolean zOooO00o = oo0.OooO00o(oooOO0O);
            o000o001 = oo0.f60395OooO0O0;
            if (!zOooO00o) {
                oo0o00o2.f60417OooO0oo = 3;
                z = false;
                break;
            }
            long j3 = oooOO0O.f34678OooO0Oo;
            long j4 = oo0o00o2.f60414OooO0o;
            oo0o00o2.f60419OooOO0O = j3 - j4;
            if (!oo0o00o2.OooO0OO(o000o001, j4, oo0o00o2.f60418OooOO0)) {
                z = true;
                break;
            }
            oo0o00o2.f60414OooO0o = oooOO0O.f34678OooO0Oo;
        }
        if (z) {
            OooOO0 oooOO1 = oo0o00o2.f60418OooOO0.f60422OooO00o;
            oo0o00o2.f60409OooO = oooOO1.f6425OooOoo;
            if (!oo0o00o2.f60421OooOOO0) {
                oo0o00o2.f60411OooO0O0.OooO0O0(oooOO1);
                oo0o00o2.f60421OooOOO0 = true;
            }
            oOo0000O.OooO00o oooO00o = oo0o00o2.f60418OooOO0.f60423OooO0O0;
            if (oooO00o == null) {
                long j5 = oooOO0O.f34677OooO0OO;
                if (j5 == -1) {
                    oo0o00o2.f60413OooO0Oo = new oO0O00O.OooO0O0();
                } else {
                    oO0O000 oo0o000 = oo0.f60394OooO00o;
                    oo0o00o2.f60413OooO0Oo = new oOo000Oo(oo0o00o2, oo0o00o2.f60414OooO0o, j5, oo0o000.f60405OooO0Oo + oo0o000.f60407OooO0o0, oo0o000.f60403OooO0O0, (oo0o000.f60402OooO00o & 4) != 0);
                }
                oo0o00o2.f60417OooO0oo = 2;
                bArr = o000o001.f34962OooO00o;
                if (bArr.length != 65025) {
                    o000o001.OooOooo(o000o001.f34964OooO0OO, Arrays.copyOf(bArr, Math.max(65025, o000o001.f34964OooO0OO)));
                }
                return 0;
            }
            oo0o00o2.f60413OooO0Oo = oooO00o;
            oo0o00o2.f60417OooO0oo = 2;
            bArr = o000o001.f34962OooO00o;
            if (bArr.length != 65025) {
                o000o001.OooOooo(o000o001.f34964OooO0OO, Arrays.copyOf(bArr, Math.max(65025, o000o001.f34964OooO0OO)));
            }
            return 0;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        oO0O00O oo0o00o = this.f60454OooO0O0;
        if (oo0o00o != null) {
            oO0 oo0 = oo0o00o.f60410OooO00o;
            oO0O000 oo0o000 = oo0.f60394OooO00o;
            oo0o000.f60402OooO00o = 0;
            oo0o000.f60403OooO0O0 = 0L;
            oo0o000.f60404OooO0OO = 0;
            oo0o000.f60405OooO0Oo = 0;
            oo0o000.f60407OooO0o0 = 0;
            oo0.f60395OooO0O0.OooOooO(0);
            oo0.f60396OooO0OO = -1;
            oo0.f60398OooO0o0 = false;
            if (j == 0) {
                oo0o00o.OooO0Oo(!oo0o00o.f60420OooOO0o);
                return;
            }
            if (oo0o00o.f60417OooO0oo != 0) {
                long j3 = (((long) oo0o00o.f60409OooO) * j2) / AnimationKt.MillisToNanos;
                oo0o00o.f60415OooO0o0 = j3;
                oO0O000o oo0o000o = oo0o00o.f60413OooO0Oo;
                int i = o00.f34910OooO00o;
                oo0o000o.OooO0O0(j3);
                oo0o00o.f60417OooO0oo = 2;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f60453OooO00o = oooo0;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean OooO0Oo(OooOO0O oooOO0O) throws IOException {
        boolean zOooO0OO;
        oO0O000 oo0o000 = new oO0O000();
        if (oo0o000.OooO00o(oooOO0O, true) && (oo0o000.f60402OooO00o & 2) == 2) {
            int iMin = Math.min(oo0o000.f60407OooO0o0, 8);
            o000O000 o000o001 = new o000O000(iMin);
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, iMin, false);
            o000o001.Oooo00O(0);
            if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 >= 5 && o000o001.OooOo0O() == 127 && o000o001.OooOo0o() == 1179402563) {
                this.f60454OooO0O0 = new oOo0000O();
            } else {
                o000o001.Oooo00O(0);
                try {
                    zOooO0OO = o00000O0.OooO0OO(1, o000o001, true);
                } catch (ParserException unused) {
                    zOooO0OO = false;
                }
                if (zOooO0OO) {
                    this.f60454OooO0O0 = new oO0O00o0();
                } else {
                    o000o001.Oooo00O(0);
                    if (oO0O00.OooO0o0(o000o001, oO0O00.f60399OooOOOO)) {
                        this.f60454OooO0O0 = new oO0O00();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        try {
            return OooO0Oo((OooOO0O) oooo000);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
