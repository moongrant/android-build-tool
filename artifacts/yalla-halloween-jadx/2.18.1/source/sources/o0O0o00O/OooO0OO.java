package o0O0o00O;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import p296o0O0OoO0.o000oOoO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36191OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f36192OooO0O0;

        public OooO00o(int i, long j) {
            this.f36191OooO00o = i;
            this.f36192OooO0O0 = j;
        }

        public static OooO00o OooO00o(o000oOoO o000oooo2, o000 o000Var) throws IOException {
            o000oooo2.OooOOO0(o000Var.f36661OooO00o, 0, 8);
            o000Var.OooOoOO(0);
            return new OooO00o(o000Var.OooO0Oo(), o000Var.OooO0oo());
        }
    }

    @Nullable
    public static OooO0O0 OooO00o(o000oOoO o000oooo2) throws IOException {
        byte[] bArr;
        Objects.requireNonNull(o000oooo2);
        o000 o000Var = new o000(16);
        if (OooO00o.OooO00o(o000oooo2, o000Var).f36191OooO00o != 1380533830) {
            return null;
        }
        o000oooo2.OooOOO0(o000Var.f36661OooO00o, 0, 4);
        o000Var.OooOoOO(0);
        int iOooO0Oo = o000Var.OooO0Oo();
        if (iOooO0Oo != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(iOooO0Oo);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        OooO00o OooO00o2 = OooO00o.OooO00o(o000oooo2, o000Var);
        while (OooO00o2.f36191OooO00o != 1718449184) {
            o000oooo2.OooO0o0((int) OooO00o2.f36192OooO0O0);
            OooO00o2 = OooO00o.OooO00o(o000oooo2, o000Var);
        }
        o00000O0.OooO0Oo(OooO00o2.f36192OooO0O0 >= 16);
        o000oooo2.OooOOO0(o000Var.f36661OooO00o, 0, 16);
        o000Var.OooOoOO(0);
        int iOooOO0 = o000Var.OooOO0();
        int iOooOO1 = o000Var.OooOO0();
        int iOooO = o000Var.OooO();
        o000Var.OooO();
        int iOooOO2 = o000Var.OooOO0();
        int iOooOO3 = o000Var.OooOO0();
        int i = ((int) OooO00o2.f36192OooO0O0) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            o000oooo2.OooOOO0(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = o000OOo0.f36744OooO0o;
        }
        return new OooO0O0(iOooOO0, iOooOO1, iOooO, iOooOO2, iOooOO3, bArr);
    }
}
