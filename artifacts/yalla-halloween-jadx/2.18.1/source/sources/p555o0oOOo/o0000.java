package p555o0oOOo;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import kotlin.UByte;
import o000OO0O.OooO;
import org.conscrypt.EvpMdRef;
import p217o00oO00o.o000000;
import p241o00oo0.o0O00000;
import p241o00oo0.o0oOOo;
import p243o00oo00O.o000O000;
import p243o00oo00O.o000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO<o000000, String> f44630OooO00o = new o000OO<>(1000);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO<OooO0O0> f44631OooO0O0 = (o0oOOo.OooO0OO) o0oOOo.OooO00o(10, new OooO00o());

    public class OooO00o implements o0oOOo.OooO0O0<OooO0O0> {
        @Override // o00oo0.o0oOOo.OooO0O0
        public final OooO0O0 OooO00o() {
            try {
                return new OooO0O0(MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class OooO0O0 implements o0oOOo.OooO0o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final MessageDigest f44632Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final o0O00000.OooO00o f44633Oooo0oO = new o0O00000.OooO00o();

        public OooO0O0(MessageDigest messageDigest) {
            this.f44632Oooo0o = messageDigest;
        }

        @Override // o00oo0.o0oOOo.OooO0o
        @NonNull
        public final o0O00000 OooO0O0() {
            return this.f44633Oooo0oO;
        }
    }

    public final String OooO00o(o000000 o000000Var) {
        String strOooO00o;
        synchronized (this.f44630OooO00o) {
            strOooO00o = this.f44630OooO00o.OooO00o(o000000Var);
        }
        if (strOooO00o == null) {
            OooO0O0 OooO0O1 = this.f44631OooO0O0.OooO0O0();
            Objects.requireNonNull(OooO0O1, "Argument must not be null");
            OooO0O0 oooO0O0 = OooO0O1;
            try {
                o000000Var.OooO00o(oooO0O0.f44632Oooo0o);
                byte[] bArrDigest = oooO0O0.f44632Oooo0o.digest();
                char[] cArr = o000O000.f34178OooO0O0;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        int i2 = bArrDigest[i] & UByte.MAX_VALUE;
                        int i3 = i * 2;
                        char[] cArr2 = o000O000.f34177OooO00o;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[i2 & 15];
                    }
                    strOooO00o = new String(cArr);
                }
                this.f44631OooO0O0.OooO00o(oooO0O0);
            } catch (Throwable th) {
                this.f44631OooO0O0.OooO00o(oooO0O0);
                throw th;
            }
        }
        synchronized (this.f44630OooO00o) {
            this.f44630OooO00o.OooO0Oo(o000000Var, strOooO00o);
        }
        return strOooO00o;
    }
}
