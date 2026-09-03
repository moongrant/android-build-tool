package p345o0OOOOo;

import com.twitter.sdk.android.core.OooO0O0;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.OooOOO;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o0Oo0oo;
import com.twitter.sdk.android.tweetcomposer.TweetUploadService;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends OooO0O0<OooOOO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f43664OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f43665OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ TweetUploadService f43666OooO0OO;

    public o0ooOOo(TweetUploadService tweetUploadService, o0Oo0oo o0oo0oo2, String str) {
        this.f43666OooO0OO = tweetUploadService;
        this.f43664OooO00o = o0oo0oo2;
        this.f43665OooO0O0 = str;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        this.f43666OooO0OO.OooO00o(twitterException);
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(o000oOoO<OooOOO> o000oooo2) {
        String str = o000oooo2.f22205OooO00o.f22057OooO0O0;
        this.f43666OooO0OO.OooO0O0(this.f43664OooO00o, this.f43665OooO0O0, str);
    }
}
