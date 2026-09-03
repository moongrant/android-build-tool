package o0OOOOO0;

import com.twitter.sdk.android.core.OooOOO0;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o00O0O;
import com.twitter.sdk.android.core.o00Oo0;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.core.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOOO0.OooO0O0 f43647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O<o0Oo0oo> f43648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TwitterAuthConfig f43649OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0OOOOO0.OooO0O0 f43650OooO00o = new o0OOOOO0.OooO0O0();
    }

    public static class OooO0O0 extends com.twitter.sdk.android.core.OooO0O0<o0Oo0oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O0O<o0Oo0oo> f43651OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.twitter.sdk.android.core.OooO0O0<o0Oo0oo> f43652OooO0O0;

        public OooO0O0(o00O0O<o0Oo0oo> o00o0o2, com.twitter.sdk.android.core.OooO0O0<o0Oo0oo> oooO0O0) {
            this.f43651OooO00o = o00o0o2;
            this.f43652OooO0O0 = oooO0O0;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            o00Oo0.OooO0OO().OooO0Oo("Twitter", "Authorization completed with an error", twitterException);
            this.f43652OooO0O0.OooO0OO(twitterException);
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(o000oOoO<o0Oo0oo> o000oooo2) {
            o00Oo0.OooO0OO().OooO0O0("Twitter", "Authorization completed successfully");
            o0Oo0oo o0oo0oo2 = o000oooo2.f22205OooO00o;
            OooOOO0 oooOOO0 = (OooOOO0) this.f43651OooO00o;
            if (o0oo0oo2 == null) {
                oooOOO0.getClass();
                throw new IllegalArgumentException("Session must not be null!");
            }
            oooOOO0.OooO0o0();
            oooOOO0.OooO0Oo(o0oo0oo2.OooO0O0(), o0oo0oo2, true);
            this.f43652OooO0O0.OooO0Oo(o000oooo2);
        }
    }

    public OooOO0() {
        o0OOO0o.OooO0OO();
        TwitterAuthConfig twitterAuthConfig = o0OOO0o.OooO0OO().f22223OooO0Oo;
        OooOOO0 oooOOO0 = o0OOO0o.OooO0OO().f22220OooO00o;
        this.f43647OooO00o = OooO00o.f43650OooO00o;
        this.f43649OooO0OO = twitterAuthConfig;
        this.f43648OooO0O0 = oooOOO0;
    }
}
