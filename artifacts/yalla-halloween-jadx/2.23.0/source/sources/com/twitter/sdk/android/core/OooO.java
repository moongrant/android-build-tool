package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OAuth2Service f21960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O<OooO0o> f21961OooO0O0;

    public class OooO00o extends OooO0O0<GuestAuthToken> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f21962OooO00o;

        public OooO00o(CountDownLatch countDownLatch) {
            this.f21962OooO00o = countDownLatch;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            ((OooOOO0) OooO.this.f21961OooO0O0).OooO0O0(0L);
            this.f21962OooO00o.countDown();
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(o000oOoO<GuestAuthToken> o000oooo2) {
            o00O0O<OooO0o> o00o0o2 = OooO.this.f21961OooO0O0;
            OooO0o oooO0o = new OooO0o(o000oooo2.f22205OooO00o);
            OooOOO0 oooOOO0 = (OooOOO0) o00o0o2;
            oooOOO0.OooO0o0();
            oooOOO0.OooO0Oo(oooO0o.OooO0O0(), oooO0o, true);
            this.f21962OooO00o.countDown();
        }
    }

    public OooO(OAuth2Service oAuth2Service, OooOOO0 oooOOO0) {
        this.f21960OooO00o = oAuth2Service;
        this.f21961OooO0O0 = oooOOO0;
    }

    public final void OooO00o() {
        o00Oo0.OooO0OO().OooO0O0("GuestSessionProvider", "Refreshing expired guest session.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f21960OooO00o.OooO00o(new OooO00o(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            ((OooOOO0) this.f21961OooO0O0).OooO0O0(0L);
        }
    }
}
