package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends o000oOoO<GuestAuthToken> {

    public static class OooO00o implements p348o0OOOOo.OooOo00<OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.gson.OooOOO0 f21493OooO00o;

        public OooO00o() {
            com.google.gson.OooOOO oooOOO = new com.google.gson.OooOOO();
            oooOOO.OooO0O0(new AuthTokenAdapter(), GuestAuthToken.class);
            this.f21493OooO00o = oooOOO.OooO00o();
        }

        @Override // p348o0OOOOo.OooOo00
        public final OooO0o OooO00o(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (OooO0o) this.f21493OooO00o.OooO0OO(str, OooO0o.class);
                } catch (Exception e) {
                    o00O0O.OooO0OO().OooO0O0("Twitter", "Failed to deserialize session " + e.getMessage());
                }
            }
            return null;
        }

        @Override // p348o0OOOOo.OooOo00
        public final String OooO0O0(OooO0o oooO0o) {
            OooO0o oooO0o2 = oooO0o;
            if (oooO0o2 != null && oooO0o2.OooO00o() != null) {
                try {
                    return this.f21493OooO00o.OooO0oo(oooO0o2);
                } catch (Exception e) {
                    o00O0O.OooO0OO().OooO0O0("Twitter", "Failed to serialize session " + e.getMessage());
                }
            }
            return "";
        }
    }

    public OooO0o(GuestAuthToken guestAuthToken) {
        super(guestAuthToken, 0L);
    }
}
