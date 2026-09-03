package p320o0O0oOoO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import p318o0O0oOo.o000;
import p318o0O0oOo.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final List<byte[]> f36809OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36810OooO0O0;

    public o00O0OO0(@Nullable List<byte[]> list, int i) {
        this.f36809OooO00o = list;
        this.f36810OooO0O0 = i;
    }

    public static o00O0OO0 OooO00o(o000 o000Var) throws ParserException {
        try {
            o000Var.OooOoo0(21);
            int iOooOOo0 = o000Var.OooOOo0() & 3;
            int iOooOOo1 = o000Var.OooOOo0();
            int i = o000Var.f36662OooO0O0;
            int i2 = 0;
            for (int i3 = 0; i3 < iOooOOo1; i3++) {
                o000Var.OooOoo0(1);
                int iOooOo0O = o000Var.OooOo0O();
                for (int i4 = 0; i4 < iOooOo0O; i4++) {
                    int iOooOo0O2 = o000Var.OooOo0O();
                    i2 += iOooOo0O2 + 4;
                    o000Var.OooOoo0(iOooOo0O2);
                }
            }
            o000Var.OooOoOO(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < iOooOOo1; i6++) {
                o000Var.OooOoo0(1);
                int iOooOo0O3 = o000Var.OooOo0O();
                for (int i7 = 0; i7 < iOooOo0O3; i7++) {
                    int iOooOo0O4 = o000Var.OooOo0O();
                    System.arraycopy(o0000O.f36673OooO00o, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(o000Var.f36661OooO00o, o000Var.f36662OooO0O0, bArr, i8, iOooOo0O4);
                    i5 = i8 + iOooOo0O4;
                    o000Var.OooOoo0(iOooOo0O4);
                }
            }
            return new o00O0OO0(i2 == 0 ? null : Collections.singletonList(bArr), iOooOOo0 + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
