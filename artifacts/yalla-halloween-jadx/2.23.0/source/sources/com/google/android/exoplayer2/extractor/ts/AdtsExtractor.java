package com.google.android.exoplayer2.extractor.ts;

import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p209o00o0oo0.o00O00OO;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AdtsExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo00 f12100OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00O0O0 f12101OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOOOo f12102OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f12103OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f12105OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f12106OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f12107OooOO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f12097OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f12098OooO0O0 = new OooO(true, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f12099OooO0OO = new o00Oo00(2048);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f12096OooO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f12104OooO0oo = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        o00Oo00 o00oo00 = new o00Oo00(10);
        this.f12100OooO0Oo = o00oo00;
        byte[] bArr = o00oo00.f40591OooO00o;
        this.f12102OooO0o0 = new o00OOOOo(bArr, bArr.length);
    }

    public final int OooO00o(o00O00o0 o00o00o1) throws IOException {
        int i = 0;
        while (true) {
            o00Oo00 o00oo00 = this.f12100OooO0Oo;
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 10, false);
            o00oo00.Oooo00O(0);
            if (o00oo00.OooOo() != 4801587) {
                break;
            }
            o00oo00.Oooo00o(3);
            int iOooOo0 = o00oo00.OooOo0();
            i += iOooOo0 + 10;
            o00o00o1.OooOO0o(iOooOo0, false);
        }
        o00o00o1.f39533OooO0o = 0;
        o00o00o1.OooOO0o(i, false);
        if (this.f12104OooO0oo == -1) {
            this.f12104OooO0oo = i;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f12106OooOO0O = false;
        this.f12098OooO0O0.OooO0OO();
        this.f12103OooO0oO = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        int iOooO00o = OooO00o(o00o00o1);
        int i = iOooO00o;
        int i2 = 0;
        int i3 = 0;
        do {
            o00Oo00 o00oo00 = this.f12100OooO0Oo;
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 2, false);
            o00oo00.Oooo00O(0);
            if ((o00oo00.OooOoOO() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 4, false);
                o00OOOOo o00ooooo2 = this.f12102OooO0o0;
                o00ooooo2.OooOO0O(14);
                int iOooO0oO = o00ooooo2.OooO0oO(13);
                if (iOooO0oO <= 6) {
                    i++;
                    o00o00o1.f39533OooO0o = 0;
                    o00o00o1.OooOO0o(i, false);
                } else {
                    o00o00o1.OooOO0o(iOooO0oO - 6, false);
                    i3 += iOooO0oO;
                }
            } else {
                i++;
                o00o00o1.f39533OooO0o = 0;
                o00o00o1.OooOO0o(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iOooO00o < 8192);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        int i;
        boolean z;
        o00O000o.OooO0o0(this.f12101OooO0o);
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        long j = o00o00o1.f39531OooO0OO;
        int i2 = this.f12097OooO00o;
        int i3 = i2 & 2;
        int i4 = 0;
        boolean z2 = true;
        if ((i3 == 0 && ((i2 & 1) == 0 || j == -1)) ? false : true) {
            o00OOOOo o00ooooo2 = this.f12102OooO0o0;
            o00Oo00 o00oo00 = this.f12100OooO0Oo;
            if (this.f12105OooOO0) {
                i = -1;
            } else {
                this.f12096OooO = -1;
                o00o00o1.f39533OooO0o = 0;
                long j2 = 0;
                if (o00o00o1.f39532OooO0Oo == 0) {
                    OooO00o(o00o00o1);
                }
                int i5 = 0;
                while (true) {
                    try {
                        o00O00o0 o00o00o2 = (o00O00o0) o00o0o01;
                        if (!o00o00o2.OooO0Oo(o00oo00.f40591OooO00o, i4, 2, z2)) {
                            break;
                        }
                        o00oo00.Oooo00O(i4);
                        if (((o00oo00.OooOoOO() & 65526) == 65520 ? z2 : i4) == 0) {
                            i5 = i4;
                            break;
                        }
                        if (!o00o00o2.OooO0Oo(o00oo00.f40591OooO00o, i4, 4, z2)) {
                            break;
                        }
                        o00ooooo2.OooOO0O(14);
                        int iOooO0oO = o00ooooo2.OooO0oO(13);
                        if (iOooO0oO <= 6) {
                            this.f12105OooOO0 = z2;
                            throw ParserException.OooO00o("Malformed ADTS stream", null);
                        }
                        j2 += (long) iOooO0oO;
                        i5++;
                        if (i5 == 1000 || !o00o00o2.OooOO0o(iOooO0oO - 6, true)) {
                            break;
                            break;
                        }
                        z2 = true;
                        i4 = 0;
                    } catch (EOFException unused) {
                    }
                }
                o00o00o1.f39533OooO0o = 0;
                if (i5 > 0) {
                    this.f12096OooO = (int) (j2 / ((long) i5));
                    i = -1;
                } else {
                    i = -1;
                    this.f12096OooO = -1;
                }
                this.f12105OooOO0 = true;
            }
        } else {
            i = -1;
        }
        o00Oo00 o00oo01 = this.f12099OooO0OO;
        int i6 = o00o00o1.read(o00oo01.f40591OooO00o, 0, 2048);
        boolean z3 = i6 == i;
        boolean z4 = this.f12107OooOO0o;
        OooO oooO = this.f12098OooO0O0;
        if (z4) {
            z = true;
        } else {
            boolean z5 = (i2 & 1) != 0 && this.f12096OooO > 0;
            if (z5 && oooO.f12128OooOOo0 == -9223372036854775807L && !z3) {
                z = true;
            } else {
                if (z5) {
                    long j3 = oooO.f12128OooOOo0;
                    if (j3 != -9223372036854775807L) {
                        o00O0O0 o00o0o0 = this.f12101OooO0o;
                        boolean z6 = i3 != 0;
                        int i7 = this.f12096OooO;
                        o00o0o0.OooO0O0(new o00O00OO((int) (((((long) i7) * 8) * AnimationKt.MillisToNanos) / j3), i7, j, this.f12104OooO0oo, z6));
                    } else {
                        this.f12101OooO0o.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
                    }
                } else {
                    this.f12101OooO0o.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
                }
                z = true;
                this.f12107OooOO0o = true;
            }
        }
        if (z3) {
            return -1;
        }
        o00oo01.Oooo00O(0);
        o00oo01.Oooo000(i6);
        if (!this.f12106OooOO0O) {
            oooO.OooO0o(4, this.f12103OooO0oO);
            this.f12106OooOO0O = z;
        }
        oooO.OooO0O0(o00oo01);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f12101OooO0o = o00o0o0;
        this.f12098OooO0O0.OooO0Oo(o00o0o0, new TsPayloadReader.OooO0o(0, 1));
        o00o0o0.OooO00o();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
