package o000OOoO;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<byte[]> f34725OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34726OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f34727OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f34728OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f34729OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f34730OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f34731OooO0oO;

    public o0ooOOo(List list, int i, int i2, int i3, int i4, float f, @Nullable String str) {
        this.f34725OooO00o = list;
        this.f34726OooO0O0 = i;
        this.f34727OooO0OO = i2;
        this.f34728OooO0Oo = i3;
        this.f34730OooO0o0 = i4;
        this.f34729OooO0o = f;
        this.f34731OooO0oO = str;
    }

    public static o0ooOOo OooO00o(o000O000 o000o001) throws ParserException {
        try {
            o000o001.Oooo00o(21);
            int iOooOo0O = o000o001.OooOo0O() & 3;
            int iOooOo0O2 = o000o001.OooOo0O();
            int i = o000o001.f34963OooO0O0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < iOooOo0O2; i4++) {
                o000o001.Oooo00o(1);
                int iOooOoOO = o000o001.OooOoOO();
                for (int i5 = 0; i5 < iOooOoOO; i5++) {
                    int iOooOoOO2 = o000o001.OooOoOO();
                    i3 += iOooOoOO2 + 4;
                    o000o001.Oooo00o(iOooOoOO2);
                }
            }
            o000o001.Oooo00O(i);
            byte[] bArr = new byte[i3];
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            float f = 1.0f;
            String strOooO0O0 = null;
            int i9 = 0;
            int i10 = 0;
            while (i9 < iOooOo0O2) {
                int iOooOo0O3 = o000o001.OooOo0O() & 63;
                int iOooOoOO3 = o000o001.OooOoOO();
                int i11 = i2;
                while (i11 < iOooOoOO3) {
                    int iOooOoOO4 = o000o001.OooOoOO();
                    int i12 = iOooOo0O2;
                    System.arraycopy(p070o000O0o.Oooo0.f34301OooO00o, i2, bArr, i10, 4);
                    int i13 = i10 + 4;
                    System.arraycopy(o000o001.f34962OooO00o, o000o001.f34963OooO0O0, bArr, i13, iOooOoOO4);
                    if (iOooOo0O3 == 33 && i11 == 0) {
                        o000O0o.Oooo0.OooO00o oooO00oOooO0OO = p070o000O0o.Oooo0.OooO0OO(i13, i13 + iOooOoOO4, bArr);
                        int i14 = oooO00oOooO0OO.f34314OooOO0;
                        i7 = oooO00oOooO0OO.f34315OooOO0O;
                        i8 = oooO00oOooO0OO.f34316OooOO0o;
                        f = oooO00oOooO0OO.f34305OooO;
                        i6 = i14;
                        strOooO0O0 = p080o000OoO.o0OOO0o.OooO0O0(oooO00oOooO0OO.f34306OooO00o, oooO00oOooO0OO.f34308OooO0OO, oooO00oOooO0OO.f34309OooO0Oo, oooO00oOooO0OO.f34310OooO0o, oooO00oOooO0OO.f34307OooO0O0, oooO00oOooO0OO.f34311OooO0o0);
                    }
                    i10 = i13 + iOooOoOO4;
                    o000o001.Oooo00o(iOooOoOO4);
                    i11++;
                    iOooOo0O2 = i12;
                    iOooOo0O3 = iOooOo0O3;
                    iOooOoOO3 = iOooOoOO3;
                    i2 = 0;
                }
                i9++;
                i2 = 0;
            }
            return new o0ooOOo(i3 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iOooOo0O + 1, i6, i7, i8, f, strOooO0O0);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.OooO00o("Error parsing HEVC config", e);
        }
    }
}
