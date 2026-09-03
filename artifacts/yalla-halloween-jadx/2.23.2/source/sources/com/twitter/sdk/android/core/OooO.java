package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OAuth2Service f21487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0<OooO0o> f21488OooO0O0;

    public class OooO00o extends OooO0O0<GuestAuthToken> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f21489OooO00o;

        public OooO00o(CountDownLatch countDownLatch) {
            this.f21489OooO00o = countDownLatch;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            ((OooOO0O) OooO.this.f21488OooO0O0).OooO0O0(0L);
            this.f21489OooO00o.countDown();
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(Oooo0<GuestAuthToken> oooo0) {
            o0OoOo0<OooO0o> o0oooo1 = OooO.this.f21488OooO0O0;
            OooO0o oooO0o = new OooO0o(oooo0.f21502OooO00o);
            OooOO0O oooOO0O = (OooOO0O) o0oooo1;
            oooOO0O.OooO0o0();
            oooOO0O.OooO0Oo(oooO0o.OooO0O0(), oooO0o, true);
            this.f21489OooO00o.countDown();
        }
    }

    public OooO(OAuth2Service oAuth2Service, OooOO0O oooOO0O) {
        this.f21487OooO00o = oAuth2Service;
        this.f21488OooO0O0 = oooOO0O;
    }

    public final void OooO00o() {
        o00O0O.OooO0OO().OooO0O0("GuestSessionProvider", "Refreshing expired guest session.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f21487OooO00o.OooO00o(new OooO00o(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            ((OooOO0O) this.f21488OooO0O0).OooO0O0(0L);
        }
    }
}
