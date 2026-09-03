package p347o0OOOOOo;

import com.twitter.sdk.android.core.OooO;
import com.twitter.sdk.android.core.OooO0o;
import com.twitter.sdk.android.core.OooOO0O;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import p641o0ooOO0o.o00OO0OO;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0oO0O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o00OO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f42843OooO0O0;

    public o000oOoO(OooO oooO) {
        this.f42843OooO0O0 = oooO;
    }

    @Override // p641o0ooOO0o.o00OO0OO
    public final o0O00O0o authenticate(o0oO0O0o o0oo0o0o2, o0O00o00 o0o00o01) throws IOException {
        OooO0o oooO0o;
        int i = 1;
        o0O00o00 o0o00o02 = o0o00o01;
        while (true) {
            o0o00o02 = o0o00o02.f57856OooOOO0;
            if (o0o00o02 == null) {
                break;
            }
            i++;
        }
        if (!(i < 2)) {
            return null;
        }
        OooO oooO = this.f42843OooO0O0;
        o0O000 o0o001 = o0o00o01.f57847OooO0Oo.f57830OooO0OO;
        String strOooO00o = o0o001.OooO00o("Authorization");
        String strOooO00o2 = o0o001.OooO00o("x-guest-token");
        OooO0o oooO0o2 = (strOooO00o == null || strOooO00o2 == null) ? null : new OooO0o(new GuestAuthToken("bearer", strOooO00o.replace("bearer ", ""), strOooO00o2));
        synchronized (oooO) {
            OooO0o oooO0o3 = (OooO0o) ((OooOO0O) oooO.f21488OooO0O0).OooO0OO();
            if (oooO0o2 != null && oooO0o2.equals(oooO0o3)) {
                oooO.OooO00o();
            }
            oooO0o = (OooO0o) ((OooOO0O) oooO.f21488OooO0O0).OooO0OO();
        }
        GuestAuthToken guestAuthTokenOooO00o = oooO0o == null ? null : oooO0o.OooO00o();
        if (guestAuthTokenOooO00o == null) {
            return null;
        }
        o0O00O0o o0o00o0o = o0o00o01.f57847OooO0Oo;
        o0o00o0o.getClass();
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(o0o00o0o);
        Oooo000.OooO00o(oooO00o, guestAuthTokenOooO00o);
        return oooO00o.OooO0O0();
    }
}
