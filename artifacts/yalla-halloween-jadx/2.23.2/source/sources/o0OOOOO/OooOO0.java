package o0OOOOO;

import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.o00O0O;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.core.o0OoOo0;
import com.twitter.sdk.android.core.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOOO.OooO0O0 f42808OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0<o0OOO0o> f42809OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TwitterAuthConfig f42810OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0OOOOO.OooO0O0 f42811OooO00o = new o0OOOOO.OooO0O0();
    }

    public static class OooO0O0 extends com.twitter.sdk.android.core.OooO0O0<o0OOO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OoOo0<o0OOO0o> f42812OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.twitter.sdk.android.core.OooO0O0<o0OOO0o> f42813OooO0O0;

        public OooO0O0(o0OoOo0<o0OOO0o> o0oooo1, com.twitter.sdk.android.core.OooO0O0<o0OOO0o> oooO0O0) {
            this.f42812OooO00o = o0oooo1;
            this.f42813OooO0O0 = oooO0O0;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            o00O0O.OooO0OO().OooO0Oo("Twitter", "Authorization completed with an error", twitterException);
            this.f42813OooO0O0.OooO0OO(twitterException);
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(Oooo0<o0OOO0o> oooo0) {
            o00O0O.OooO0OO().OooO0O0("Twitter", "Authorization completed successfully");
            o0OOO0o o0ooo0o2 = oooo0.f21502OooO00o;
            com.twitter.sdk.android.core.OooOO0O oooOO0O = (com.twitter.sdk.android.core.OooOO0O) this.f42812OooO00o;
            if (o0ooo0o2 == null) {
                oooOO0O.getClass();
                throw new IllegalArgumentException("Session must not be null!");
            }
            oooOO0O.OooO0o0();
            oooOO0O.OooO0Oo(o0ooo0o2.OooO0O0(), o0ooo0o2, true);
            this.f42813OooO0O0.OooO0Oo(oooo0);
        }
    }

    public OooOO0() {
        o0ooOOo.OooO0OO();
        TwitterAuthConfig twitterAuthConfig = o0ooOOo.OooO0OO().f21756OooO0Oo;
        com.twitter.sdk.android.core.OooOO0O oooOO0O = o0ooOOo.OooO0OO().f21753OooO00o;
        this.f42808OooO00o = OooO00o.f42811OooO00o;
        this.f42810OooO0OO = twitterAuthConfig;
        this.f42809OooO0O0 = oooOO0O;
    }
}
