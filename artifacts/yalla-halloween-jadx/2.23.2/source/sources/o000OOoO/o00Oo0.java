package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00Oo0 {
    public static oo000o.OooO00o OooO00o(o000O000 o000o001) {
        o000o001.Oooo00o(1);
        int iOooOo = o000o001.OooOo();
        long j = ((long) o000o001.f34963OooO0O0) + ((long) iOooOo);
        int i = iOooOo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jOooOOOO = o000o001.OooOOOO();
            if (jOooOOOO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jOooOOOO;
            jArrCopyOf2[i2] = o000o001.OooOOOO();
            o000o001.Oooo00o(2);
        }
        o000o001.Oooo00o((int) (j - ((long) o000o001.f34963OooO0O0)));
        return new oo000o.OooO00o(jArrCopyOf, jArrCopyOf2);
    }
}
