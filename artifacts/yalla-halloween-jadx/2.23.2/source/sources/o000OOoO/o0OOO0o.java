package o000OOoO;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;
import p080o000OoO.o000O000;
import p086o000Oooo.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f34720OooO00o = new o000O000(10);

    @Nullable
    public final Metadata OooO00o(OooOO0O oooOO0O, @Nullable o0000O0.OooO00o oooO00o) throws IOException {
        o000O000 o000o001 = this.f34720OooO00o;
        Metadata metadataOooO0OO = null;
        int i = 0;
        while (true) {
            try {
                oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 10, false);
                o000o001.Oooo00O(0);
                if (o000o001.OooOo() != 4801587) {
                    break;
                }
                o000o001.Oooo00o(3);
                int iOooOo0 = o000o001.OooOo0();
                int i2 = iOooOo0 + 10;
                if (metadataOooO0OO == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(o000o001.f34962OooO00o, 0, bArr, 0, 10);
                    oooOO0O.OooO0OO(bArr, 10, iOooOo0, false);
                    metadataOooO0OO = new o0000O0(oooO00o).OooO0OO(i2, bArr);
                } else {
                    oooOO0O.OooOO0o(iOooOo0, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        oooOO0O.f34679OooO0o = 0;
        oooOO0O.OooOO0o(i, false);
        return metadataOooO0OO;
    }
}
