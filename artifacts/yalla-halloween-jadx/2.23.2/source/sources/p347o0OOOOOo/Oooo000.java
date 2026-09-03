package p347o0OOOOOo;

import com.twitter.sdk.android.core.OooO;
import com.twitter.sdk.android.core.OooO0o;
import com.twitter.sdk.android.core.OooOO0O;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f42842OooO00o;

    public Oooo000(OooO oooO) {
        this.f42842OooO00o = oooO;
    }

    public static void OooO00o(o0O00O0o.OooO00o oooO00o, GuestAuthToken guestAuthToken) {
        oooO00o.OooO0Oo("Authorization", guestAuthToken.OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + guestAuthToken.OooO00o());
        oooO00o.OooO0Oo("x-guest-token", guestAuthToken.OooO0OO());
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    public final o0O00o00 intercept(o0OoOoOo.OooO00o oooO00o) throws IOException {
        OooO0o oooO0o;
        o000O o000o = (o000O) oooO00o;
        o0O00O0o o0o00o0o = o000o.f59401OooO0o0;
        OooO oooO = this.f42842OooO00o;
        synchronized (oooO) {
            oooO0o = (OooO0o) ((OooOO0O) oooO.f21488OooO0O0).OooO0OO();
            if (!((oooO0o == null || oooO0o.OooO00o() == null || oooO0o.OooO00o().OooO0Oo()) ? false : true)) {
                oooO.OooO00o();
                oooO0o = (OooO0o) ((OooOO0O) oooO.f21488OooO0O0).OooO0OO();
            }
        }
        GuestAuthToken guestAuthTokenOooO00o = oooO0o == null ? null : oooO0o.OooO00o();
        if (guestAuthTokenOooO00o == null) {
            return o000o.OooO0OO(o0o00o0o);
        }
        o0o00o0o.getClass();
        o0O00O0o.OooO00o oooO00o2 = new o0O00O0o.OooO00o(o0o00o0o);
        OooO00o(oooO00o2, guestAuthTokenOooO00o);
        return o000o.OooO0OO(oooO00o2.OooO0O0());
    }
}
