package p431o0OoOO;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.identity.OAuthActivity;
import p433o0OoOO0o.o0O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends OooOo {
    public Oooo0(TwitterAuthConfig twitterAuthConfig, o0O0o o0o0o) {
        super(twitterAuthConfig, o0o0o);
    }

    @Override // p431o0OoOO.OooOo
    public final boolean OooO00o(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) OAuthActivity.class);
        intent.putExtra("auth_config", this.f39906OooO0O0);
        activity.startActivityForResult(intent, this.f39905OooO00o);
        return true;
    }
}
