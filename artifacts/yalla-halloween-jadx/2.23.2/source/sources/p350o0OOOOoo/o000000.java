package p350o0OOOOoo;

import com.twitter.sdk.android.core.OooO0O0;
import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.OooOOO;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.tweetcomposer.TweetUploadService;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 extends OooO0O0<OooOOO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f42851OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f42852OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ TweetUploadService f42853OooO0OO;

    public o000000(TweetUploadService tweetUploadService, o0OOO0o o0ooo0o2, String str) {
        this.f42853OooO0OO = tweetUploadService;
        this.f42851OooO00o = o0ooo0o2;
        this.f42852OooO0O0 = str;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        this.f42853OooO0OO.OooO00o(twitterException);
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(Oooo0<OooOOO> oooo0) {
        String str = oooo0.f21502OooO00o.f21586OooO0O0;
        this.f42853OooO0OO.OooO0O0(this.f42851OooO00o, this.f42852OooO0O0, str);
    }
}
