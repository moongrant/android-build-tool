package p431o0OoOO;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import p433o0OoOO0o.o0O000O;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O00OOO;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0O0oo0o;
import p433o0OoOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f39909OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00OOO<o0O0O0Oo> f39910OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TwitterAuthConfig f39911OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Oooo000 f39912OooO00o = new Oooo000();
    }

    public static class OooO0O0 extends o0O0o<o0O0O0Oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O00OOO<o0O0O0Oo> f39913OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O0o<o0O0O0Oo> f39914OooO0O0;

        public OooO0O0(o0O00OOO<o0O0O0Oo> o0o00ooo2, o0O0o<o0O0O0Oo> o0o0o) {
            this.f39913OooO00o = o0o00ooo2;
            this.f39914OooO0O0 = o0o0o;
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0OO(TwitterException twitterException) {
            o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Authorization completed with an error", twitterException);
            this.f39914OooO0O0.OooO0OO(twitterException);
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0Oo(o0O00O<o0O0O0Oo> o0o00o2) {
            o0oO0Ooo.OooO0OO().OooO0OO("Twitter", "Authorization completed successfully");
            ((o0O000O) this.f39913OooO00o).OooO0oO(o0o00o2.f39934OooO00o);
            this.f39914OooO0O0.OooO0Oo(o0o00o2);
        }
    }

    public o00O0O() {
        o0O0oo0o.OooO0OO();
        TwitterAuthConfig twitterAuthConfig = o0O0oo0o.OooO0OO().f39952OooO0Oo;
        o0O00OOO<o0O0O0Oo> o0o00ooo2 = o0O0oo0o.OooO0OO().f39949OooO00o;
        this.f39909OooO00o = OooO00o.f39912OooO00o;
        this.f39911OooO0OO = twitterAuthConfig;
        this.f39910OooO0O0 = o0o00ooo2;
    }
}
