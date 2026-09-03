package androidx.media3.extractor.ts;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import java.io.IOException;
import kotlin.UByte;
import o000OOoO.o000000;
import o000OOoO.o000OOo;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0OO implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f8914OooO00o = new OooO0o(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f8915OooO0O0 = new o000O000(16384);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f8916OooO0OO;

    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(o000OOoO.Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        o000O000 o000o001 = this.f8915OooO0O0;
        int i = ((o000OOoO.OooOO0O) oooo000).read(o000o001.f34962OooO00o, 0, 16384);
        if (i == -1) {
            return -1;
        }
        o000o001.Oooo00O(0);
        o000o001.Oooo000(i);
        boolean z = this.f8916OooO0OO;
        OooO0o oooO0o = this.f8914OooO00o;
        if (!z) {
            oooO0o.OooO0o0(4, 0L);
            this.f8916OooO0OO = true;
        }
        oooO0o.OooO0OO(o000o001);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f8916OooO0OO = false;
        this.f8914OooO00o.OooO0O0();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(o000OOoO.Oooo0 oooo0) {
        this.f8914OooO00o.OooO0o(oooo0, new TsPayloadReader.OooO0o(0, 1));
        oooo0.OooOO0O();
        oooo0.OooO(new o000000.OooO0O0(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(o000OOoO.Oooo000 oooo000) throws IOException {
        o000OOoO.OooOO0O oooOO0O;
        int i;
        o000O000 o000o001 = new o000O000(10);
        int i2 = 0;
        while (true) {
            oooOO0O = (o000OOoO.OooOO0O) oooo000;
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 10, false);
            o000o001.Oooo00O(0);
            if (o000o001.OooOo() != 4801587) {
                break;
            }
            o000o001.Oooo00o(3);
            int iOooOo0 = o000o001.OooOo0();
            i2 += iOooOo0 + 10;
            oooOO0O.OooOO0o(iOooOo0, false);
        }
        oooOO0O.f34679OooO0o = 0;
        oooOO0O.OooOO0o(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 7, false);
            o000o001.Oooo00O(0);
            int iOooOoOO = o000o001.OooOoOO();
            if (iOooOoOO == 44096 || iOooOoOO == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = o000o001.f34962OooO00o;
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
                oooOO0O.OooOO0o(i - 7, false);
            } else {
                oooOO0O.f34679OooO0o = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                oooOO0O.OooOO0o(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
