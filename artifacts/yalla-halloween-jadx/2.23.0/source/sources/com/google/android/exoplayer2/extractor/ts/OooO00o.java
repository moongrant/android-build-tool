package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.Extractor;
import java.io.IOException;
import kotlin.UByte;
import p205o00o0oO0.o00000;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f12132OooO00o = new OooO0O0(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f12133OooO0O0 = new o00Oo00(2786);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f12134OooO0OO;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f12134OooO0OO = false;
        this.f12132OooO00o.OooO0OO();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        o00O00o0 o00o00o1;
        int iOooO00o;
        o00Oo00 o00oo00 = new o00Oo00(10);
        int i = 0;
        while (true) {
            o00o00o1 = (o00O00o0) o00o0o01;
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
        int i2 = 0;
        int i3 = i;
        while (true) {
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 6, false);
            o00oo00.Oooo00O(0);
            if (o00oo00.OooOoOO() != 2935) {
                o00o00o1.f39533OooO0o = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                o00o00o1.OooOO0o(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = o00oo00.f40591OooO00o;
                if (bArr.length < 6) {
                    iOooO00o = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        iOooO00o = ((((bArr[2] & 7) << 8) | (bArr[3] & UByte.MAX_VALUE)) + 1) * 2;
                    } else {
                        byte b = bArr[4];
                        iOooO00o = o00000.OooO00o((b & 192) >> 6, b & 63);
                    }
                }
                if (iOooO00o == -1) {
                    return false;
                }
                o00o00o1.OooOO0o(iOooO00o - 6, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        o00Oo00 o00oo00 = this.f12133OooO0O0;
        int i = ((o00O00o0) o00o0o01).read(o00oo00.f40591OooO00o, 0, 2786);
        if (i == -1) {
            return -1;
        }
        o00oo00.Oooo00O(0);
        o00oo00.Oooo000(i);
        boolean z = this.f12134OooO0OO;
        OooO0O0 oooO0O0 = this.f12132OooO00o;
        if (!z) {
            oooO0O0.OooO0o(4, 0L);
            this.f12134OooO0OO = true;
        }
        oooO0O0.OooO0O0(o00oo00);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f12132OooO00o.OooO0Oo(o00o0o0, new TsPayloadReader.OooO0o(0, 1));
        o00o0o0.OooO00o();
        o00o0o0.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
