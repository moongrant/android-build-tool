package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.Extractor;
import java.io.IOException;
import kotlin.UByte;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f14062OooO00o = new OooO0O0(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f14063OooO0O0 = new o000(2786);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f14064OooO0OO;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(p296o0O0OoO0.o0OoOo0 o0oooo1) {
        this.f14062OooO00o.OooO0o0(o0oooo1, new TsPayloadReader.OooO0o(0, 1));
        o0oooo1.OooOOO0();
        o0oooo1.OooOO0O(new oo0o0Oo.OooO0O0(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        this.f14064OooO0OO = false;
        this.f14062OooO00o.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(p296o0O0OoO0.o000oOoO o000oooo2) throws IOException {
        p296o0O0OoO0.Oooo000 oooo000;
        int iOooO00o;
        o000 o000Var = new o000(10);
        int i = 0;
        while (true) {
            oooo000 = (p296o0O0OoO0.Oooo000) o000oooo2;
            oooo000.OooO0OO(o000Var.f36661OooO00o, 0, 10, false);
            o000Var.OooOoOO(0);
            if (o000Var.OooOOoo() != 4801587) {
                break;
            }
            o000Var.OooOoo0(3);
            int iOooOOOo = o000Var.OooOOOo();
            i += iOooOOOo + 10;
            oooo000.OooOOOO(iOooOOOo, false);
        }
        oooo000.f35895OooO0o = 0;
        oooo000.OooOOOO(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                oooo000.OooO0OO(o000Var.f36661OooO00o, 0, 6, false);
                o000Var.OooOoOO(0);
                if (o000Var.OooOo0O() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = o000Var.f36661OooO00o;
                if (bArr.length < 6) {
                    iOooO00o = -1;
                } else {
                    iOooO00o = ((bArr[5] & 248) >> 3) > 10 ? ((((bArr[2] & 7) << 8) | (bArr[3] & UByte.MAX_VALUE)) + 1) * 2 : p293o0O0Oo0O.OooOO0.OooO00o((bArr[4] & 192) >> 6, bArr[4] & 63);
                }
                if (iOooO00o == -1) {
                    return false;
                }
                oooo000.OooOOOO(iOooO00o - 6, false);
            }
            oooo000.f35895OooO0o = 0;
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            oooo000.OooOOOO(i2, false);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(p296o0O0OoO0.o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        int i = o000oooo2.read(this.f14063OooO0O0.f36661OooO00o, 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f14063OooO0O0.OooOoOO(0);
        this.f14063OooO0O0.OooOoO(i);
        if (!this.f14064OooO0OO) {
            this.f14062OooO00o.f14076OooOO0o = 0L;
            this.f14064OooO0OO = true;
        }
        this.f14062OooO00o.OooO00o(this.f14063OooO0O0);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
