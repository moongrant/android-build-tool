package o0OOOOOO;

import com.twitter.sdk.android.core.OooOOO0;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O00000;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oOO00O;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO implements oOO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.twitter.sdk.android.core.OooO f43654OooO0O0;

    public OooO0OO(com.twitter.sdk.android.core.OooO oooO) {
        this.f43654OooO0O0 = oooO;
    }

    @Override // p634o0ooO0oO.oOO00O
    public final o00OOOOo authenticate(o0O00000 o0o00000, o0oOOo o0oooo) throws IOException {
        com.twitter.sdk.android.core.OooO0o oooO0o;
        int i = 1;
        o0oOOo o0oooo2 = o0oooo;
        while (true) {
            o0oooo2 = o0oooo2.f57351OooOOO0;
            if (o0oooo2 == null) {
                break;
            }
            i++;
        }
        if (!(i < 2)) {
            return null;
        }
        com.twitter.sdk.android.core.OooO oooO = this.f43654OooO0O0;
        oo0O oo0o = o0oooo.f57342OooO0Oo.f57315OooO0OO;
        String strOooO00o = oo0o.OooO00o("Authorization");
        String strOooO00o2 = oo0o.OooO00o("x-guest-token");
        com.twitter.sdk.android.core.OooO0o oooO0o2 = (strOooO00o == null || strOooO00o2 == null) ? null : new com.twitter.sdk.android.core.OooO0o(new GuestAuthToken("bearer", strOooO00o.replace("bearer ", ""), strOooO00o2));
        synchronized (oooO) {
            com.twitter.sdk.android.core.OooO0o oooO0o3 = (com.twitter.sdk.android.core.OooO0o) ((OooOOO0) oooO.f21961OooO0O0).OooO0OO();
            if (oooO0o2 != null && oooO0o2.equals(oooO0o3)) {
                oooO.OooO00o();
            }
            oooO0o = (com.twitter.sdk.android.core.OooO0o) ((OooOOO0) oooO.f21961OooO0O0).OooO0OO();
        }
        GuestAuthToken guestAuthTokenOooO00o = oooO0o == null ? null : oooO0o.OooO00o();
        if (guestAuthTokenOooO00o == null) {
            return null;
        }
        o00OOOOo o00ooooo2 = o0oooo.f57342OooO0Oo;
        o00ooooo2.getClass();
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00ooooo2);
        OooO00o.OooO00o(oooO00o, guestAuthTokenOooO00o);
        return oooO00o.OooO0O0();
    }
}
