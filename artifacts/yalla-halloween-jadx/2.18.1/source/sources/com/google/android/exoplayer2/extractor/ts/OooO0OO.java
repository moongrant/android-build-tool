package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.Extractor;
import java.io.IOException;
import kotlin.UByte;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f14077OooO00o = new OooO0o(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f14078OooO0O0 = new o000(16384);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f14079OooO0OO;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(p296o0O0OoO0.o0OoOo0 o0oooo1) {
        this.f14077OooO00o.OooO0o0(o0oooo1, new TsPayloadReader.OooO0o(0, 1));
        o0oooo1.OooOOO0();
        o0oooo1.OooOO0O(new oo0o0Oo.OooO0O0(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        this.f14079OooO0OO = false;
        this.f14077OooO00o.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(p296o0O0OoO0.o000oOoO o000oooo2) throws IOException {
        p296o0O0OoO0.Oooo000 oooo000;
        int i;
        o000 o000Var = new o000(10);
        int i2 = 0;
        while (true) {
            oooo000 = (p296o0O0OoO0.Oooo000) o000oooo2;
            oooo000.OooO0OO(o000Var.f36661OooO00o, 0, 10, false);
            o000Var.OooOoOO(0);
            if (o000Var.OooOOoo() != 4801587) {
                break;
            }
            o000Var.OooOoo0(3);
            int iOooOOOo = o000Var.OooOOOo();
            i2 += iOooOOOo + 10;
            oooo000.OooOOOO(iOooOOOo, false);
        }
        oooo000.f35895OooO0o = 0;
        oooo000.OooOOOO(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                oooo000.OooO0OO(o000Var.f36661OooO00o, 0, 7, false);
                o000Var.OooOoOO(0);
                int iOooOo0O = o000Var.OooOo0O();
                if (iOooOo0O == 44096 || iOooOo0O == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArr = o000Var.f36661OooO00o;
                    if (bArr.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
                        if (i6 == 65535) {
                            i6 = ((bArr[4] & UByte.MAX_VALUE) << 16) | ((bArr[5] & UByte.MAX_VALUE) << 8) | (bArr[6] & UByte.MAX_VALUE);
                        } else {
                            i5 = 4;
                        }
                        if (iOooOo0O == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        return false;
                    }
                    oooo000.OooOOOO(i - 7, false);
                }
            }
            oooo000.f35895OooO0o = 0;
            i3++;
            if (i3 - i2 >= 8192) {
                return false;
            }
            oooo000.OooOOOO(i3, false);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(p296o0O0OoO0.o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        int i = o000oooo2.read(this.f14078OooO0O0.f36661OooO00o, 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f14078OooO0O0.OooOoOO(0);
        this.f14078OooO0O0.OooOoO(i);
        if (!this.f14079OooO0OO) {
            this.f14077OooO00o.f14092OooOOO0 = 0L;
            this.f14079OooO0OO = true;
        }
        this.f14077OooO00o.OooO00o(this.f14078OooO0O0);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
