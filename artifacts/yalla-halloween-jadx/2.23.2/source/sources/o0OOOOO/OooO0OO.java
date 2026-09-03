package o0OOOOO;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.identity.OAuthActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends OooO00o {
    @Override // o0OOOOO.OooO00o
    public final boolean OooO00o(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) OAuthActivity.class);
        intent.putExtra("auth_config", this.f42805OooO0O0);
        activity.startActivityForResult(intent, this.f42804OooO00o);
        return true;
    }
}
