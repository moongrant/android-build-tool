package p247o00oo0oO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import p245o00oo0o.o00O00o0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<byte[]> f40733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40734OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f40735OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40736OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f40737OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40738OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f40739OooO0oO;

    public o00O(List list, int i, int i2, int i3, int i4, float f, @Nullable String str) {
        this.f40733OooO00o = list;
        this.f40734OooO0O0 = i;
        this.f40735OooO0OO = i2;
        this.f40736OooO0Oo = i3;
        this.f40738OooO0o0 = i4;
        this.f40737OooO0o = f;
        this.f40739OooO0oO = str;
    }

    public static o00O OooO00o(o00Oo00 o00oo00) throws ParserException {
        try {
            o00oo00.Oooo00o(21);
            int iOooOo0O = o00oo00.OooOo0O() & 3;
            int iOooOo0O2 = o00oo00.OooOo0O();
            int i = o00oo00.f40592OooO0O0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < iOooOo0O2; i4++) {
                o00oo00.Oooo00o(1);
                int iOooOoOO = o00oo00.OooOoOO();
                for (int i5 = 0; i5 < iOooOoOO; i5++) {
                    int iOooOoOO2 = o00oo00.OooOoOO();
                    i3 += iOooOoOO2 + 4;
                    o00oo00.Oooo00o(iOooOoOO2);
                }
            }
            o00oo00.Oooo00O(i);
            byte[] bArr = new byte[i3];
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            float f = 1.0f;
            String strOooO0O0 = null;
            int i9 = 0;
            int i10 = 0;
            while (i9 < iOooOo0O2) {
                int iOooOo0O3 = o00oo00.OooOo0O() & 63;
                int iOooOoOO3 = o00oo00.OooOoOO();
                int i11 = i2;
                while (i11 < iOooOoOO3) {
                    int iOooOoOO4 = o00oo00.OooOoOO();
                    int i12 = iOooOo0O2;
                    System.arraycopy(oo0O.f40640OooO00o, i2, bArr, i10, 4);
                    int i13 = i10 + 4;
                    System.arraycopy(o00oo00.f40591OooO00o, o00oo00.f40592OooO0O0, bArr, i13, iOooOoOO4);
                    if (iOooOo0O3 == 33 && i11 == 0) {
                        oo0O.OooO00o oooO00oOooO0OO = oo0O.OooO0OO(i13, i13 + iOooOoOO4, bArr);
                        int i14 = oooO00oOooO0OO.f40653OooOO0;
                        i7 = oooO00oOooO0OO.f40654OooOO0O;
                        i8 = oooO00oOooO0OO.f40655OooOO0o;
                        f = oooO00oOooO0OO.f40644OooO;
                        i6 = i14;
                        strOooO0O0 = o00O00o0.OooO0O0(oooO00oOooO0OO.f40645OooO00o, oooO00oOooO0OO.f40647OooO0OO, oooO00oOooO0OO.f40648OooO0Oo, oooO00oOooO0OO.f40649OooO0o, oooO00oOooO0OO.f40646OooO0O0, oooO00oOooO0OO.f40650OooO0o0);
                    }
                    i10 = i13 + iOooOoOO4;
                    o00oo00.Oooo00o(iOooOoOO4);
                    i11++;
                    iOooOo0O2 = i12;
                    iOooOo0O3 = iOooOo0O3;
                    iOooOoOO3 = iOooOoOO3;
                    i2 = 0;
                }
                i9++;
                i2 = 0;
            }
            return new o00O(i3 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iOooOo0O + 1, i6, i7, i8, f, strOooO0O0);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.OooO00o("Error parsing HEVC config", e);
        }
    }
}
