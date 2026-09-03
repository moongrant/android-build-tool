package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends com.twitter.sdk.android.core.OooO0O0<OAuth2Token> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.twitter.sdk.android.core.OooO0O0 f21543OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OAuth2Service f21544OooO0O0;

    public class OooO00o extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.internal.oauth.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OAuth2Token f21545OooO00o;

        public OooO00o(OAuth2Token oAuth2Token) {
            this.f21545OooO00o = oAuth2Token;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            o00O0O.OooO0OO().OooO0Oo("Twitter", "Your app may not allow guest auth. Please talk to us regarding upgrading your consumer key.", twitterException);
            OooO0o.this.f21543OooO00o.OooO0OO(twitterException);
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(Oooo0<com.twitter.sdk.android.core.internal.oauth.OooO00o> oooo0) {
            OAuth2Token oAuth2Token = this.f21545OooO00o;
            OooO0o.this.f21543OooO00o.OooO0Oo(new Oooo0(new GuestAuthToken(oAuth2Token.OooO0O0(), oAuth2Token.OooO00o(), oooo0.f21502OooO00o.f21537OooO00o), null));
        }
    }

    public OooO0o(OAuth2Service oAuth2Service, com.twitter.sdk.android.core.OooO.OooO00o oooO00o) {
        this.f21544OooO0O0 = oAuth2Service;
        this.f21543OooO00o = oooO00o;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        o00O0O.OooO0OO().OooO0Oo("Twitter", "Failed to get app auth token", twitterException);
        com.twitter.sdk.android.core.OooO0O0 oooO0O0 = this.f21543OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(twitterException);
        }
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(Oooo0<OAuth2Token> oooo0) {
        OAuth2Token oAuth2Token = oooo0.f21502OooO00o;
        OooO00o oooO00o = new OooO00o(oAuth2Token);
        OAuth2Service oAuth2Service = this.f21544OooO0O0;
        oAuth2Service.getClass();
        oAuth2Service.f21530OooO0o0.getGuestToken("Bearer " + oAuth2Token.OooO00o()).OooOooo(oooO00o);
    }
}
