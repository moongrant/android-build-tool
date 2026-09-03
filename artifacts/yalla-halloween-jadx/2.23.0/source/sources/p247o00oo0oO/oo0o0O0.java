package p247o00oo0oO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import p245o00oo0o.o00O00o0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f40870OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<byte[]> f40871OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40872OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f40873OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40874OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f40875OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40876OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f40877OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f40878OooO0oo;

    public oo0o0O0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, float f, @Nullable String str) {
        this.f40871OooO00o = arrayList;
        this.f40872OooO0O0 = i;
        this.f40873OooO0OO = i2;
        this.f40874OooO0Oo = i3;
        this.f40876OooO0o0 = i4;
        this.f40875OooO0o = i5;
        this.f40877OooO0oO = i6;
        this.f40878OooO0oo = f;
        this.f40870OooO = str;
    }

    public static oo0o0O0 OooO00o(o00Oo00 o00oo00) throws ParserException {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        String strOooO00o;
        try {
            o00oo00.Oooo00o(4);
            int iOooOo0O = (o00oo00.OooOo0O() & 3) + 1;
            if (iOooOo0O == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iOooOo0O2 = o00oo00.OooOo0O() & 31;
            int i6 = 0;
            while (true) {
                bArr = o00O00o0.f40563OooO00o;
                if (i6 >= iOooOo0O2) {
                    break;
                }
                int iOooOoOO = o00oo00.OooOoOO();
                int i7 = o00oo00.f40592OooO0O0;
                o00oo00.Oooo00o(iOooOoOO);
                byte[] bArr2 = o00oo00.f40591OooO00o;
                byte[] bArr3 = new byte[iOooOoOO + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i7, bArr3, 4, iOooOoOO);
                arrayList.add(bArr3);
                i6++;
            }
            int iOooOo0O3 = o00oo00.OooOo0O();
            for (int i8 = 0; i8 < iOooOo0O3; i8++) {
                int iOooOoOO2 = o00oo00.OooOoOO();
                int i9 = o00oo00.f40592OooO0O0;
                o00oo00.Oooo00o(iOooOoOO2);
                byte[] bArr4 = o00oo00.f40591OooO00o;
                byte[] bArr5 = new byte[iOooOoOO2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i9, bArr5, 4, iOooOoOO2);
                arrayList.add(bArr5);
            }
            if (iOooOo0O2 > 0) {
                oo0O.OooO0OO OooO0Oo2 = oo0O.OooO0Oo(iOooOo0O, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i10 = OooO0Oo2.f40664OooO0o0;
                int i11 = OooO0Oo2.f40663OooO0o;
                int i12 = OooO0Oo2.f40670OooOOO;
                int i13 = OooO0Oo2.f40672OooOOOO;
                int i14 = OooO0Oo2.f40673OooOOOo;
                float f2 = OooO0Oo2.f40665OooO0oO;
                strOooO00o = o00O00o0.OooO00o(OooO0Oo2.f40659OooO00o, OooO0Oo2.f40660OooO0O0, OooO0Oo2.f40661OooO0OO);
                i3 = i12;
                i4 = i13;
                i5 = i14;
                f = f2;
                i = i10;
                i2 = i11;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                f = 1.0f;
                strOooO00o = null;
            }
            return new oo0o0O0(arrayList, iOooOo0O, i, i2, i3, i4, i5, f, strOooO00o);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.OooO00o("Error parsing AVC config", e);
        }
    }
}
