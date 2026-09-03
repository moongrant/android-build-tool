package o0OOOOO0;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.identity.OAuthActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends OooO00o {
    @Override // o0OOOOO0.OooO00o
    public final boolean OooO00o(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) OAuthActivity.class);
        intent.putExtra("auth_config", this.f43644OooO0O0);
        activity.startActivityForResult(intent, this.f43643OooO00o);
        return true;
    }
}
