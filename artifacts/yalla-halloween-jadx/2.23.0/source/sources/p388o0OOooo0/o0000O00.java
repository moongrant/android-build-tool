package p388o0OOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import p145o00Oo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O00 extends o000oOoO {
    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        try {
            SSLContext.getInstance("TLSv1.2");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
