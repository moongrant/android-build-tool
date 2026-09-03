package p435o0OoOOO0;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import java.util.Objects;
import p433o0OoOO0o.o0O00000;
import p433o0OoOO0o.o0O0000O;
import p433o0OoOO0o.o0O000O;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0000O f39974OooO00o;

    public oo0o0Oo(o0O0000O o0o0000o2) {
        this.f39974OooO00o = o0o0000o2;
    }

    public static void OooO00o(o00OOO00.OooO00o oooO00o, GuestAuthToken guestAuthToken) {
        oooO00o.OooO0o0("Authorization", guestAuthToken.OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + guestAuthToken.OooO00o());
        oooO00o.OooO0o0("x-guest-token", guestAuthToken.OooO0OO());
    }

    @Override // p660o0ooo0o0.o00OO00O
    public final o00OOOO0 intercept(o00OO00O.OooO00o oooO00o) throws IOException {
        o0O00000 o0o00000;
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        o0O0000O o0o0000o2 = this.f39974OooO00o;
        synchronized (o0o0000o2) {
            o0o00000 = (o0O00000) ((o0O000O) o0o0000o2.f39923OooO0O0).OooO0OO();
            boolean z = false;
            if (o0o00000 != null && o0o00000.OooO00o() != null) {
                GuestAuthToken guestAuthTokenOooO00o = o0o00000.OooO00o();
                Objects.requireNonNull(guestAuthTokenOooO00o);
                if (!(System.currentTimeMillis() >= guestAuthTokenOooO00o.f39966Oooo0o + 10800000)) {
                    z = true;
                }
            }
            if (!z) {
                o0o0000o2.OooO00o();
                o0o00000 = (o0O00000) ((o0O000O) o0o0000o2.f39923OooO0O0).OooO0OO();
            }
        }
        GuestAuthToken guestAuthTokenOooO00o2 = o0o00000 == null ? null : o0o00000.OooO00o();
        if (guestAuthTokenOooO00o2 == null) {
            return ooo00o0o.OooO0O0(o00ooo01);
        }
        o00OOO00.OooO00o oooO00o2 = new o00OOO00.OooO00o(o00ooo01);
        OooO00o(oooO00o2, guestAuthTokenOooO00o2);
        return ooo00o0o.OooO0O0(oooO00o2.OooO0O0());
    }
}
