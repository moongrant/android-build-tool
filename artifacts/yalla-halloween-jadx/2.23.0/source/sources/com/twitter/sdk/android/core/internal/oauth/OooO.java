package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends com.twitter.sdk.android.core.OooO0O0<OAuth2Token> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.twitter.sdk.android.core.OooO0O0 f22007OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OAuth2Service f22008OooO0O0;

    public class OooO00o extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.internal.oauth.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OAuth2Token f22009OooO00o;

        public OooO00o(OAuth2Token oAuth2Token) {
            this.f22009OooO00o = oAuth2Token;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            o00Oo0.OooO0OO().OooO0Oo("Twitter", "Your app may not allow guest auth. Please talk to us regarding upgrading your consumer key.", twitterException);
            OooO.this.f22007OooO00o.OooO0OO(twitterException);
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(o000oOoO<com.twitter.sdk.android.core.internal.oauth.OooO00o> o000oooo2) {
            OAuth2Token oAuth2Token = this.f22009OooO00o;
            OooO.this.f22007OooO00o.OooO0Oo(new o000oOoO(new GuestAuthToken(oAuth2Token.OooO0O0(), oAuth2Token.OooO00o(), o000oooo2.f22205OooO00o.f22011OooO00o), null));
        }
    }

    public OooO(OAuth2Service oAuth2Service, com.twitter.sdk.android.core.OooO.OooO00o oooO00o) {
        this.f22008OooO0O0 = oAuth2Service;
        this.f22007OooO00o = oooO00o;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        o00Oo0.OooO0OO().OooO0Oo("Twitter", "Failed to get app auth token", twitterException);
        com.twitter.sdk.android.core.OooO0O0 oooO0O0 = this.f22007OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(twitterException);
        }
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(o000oOoO<OAuth2Token> o000oooo2) {
        OAuth2Token oAuth2Token = o000oooo2.f22205OooO00o;
        OooO00o oooO00o = new OooO00o(oAuth2Token);
        OAuth2Service oAuth2Service = this.f22008OooO0O0;
        oAuth2Service.getClass();
        oAuth2Service.f22001OooO0o0.getGuestToken("Bearer " + oAuth2Token.OooO00o()).OooOooO(oooO00o);
    }
}
