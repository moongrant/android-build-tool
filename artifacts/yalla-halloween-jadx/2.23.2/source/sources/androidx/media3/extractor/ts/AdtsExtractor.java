package androidx.media3.extractor.ts;

import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o000OOoO.o000000;
import o000OOoO.o000OOo;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class AdtsExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O000 f8867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000OOoO.Oooo0 f8868OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000 f8869OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f8870OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f8872OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f8873OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f8874OooOO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8864OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f8865OooO0O0 = new OooO(true, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f8866OooO0OO = new o000O000(2048);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f8863OooO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f8871OooO0oo = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        o000O000 o000o001 = new o000O000(10);
        this.f8867OooO0Oo = o000o001;
        byte[] bArr = o000o001.f34962OooO00o;
        this.f8869OooO0o0 = new o000(bArr, bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(o000OOoO.Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        int i;
        boolean z;
        p080o000OoO.o00Oo0.OooO0o(this.f8868OooO0o);
        o000OOoO.OooOO0O oooOO0O = (o000OOoO.OooOO0O) oooo000;
        long j = oooOO0O.f34677OooO0OO;
        int i2 = this.f8864OooO00o;
        int i3 = i2 & 2;
        int i4 = 0;
        boolean z2 = true;
        if ((i3 == 0 && ((i2 & 1) == 0 || j == -1)) ? false : true) {
            o000 o000Var = this.f8869OooO0o0;
            o000O000 o000o001 = this.f8867OooO0Oo;
            if (this.f8872OooOO0) {
                i = -1;
            } else {
                this.f8863OooO = -1;
                oooOO0O.f34679OooO0o = 0;
                long j2 = 0;
                if (oooOO0O.f34678OooO0Oo == 0) {
                    OooO0Oo(oooOO0O);
                }
                int i5 = 0;
                while (true) {
                    try {
                        o000OOoO.OooOO0O oooOO0O2 = (o000OOoO.OooOO0O) oooo000;
                        if (!oooOO0O2.OooO0OO(o000o001.f34962OooO00o, i4, 2, z2)) {
                            break;
                        }
                        o000o001.Oooo00O(i4);
                        if (((o000o001.OooOoOO() & 65526) == 65520 ? z2 : i4) == 0) {
                            i5 = i4;
                            break;
                        }
                        if (!oooOO0O2.OooO0OO(o000o001.f34962OooO00o, i4, 4, z2)) {
                            break;
                        }
                        o000Var.OooOO0O(14);
                        int iOooO0oO = o000Var.OooO0oO(13);
                        if (iOooO0oO <= 6) {
                            this.f8872OooOO0 = z2;
                            throw ParserException.OooO00o("Malformed ADTS stream", null);
                        }
                        j2 += (long) iOooO0oO;
                        i5++;
                        if (i5 == 1000 || !oooOO0O2.OooOO0o(iOooO0oO - 6, true)) {
                            break;
                            break;
                        }
                        z2 = true;
                        i4 = 0;
                    } catch (EOFException unused) {
                    }
                }
                oooOO0O.f34679OooO0o = 0;
                if (i5 > 0) {
                    this.f8863OooO = (int) (j2 / ((long) i5));
                    i = -1;
                } else {
                    i = -1;
                    this.f8863OooO = -1;
                }
                this.f8872OooOO0 = true;
            }
        } else {
            i = -1;
        }
        o000O000 o000o002 = this.f8866OooO0OO;
        int i6 = oooOO0O.read(o000o002.f34962OooO00o, 0, 2048);
        boolean z3 = i6 == i;
        boolean z4 = this.f8874OooOO0o;
        OooO oooO = this.f8865OooO0O0;
        if (z4) {
            z = true;
        } else {
            boolean z5 = (i2 & 1) != 0 && this.f8863OooO > 0;
            if (z5 && oooO.f8895OooOOo0 == -9223372036854775807L && !z3) {
                z = true;
            } else {
                if (z5) {
                    long j3 = oooO.f8895OooOOo0;
                    if (j3 != -9223372036854775807L) {
                        o000OOoO.Oooo0 oooo0 = this.f8868OooO0o;
                        boolean z6 = i3 != 0;
                        int i7 = this.f8863OooO;
                        oooo0.OooO(new o000OOoO.OooOO0((int) (((((long) i7) * 8) * AnimationKt.MillisToNanos) / j3), i7, j, this.f8871OooO0oo, z6));
                    } else {
                        this.f8868OooO0o.OooO(new o000000.OooO0O0(-9223372036854775807L));
                    }
                } else {
                    this.f8868OooO0o.OooO(new o000000.OooO0O0(-9223372036854775807L));
                }
                z = true;
                this.f8874OooOO0o = true;
            }
        }
        if (z3) {
            return -1;
        }
        o000o002.Oooo00O(0);
        o000o002.Oooo000(i6);
        if (!this.f8873OooOO0O) {
            oooO.OooO0o0(4, this.f8870OooO0oO);
            this.f8873OooOO0O = z;
        }
        oooO.OooO0OO(o000o002);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f8873OooOO0O = false;
        this.f8865OooO0O0.OooO0O0();
        this.f8870OooO0oO = j2;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(o000OOoO.Oooo0 oooo0) {
        this.f8868OooO0o = oooo0;
        this.f8865OooO0O0.OooO0o(oooo0, new TsPayloadReader.OooO0o(0, 1));
        oooo0.OooOO0O();
    }

    public final int OooO0Oo(o000OOoO.OooOO0O oooOO0O) throws IOException {
        int i = 0;
        while (true) {
            o000O000 o000o001 = this.f8867OooO0Oo;
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 10, false);
            o000o001.Oooo00O(0);
            if (o000o001.OooOo() != 4801587) {
                break;
            }
            o000o001.Oooo00o(3);
            int iOooOo0 = o000o001.OooOo0();
            i += iOooOo0 + 10;
            oooOO0O.OooOO0o(iOooOo0, false);
        }
        oooOO0O.f34679OooO0o = 0;
        oooOO0O.OooOO0o(i, false);
        if (this.f8871OooO0oo == -1) {
            this.f8871OooO0oo = i;
        }
        return i;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(o000OOoO.Oooo000 oooo000) throws IOException {
        o000OOoO.OooOO0O oooOO0O = (o000OOoO.OooOO0O) oooo000;
        int iOooO0Oo = OooO0Oo(oooOO0O);
        int i = iOooO0Oo;
        int i2 = 0;
        int i3 = 0;
        do {
            o000O000 o000o001 = this.f8867OooO0Oo;
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 2, false);
            o000o001.Oooo00O(0);
            if ((o000o001.OooOoOO() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 4, false);
                o000 o000Var = this.f8869OooO0o0;
                o000Var.OooOO0O(14);
                int iOooO0oO = o000Var.OooO0oO(13);
                if (iOooO0oO <= 6) {
                    i++;
                    oooOO0O.f34679OooO0o = 0;
                    oooOO0O.OooOO0o(i, false);
                } else {
                    oooOO0O.OooOO0o(iOooO0oO - 6, false);
                    i3 += iOooO0oO;
                }
            } else {
                i++;
                oooOO0O.f34679OooO0o = 0;
                oooOO0O.OooOO0o(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iOooO0Oo < 8192);
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
