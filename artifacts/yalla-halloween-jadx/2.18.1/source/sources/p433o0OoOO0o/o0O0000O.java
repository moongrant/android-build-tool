package p433o0OoOO0o;

import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OAuth2Service f39922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00OOO<o0O00000> f39923OooO0O0;

    public class OooO00o extends o0O0o<GuestAuthToken> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f39924OooO00o;

        public OooO00o(CountDownLatch countDownLatch) {
            this.f39924OooO00o = countDownLatch;
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0OO(TwitterException twitterException) {
            ((o0O000O) o0O0000O.this.f39923OooO0O0).OooO0O0(0L);
            this.f39924OooO00o.countDown();
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0Oo(o0O00O<GuestAuthToken> o0o00o2) {
            ((o0O000O) o0O0000O.this.f39923OooO0O0).OooO0oO(new o0O00000(o0o00o2.f39934OooO00o));
            this.f39924OooO00o.countDown();
        }
    }

    public o0O0000O(OAuth2Service oAuth2Service, o0O00OOO<o0O00000> o0o00ooo2) {
        this.f39922OooO00o = oAuth2Service;
        this.f39923OooO0O0 = o0o00ooo2;
    }

    public final void OooO00o() {
        o0oO0Ooo.OooO0OO().OooO0OO("GuestSessionProvider", "Refreshing expired guest session.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f39922OooO00o.OooO00o(new OooO00o(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            ((o0O000O) this.f39923OooO0O0).OooO0O0(0L);
        }
    }
}
