package p396o0Oo00o0;

import androidx.compose.runtime.internal.StabilityInferred;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import p191o00o0O0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo extends o00Oo0 {
    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        try {
            SSLContext.getInstance("TLSv1.2");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
