package p209o00o0oo0;

import java.util.Arrays;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0OO {
    public static oo0oOO0.OooO00o OooO00o(o00Oo00 o00oo00) {
        o00oo00.Oooo00o(1);
        int iOooOo = o00oo00.OooOo();
        long j = ((long) o00oo00.f40592OooO0O0) + ((long) iOooOo);
        int i = iOooOo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jOooOOOO = o00oo00.OooOOOO();
            if (jOooOOOO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jOooOOOO;
            jArrCopyOf2[i2] = o00oo00.OooOOOO();
            o00oo00.Oooo00o(2);
        }
        o00oo00.Oooo00o((int) (j - ((long) o00oo00.f40592OooO0O0)));
        return new oo0oOO0.OooO00o(jArrCopyOf, jArrCopyOf2);
    }
}
