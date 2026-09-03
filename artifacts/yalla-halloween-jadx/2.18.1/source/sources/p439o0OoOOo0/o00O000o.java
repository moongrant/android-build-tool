package p439o0OoOOo0;

import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O0o;
import p436o0OoOOOO.o0O00OOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o extends o0O0o<o0O00OOO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BaseTweetView f40153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O00 f40154OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0o<o0O00OOO> f40155OooO0OO;

    public o00O000o(BaseTweetView baseTweetView, o00O0O00 o00o0o01, o0O0o<o0O00OOO> o0o0o) {
        this.f40153OooO00o = baseTweetView;
        this.f40154OooO0O0 = o00o0o01;
        this.f40155OooO0OO = o0o0o;
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0OO(TwitterException twitterException) {
        o0O0o<o0O00OOO> o0o0o = this.f40155OooO0OO;
        if (o0o0o != null) {
            o0o0o.OooO0OO(twitterException);
        }
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0Oo(o0O00O<o0O00OOO> o0o00o2) {
        o00O0O00 o00o0o01 = this.f40154OooO0O0;
        o0O00OOO o0o00ooo2 = o0o00o2.f39934OooO00o;
        o00o0o01.f40167OooO0Oo.put(Long.valueOf(o0o00ooo2.f40002OooO), o0o00ooo2);
        this.f40153OooO00o.setTweet(o0o00o2.f39934OooO00o);
        o0O0o<o0O00OOO> o0o0o = this.f40155OooO0OO;
        if (o0o0o != null) {
            o0o0o.OooO0Oo(o0o00o2);
        }
    }
}
