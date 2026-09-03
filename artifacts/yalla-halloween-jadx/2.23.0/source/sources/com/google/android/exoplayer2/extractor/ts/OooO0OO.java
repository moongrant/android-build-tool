package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.Extractor;
import java.io.IOException;
import kotlin.UByte;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0OO implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f12147OooO00o = new OooO0o(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f12148OooO0O0 = new o00Oo00(16384);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f12149OooO0OO;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f12149OooO0OO = false;
        this.f12147OooO00o.OooO0OO();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        o00O00o0 o00o00o1;
        int i;
        o00Oo00 o00oo00 = new o00Oo00(10);
        int i2 = 0;
        while (true) {
            o00o00o1 = (o00O00o0) o00o0o01;
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 10, false);
            o00oo00.Oooo00O(0);
            if (o00oo00.OooOo() != 4801587) {
                break;
            }
            o00oo00.Oooo00o(3);
            int iOooOo0 = o00oo00.OooOo0();
            i2 += iOooOo0 + 10;
            o00o00o1.OooOO0o(iOooOo0, false);
        }
        o00o00o1.f39533OooO0o = 0;
        o00o00o1.OooOO0o(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 7, false);
            o00oo00.Oooo00O(0);
            int iOooOoOO = o00oo00.OooOoOO();
            if (iOooOoOO == 44096 || iOooOoOO == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = o00oo00.f40591OooO00o;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & UByte.MAX_VALUE) << 16) | ((bArr[5] & UByte.MAX_VALUE) << 8) | (bArr[6] & UByte.MAX_VALUE);
                    } else {
                        i5 = 4;
                    }
                    if (iOooOoOO == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                o00o00o1.OooOO0o(i - 7, false);
            } else {
                o00o00o1.f39533OooO0o = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                o00o00o1.OooOO0o(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        o00Oo00 o00oo00 = this.f12148OooO0O0;
        int i = ((o00O00o0) o00o0o01).read(o00oo00.f40591OooO00o, 0, 16384);
        if (i == -1) {
            return -1;
        }
        o00oo00.Oooo00O(0);
        o00oo00.Oooo000(i);
        boolean z = this.f12149OooO0OO;
        OooO0o oooO0o = this.f12147OooO00o;
        if (!z) {
            oooO0o.OooO0o(4, 0L);
            this.f12149OooO0OO = true;
        }
        oooO0o.OooO0O0(o00oo00);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f12147OooO00o.OooO0Oo(o00o0o0, new TsPayloadReader.OooO0o(0, 1));
        o00o0o0.OooO00o();
        o00o0o0.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
