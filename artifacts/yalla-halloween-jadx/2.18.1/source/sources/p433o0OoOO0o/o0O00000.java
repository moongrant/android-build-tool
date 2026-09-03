package p433o0OoOO0o;

import android.text.TextUtils;
import com.twitter.sdk.android.core.AuthTokenAdapter;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import p386o0OOoo0O.o00;
import p386o0OOoo0O.o000OOo0;
import p434o0OoOOO.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00000 extends o0O00OO<GuestAuthToken> {

    public static class OooO00o implements o0000oo<o0O00000> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOo0 f39921OooO00o;

        public OooO00o() {
            o00 o00Var = new o00();
            o00Var.OooO0O0(GuestAuthToken.class, new AuthTokenAdapter());
            this.f39921OooO00o = o00Var.OooO00o();
        }

        @Override // p434o0OoOOO.o0000oo
        public final o0O00000 OooO00o(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (o0O00000) this.f39921OooO00o.OooO0OO(str, o0O00000.class);
                } catch (Exception e) {
                    o0O000 o0o000OooO0OO = o0oO0Ooo.OooO0OO();
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to deserialize session ");
                    sbOooO0o0.append(e.getMessage());
                    o0o000OooO0OO.OooO0OO("Twitter", sbOooO0o0.toString());
                }
            }
            return null;
        }

        @Override // p434o0OoOOO.o0000oo
        public final String OooO0O0(o0O00000 o0o00000) {
            o0O00000 o0o00001 = o0o00000;
            if (o0o00001 != null && o0o00001.OooO00o() != null) {
                try {
                    return this.f39921OooO00o.OooO0oo(o0o00001);
                } catch (Exception e) {
                    o0O000 o0o000OooO0OO = o0oO0Ooo.OooO0OO();
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to serialize session ");
                    sbOooO0o0.append(e.getMessage());
                    o0o000OooO0OO.OooO0OO("Twitter", sbOooO0o0.toString());
                }
            }
            return "";
        }
    }

    public o0O00000(GuestAuthToken guestAuthToken) {
        super(guestAuthToken, 0L);
    }
}
