package p472o0OoooOO;

import com.yalla.yalla.open_auth.OooO0OO;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.open_auth.TwitterOAuth;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 extends Lambda implements Function0<TwitterOAuth> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f47906OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(OpenAuthManager openAuthManager) {
        super(0);
        this.f47906OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TwitterOAuth invoke() {
        OpenAuthManager openAuthManager = this.f47906OooO0Oo;
        TwitterOAuth twitterOAuth = new TwitterOAuth(openAuthManager.f24266OooO00o);
        twitterOAuth.f24276OooO0O0 = new OooO0OO(openAuthManager);
        twitterOAuth.f24277OooO0OO = new o0OO00o0(openAuthManager);
        twitterOAuth.f24278OooO0Oo = new o0OO0(openAuthManager);
        return twitterOAuth;
    }
}
