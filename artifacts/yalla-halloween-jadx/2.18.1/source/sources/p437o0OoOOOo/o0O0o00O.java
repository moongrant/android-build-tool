package p437o0OoOOOo;

import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.tweetcomposer.TweetUploadService;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0o;
import p436o0OoOOOO.o0O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o00O extends o0O0o<o0O00O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0O0Oo f40087OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f40088OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ TweetUploadService f40089OooO0OO;

    public o0O0o00O(TweetUploadService tweetUploadService, o0O0O0Oo o0o0o0oo, String str) {
        this.f40089OooO0OO = tweetUploadService;
        this.f40087OooO00o = o0o0o0oo;
        this.f40088OooO0O0 = str;
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0OO(TwitterException twitterException) {
        this.f40089OooO0OO.OooO00o(twitterException);
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0Oo(p433o0OoOO0o.o0O00O<o0O00O> o0o00o2) {
        this.f40089OooO0OO.OooO0O0(this.f40087OooO00o, this.f40088OooO0O0, o0o00o2.f39934OooO00o.f39984OooO0O0);
    }
}
