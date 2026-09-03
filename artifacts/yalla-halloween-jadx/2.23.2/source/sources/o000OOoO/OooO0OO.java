package o000OOoO;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f34636OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<byte[]> f34637OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34638OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f34639OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f34640OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f34641OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f34642OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f34643OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f34644OooO0oo;

    public OooO0OO(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, float f, @Nullable String str) {
        this.f34637OooO00o = arrayList;
        this.f34638OooO0O0 = i;
        this.f34639OooO0OO = i2;
        this.f34640OooO0Oo = i3;
        this.f34642OooO0o0 = i4;
        this.f34641OooO0o = i5;
        this.f34643OooO0oO = i6;
        this.f34644OooO0oo = f;
        this.f34636OooO = str;
    }

    public static OooO0OO OooO00o(o000O000 o000o001) throws ParserException {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        String strOooO00o;
        try {
            o000o001.Oooo00o(4);
            int iOooOo0O = (o000o001.OooOo0O() & 3) + 1;
            if (iOooOo0O == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iOooOo0O2 = o000o001.OooOo0O() & 31;
            int i6 = 0;
            while (true) {
                bArr = p080o000OoO.o0OOO0o.f34995OooO00o;
                if (i6 >= iOooOo0O2) {
                    break;
                }
                int iOooOoOO = o000o001.OooOoOO();
                int i7 = o000o001.f34963OooO0O0;
                o000o001.Oooo00o(iOooOoOO);
                byte[] bArr2 = o000o001.f34962OooO00o;
                byte[] bArr3 = new byte[iOooOoOO + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i7, bArr3, 4, iOooOoOO);
                arrayList.add(bArr3);
                i6++;
            }
            int iOooOo0O3 = o000o001.OooOo0O();
            for (int i8 = 0; i8 < iOooOo0O3; i8++) {
                int iOooOoOO2 = o000o001.OooOoOO();
                int i9 = o000o001.f34963OooO0O0;
                o000o001.Oooo00o(iOooOoOO2);
                byte[] bArr4 = o000o001.f34962OooO00o;
                byte[] bArr5 = new byte[iOooOoOO2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i9, bArr5, 4, iOooOoOO2);
                arrayList.add(bArr5);
            }
            if (iOooOo0O2 > 0) {
                o000O0o.Oooo0.OooO0OO OooO0Oo2 = p070o000O0o.Oooo0.OooO0Oo(iOooOo0O, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i10 = OooO0Oo2.f34325OooO0o0;
                int i11 = OooO0Oo2.f34324OooO0o;
                int i12 = OooO0Oo2.f34331OooOOO;
                int i13 = OooO0Oo2.f34333OooOOOO;
                int i14 = OooO0Oo2.f34334OooOOOo;
                float f2 = OooO0Oo2.f34326OooO0oO;
                strOooO00o = p080o000OoO.o0OOO0o.OooO00o(OooO0Oo2.f34320OooO00o, OooO0Oo2.f34321OooO0O0, OooO0Oo2.f34322OooO0OO);
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
            return new OooO0OO(arrayList, iOooOo0O, i, i2, i3, i4, i5, f, strOooO00o);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.OooO00o("Error parsing AVC config", e);
        }
    }
}
