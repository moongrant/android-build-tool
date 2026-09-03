package o0OOOOOO;

import com.twitter.sdk.android.core.OooOOO0;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.twitter.sdk.android.core.OooO f43653OooO00o;

    public OooO00o(com.twitter.sdk.android.core.OooO oooO) {
        this.f43653OooO00o = oooO;
    }

    public static void OooO00o(o00OOOOo.OooO00o oooO00o, GuestAuthToken guestAuthToken) {
        oooO00o.OooO0Oo("Authorization", guestAuthToken.OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + guestAuthToken.OooO00o());
        oooO00o.OooO0Oo("x-guest-token", guestAuthToken.OooO0OO());
    }

    @Override // p634o0ooO0oO.o00OOO00
    public final o0oOOo intercept(o00OOO00.OooO00o oooO00o) throws IOException {
        com.twitter.sdk.android.core.OooO0o oooO0o;
        nc ncVar = (nc) oooO00o;
        o00OOOOo o00ooooo2 = ncVar.f59720OooO0o0;
        com.twitter.sdk.android.core.OooO oooO = this.f43653OooO00o;
        synchronized (oooO) {
            oooO0o = (com.twitter.sdk.android.core.OooO0o) ((OooOOO0) oooO.f21961OooO0O0).OooO0OO();
            if (!((oooO0o == null || oooO0o.OooO00o() == null || oooO0o.OooO00o().OooO0Oo()) ? false : true)) {
                oooO.OooO00o();
                oooO0o = (com.twitter.sdk.android.core.OooO0o) ((OooOOO0) oooO.f21961OooO0O0).OooO0OO();
            }
        }
        GuestAuthToken guestAuthTokenOooO00o = oooO0o == null ? null : oooO0o.OooO00o();
        if (guestAuthTokenOooO00o == null) {
            return ncVar.OooO0O0(o00ooooo2);
        }
        o00ooooo2.getClass();
        o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o(o00ooooo2);
        OooO00o(oooO00o2, guestAuthTokenOooO00o);
        return ncVar.OooO0O0(oooO00o2.OooO0O0());
    }
}
