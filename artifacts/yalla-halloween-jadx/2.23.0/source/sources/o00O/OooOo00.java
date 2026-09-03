package o00O;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o00000OO;
import p532o0o0Oo.o0000O00;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000OO<o000OOo, String> f35963OooO00o = new o00000OO<>(1000);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOO.OooO00o.OooO0OO f35964OooO0O0 = o00OOO.OooO00o.OooO00o(10, new OooO00o());

    public class OooO00o implements o00OOO.OooO00o.OooO0O0<OooO0O0> {
        @Override // o00OOO.OooO00o.OooO0O0
        public final OooO0O0 OooO00o() {
            try {
                return new OooO0O0(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class OooO0O0 implements o00OOO.OooO00o.OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final MessageDigest f35965OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00OOO.OooO0o.OooO00o f35966OooO0o0 = new o00OOO.OooO0o.OooO00o();

        public OooO0O0(MessageDigest messageDigest) {
            this.f35965OooO0Oo = messageDigest;
        }

        @Override // o00OOO.OooO00o.OooO0o
        @NonNull
        public final o00OOO.OooO0o.OooO00o OooO0OO() {
            return this.f35966OooO0o0;
        }
    }

    public final String OooO00o(o000OOo o000ooo2) {
        String str;
        Object objOooO0O0 = this.f35964OooO0O0.OooO0O0();
        o0000O00.OooO0O0(objOooO0O0);
        OooO0O0 oooO0O0 = (OooO0O0) objOooO0O0;
        try {
            o000ooo2.OooO00o(oooO0O0.f35965OooO0Oo);
            byte[] bArrDigest = oooO0O0.f35965OooO0Oo.digest();
            char[] cArr = o0000oo.f54572OooO0O0;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    int i2 = bArrDigest[i] & UByte.MAX_VALUE;
                    int i3 = i * 2;
                    char[] cArr2 = o0000oo.f54571OooO00o;
                    cArr[i3] = cArr2[i2 >>> 4];
                    cArr[i3 + 1] = cArr2[i2 & 15];
                }
                str = new String(cArr);
            }
            this.f35964OooO0O0.OooO00o(oooO0O0);
            return str;
        } catch (Throwable th) {
            this.f35964OooO0O0.OooO00o(oooO0O0);
            throw th;
        }
    }

    public final String OooO0O0(o000OOo o000ooo2) {
        String strOooO00o;
        synchronized (this.f35963OooO00o) {
            strOooO00o = this.f35963OooO00o.OooO00o(o000ooo2);
        }
        if (strOooO00o == null) {
            strOooO00o = OooO00o(o000ooo2);
        }
        synchronized (this.f35963OooO00o) {
            this.f35963OooO00o.OooO0Oo(o000ooo2, strOooO00o);
        }
        return strOooO00o;
    }
}
