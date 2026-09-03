package p435o0OoOOO0;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import p433o0OoOO0o.o0O00000;
import p433o0OoOO0o.o0O0000O;
import p433o0OoOO0o.o0O000O;
import p660o0ooo0o0.o000OOo0;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements o000OOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0000O f39973OooO0O0;

    public o000OOo(o0O0000O o0o0000o2) {
        this.f39973OooO0O0 = o0o0000o2;
    }

    @Override // p660o0ooo0o0.o000OOo0
    public final o00OOO00 authenticate(o00Oo00 o00oo00, o00OOOO0 o00oooo1) throws IOException {
        o0O00000 o0o00000;
        o00OOOO0 o00oooo2 = o00oooo1;
        int i = 1;
        while (true) {
            o00oooo2 = o00oooo2.f51446OoooOOO;
            if (o00oooo2 == null) {
                break;
            }
            i++;
        }
        if (!(i < 2)) {
            return null;
        }
        o0O0000O o0o0000o2 = this.f39973OooO0O0;
        o00O o00o2 = o00oooo1.f51439Oooo0oO.f51427OooO0Oo;
        String strOooO00o = o00o2.OooO00o("Authorization");
        String strOooO00o2 = o00o2.OooO00o("x-guest-token");
        o0O00000 o0o00001 = (strOooO00o == null || strOooO00o2 == null) ? null : new o0O00000(new GuestAuthToken("bearer", strOooO00o.replace("bearer ", ""), strOooO00o2));
        synchronized (o0o0000o2) {
            o0O00000 o0o00002 = (o0O00000) ((o0O000O) o0o0000o2.f39923OooO0O0).OooO0OO();
            if (o0o00001 != null && o0o00001.equals(o0o00002)) {
                o0o0000o2.OooO00o();
            }
            o0o00000 = (o0O00000) ((o0O000O) o0o0000o2.f39923OooO0O0).OooO0OO();
        }
        GuestAuthToken guestAuthTokenOooO00o = o0o00000 == null ? null : o0o00000.OooO00o();
        if (guestAuthTokenOooO00o == null) {
            return null;
        }
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o(o00oooo1.f51439Oooo0oO);
        oo0o0Oo.OooO00o(oooO00o, guestAuthTokenOooO00o);
        return oooO00o.OooO0O0();
    }
}
