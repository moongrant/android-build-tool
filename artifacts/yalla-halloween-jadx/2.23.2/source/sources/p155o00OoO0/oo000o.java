package p155o00OoO0;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import p154o00Oo0oo.o0OOO0o;
import p174o00OooOo.o00OO00O;
import p174o00OooOo.o00OO0O0;
import p174o00OooOo.oo0oOO0;
import p279o0O00o0.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0oOO0<o0OOO0o, String> f37957OooO00o = new oo0oOO0<>(1000);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00o0.OooO0O0.OooO0OO f37958OooO0O0 = p279o0O00o0.OooO0O0.OooO00o(10, new OooO00o());

    public class OooO00o implements p279o0O00o0.OooO0O0.InterfaceC0441OooO0O0<OooO0O0> {
        @Override // p279o0O00o0.OooO0O0.InterfaceC0441OooO0O0
        public final OooO0O0 OooO00o() {
            try {
                return new OooO0O0(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class OooO0O0 implements o0O00o0.OooO0O0.OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final MessageDigest f37959OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO.OooO00o f37960OooO0o0 = new OooO.OooO00o();

        public OooO0O0(MessageDigest messageDigest) {
            this.f37959OooO0Oo = messageDigest;
        }

        @Override // o0O00o0.OooO0O0.OooO0o
        @NonNull
        public final OooO.OooO00o OooO0O0() {
            return this.f37960OooO0o0;
        }
    }

    public final String OooO00o(o0OOO0o o0ooo0o2) {
        String str;
        Object objOooO0O0 = this.f37958OooO0O0.OooO0O0();
        o00OO00O.OooO0O0(objOooO0O0);
        OooO0O0 oooO0O0 = (OooO0O0) objOooO0O0;
        try {
            o0ooo0o2.OooO0O0(oooO0O0.f37959OooO0Oo);
            byte[] bArrDigest = oooO0O0.f37959OooO0Oo.digest();
            char[] cArr = o00OO0O0.f38352OooO0O0;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    int i2 = bArrDigest[i] & UByte.MAX_VALUE;
                    int i3 = i * 2;
                    char[] cArr2 = o00OO0O0.f38351OooO00o;
                    cArr[i3] = cArr2[i2 >>> 4];
                    cArr[i3 + 1] = cArr2[i2 & 15];
                }
                str = new String(cArr);
            }
            this.f37958OooO0O0.OooO00o(oooO0O0);
            return str;
        } catch (Throwable th) {
            this.f37958OooO0O0.OooO00o(oooO0O0);
            throw th;
        }
    }

    public final String OooO0O0(o0OOO0o o0ooo0o2) {
        String strOooO00o;
        synchronized (this.f37957OooO00o) {
            strOooO00o = this.f37957OooO00o.OooO00o(o0ooo0o2);
        }
        if (strOooO00o == null) {
            strOooO00o = OooO00o(o0ooo0o2);
        }
        synchronized (this.f37957OooO00o) {
            this.f37957OooO00o.OooO0Oo(o0ooo0o2, strOooO00o);
        }
        return strOooO00o;
    }
}
