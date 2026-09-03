package p320o0O0oOoO;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import p048OoooooO.o0oOOo;
import p318o0O0oOo.o000;
import p318o0O0oOo.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<byte[]> f36789OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36790OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f36791OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f36792OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f36793OooO0o0;

    public o00O0O0(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f36789OooO00o = list;
        this.f36790OooO0O0 = i;
        this.f36791OooO0OO = i2;
        this.f36792OooO0Oo = i3;
        this.f36793OooO0o0 = f;
    }

    public static byte[] OooO00o(o000 o000Var) {
        int iOooOo0O = o000Var.OooOo0O();
        int i = o000Var.f36662OooO0O0;
        o000Var.OooOoo0(iOooOo0O);
        byte[] bArr = o000Var.f36661OooO00o;
        byte[] bArr2 = new byte[iOooOo0O + 4];
        System.arraycopy(o0oOOo.f4204OooO00o, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, iOooOo0O);
        return bArr2;
    }

    public static o00O0O0 OooO0O0(o000 o000Var) throws ParserException {
        int i;
        int i2;
        float f;
        try {
            o000Var.OooOoo0(4);
            int iOooOOo0 = (o000Var.OooOOo0() & 3) + 1;
            if (iOooOOo0 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iOooOOo1 = o000Var.OooOOo0() & 31;
            for (int i3 = 0; i3 < iOooOOo1; i3++) {
                arrayList.add(OooO00o(o000Var));
            }
            int iOooOOo2 = o000Var.OooOOo0();
            for (int i4 = 0; i4 < iOooOOo2; i4++) {
                arrayList.add(OooO00o(o000Var));
            }
            if (iOooOOo1 > 0) {
                o0000O.OooO0O0 oooO0O0OooO0Oo = o0000O.OooO0Oo((byte[]) arrayList.get(0), iOooOOo0, ((byte[]) arrayList.get(0)).length);
                int i5 = oooO0O0OooO0Oo.f36686OooO0o0;
                int i6 = oooO0O0OooO0Oo.f36685OooO0o;
                f = oooO0O0OooO0Oo.f36687OooO0oO;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new o00O0O0(arrayList, iOooOOo0, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing AVC config", e);
        }
    }
}
