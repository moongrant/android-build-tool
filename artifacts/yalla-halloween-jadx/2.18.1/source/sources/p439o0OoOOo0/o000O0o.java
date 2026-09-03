package p439o0OoOOo0;

import com.twitter.sdk.android.core.TwitterException;
import p433o0OoOO0o.o0O000;
import p433o0OoOO0o.o0O0o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000O0o<T> extends o0O0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0o f40145OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O000 f40146OooO0O0;

    public o000O0o(o0O0o o0o0o, o0O000 o0o001) {
        this.f40145OooO00o = o0o0o;
        this.f40146OooO0O0 = o0o001;
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0OO(TwitterException twitterException) {
        this.f40146OooO0O0.OooO0O0("TweetUi", twitterException.getMessage(), twitterException);
        o0O0o o0o0o = this.f40145OooO00o;
        if (o0o0o != null) {
            o0o0o.OooO0OO(twitterException);
        }
    }
}
