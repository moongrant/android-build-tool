package p433o0OoOO0o;

import com.twitter.sdk.android.core.TwitterApiException;
import com.twitter.sdk.android.core.TwitterException;
import retrofit2.OooO0O0;
import retrofit2.OooO0o;
import retrofit2.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0O0o<T> implements OooO0o<T> {
    @Override // retrofit2.OooO0o
    public final void OooO00o(Throwable th) {
        OooO0OO(new TwitterException("Request Failure", th));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(OooO0O0<T> oooO0O0, oo0o0Oo<T> oo0o0oo) {
        if (oo0o0oo.OooO00o()) {
            OooO0Oo(new o0O00O<>(oo0o0oo.f53907OooO0O0, oo0o0oo));
        } else {
            OooO0OO(new TwitterApiException(oo0o0oo));
        }
    }

    public abstract void OooO0OO(TwitterException twitterException);

    public abstract void OooO0Oo(o0O00O<T> o0o00o2);
}
