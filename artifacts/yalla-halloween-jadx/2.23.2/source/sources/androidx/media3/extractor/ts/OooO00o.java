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
public final class OooO00o implements Extractor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f8899OooO00o = new OooO0O0(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f8900OooO0O0 = new o000O000(2786);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f8901OooO0OO;

    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(o000OOoO.Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        o000O000 o000o001 = this.f8900OooO0O0;
        int i = ((o000OOoO.OooOO0O) oooo000).read(o000o001.f34962OooO00o, 0, 2786);
        if (i == -1) {
            return -1;
        }
        o000o001.Oooo00O(0);
        o000o001.Oooo000(i);
        boolean z = this.f8901OooO0OO;
        OooO0O0 oooO0O0 = this.f8899OooO00o;
        if (!z) {
            oooO0O0.OooO0o0(4, 0L);
            this.f8901OooO0OO = true;
        }
        oooO0O0.OooO0OO(o000o001);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f8901OooO0OO = false;
        this.f8899OooO00o.OooO0O0();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(o000OOoO.Oooo0 oooo0) {
        this.f8899OooO00o.OooO0o(oooo0, new TsPayloadReader.OooO0o(0, 1));
        oooo0.OooOO0O();
        oooo0.OooO(new o000000.OooO0O0(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(o000OOoO.Oooo000 oooo000) throws IOException {
        o000OOoO.OooOO0O oooOO0O;
        int iOooO00o;
        o000O000 o000o001 = new o000O000(10);
        int i = 0;
        while (true) {
            oooOO0O = (o000OOoO.OooOO0O) oooo000;
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
        int i2 = 0;
        int i3 = i;
        while (true) {
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 6, false);
            o000o001.Oooo00O(0);
            if (o000o001.OooOoOO() != 2935) {
                oooOO0O.f34679OooO0o = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                oooOO0O.OooOO0o(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = o000o001.f34962OooO00o;
                if (bArr.length < 6) {
                    iOooO00o = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        iOooO00o = ((((bArr[2] & 7) << 8) | (bArr[3] & UByte.MAX_VALUE)) + 1) * 2;
                    } else {
                        byte b = bArr[4];
                        iOooO00o = o000OOoO.OooO00o.OooO00o((b & 192) >> 6, b & 63);
                    }
                }
                if (iOooO00o == -1) {
                    return false;
                }
                oooOO0O.OooOO0o(iOooO00o - 6, false);
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
