package p296o0O0OoO0;

import Oooo000.o000O0;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.Arrays;
import p308o0O0o0o0.OooO;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {
    @Nullable
    public static Metadata OooO00o(o000oOoO o000oooo2, boolean z) throws IOException {
        o000O0 o000o0;
        if (z) {
            o000o0 = null;
        } else {
            int i = OooO.f36252OooO0O0;
            o000o0 = o000O0.f866OooO0Oo;
        }
        Metadata metadataOooO00o = new o0OOO0o().OooO00o(o000oooo2, o000o0);
        if (metadataOooO00o == null || metadataOooO00o.f14442Oooo0o.length == 0) {
            return null;
        }
        return metadataOooO00o;
    }

    public static o00oO0o.OooO00o OooO0O0(o000 o000Var) {
        o000Var.OooOoo0(1);
        int iOooOOoo = o000Var.OooOOoo();
        long j = ((long) o000Var.f36662OooO0O0) + ((long) iOooOOoo);
        int i = iOooOOoo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jOooOO0O = o000Var.OooOO0O();
            if (jOooOO0O == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jOooOO0O;
            jArrCopyOf2[i2] = o000Var.OooOO0O();
            o000Var.OooOoo0(2);
        }
        o000Var.OooOoo0((int) (j - ((long) o000Var.f36662OooO0O0)));
        return new o00oO0o.OooO00o(jArrCopyOf, jArrCopyOf2);
    }
}
