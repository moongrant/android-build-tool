package p439o0OoOOo0;

import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import java.util.Locale;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0oO0Ooo;
import p436o0OoOOOO.o0O00OOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 extends o0O0o<o0O00OOO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f40116OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseTweetView f40117OooO0O0;

    public o0000(BaseTweetView baseTweetView, long j) {
        this.f40117OooO0O0 = baseTweetView;
        this.f40116OooO00o = j;
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0OO(TwitterException twitterException) {
        o0oO0Ooo.OooO0OO().OooO0OO("TweetUi", String.format(Locale.ENGLISH, "loadTweet failure for Tweet Id %d.", Long.valueOf(this.f40116OooO00o)));
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0Oo(o0O00O<o0O00OOO> o0o00o2) {
        this.f40117OooO0O0.setTweet(o0o00o2.f39934OooO00o);
    }
}
