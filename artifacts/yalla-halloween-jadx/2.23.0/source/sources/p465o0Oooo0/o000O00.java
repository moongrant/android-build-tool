package p465o0Oooo0;

import com.yalla.yalla.open_auth.OooO0OO;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.open_auth.TwitterOAuth;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends Lambda implements Function0<TwitterOAuth> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f46872OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(OpenAuthManager openAuthManager) {
        super(0);
        this.f46872OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TwitterOAuth invoke() {
        OpenAuthManager openAuthManager = this.f46872OooO0Oo;
        TwitterOAuth twitterOAuth = new TwitterOAuth(openAuthManager.f24729OooO00o);
        twitterOAuth.f24739OooO0O0 = new OooO0OO(openAuthManager);
        twitterOAuth.f24740OooO0OO = new o000O0o(openAuthManager);
        twitterOAuth.f24741OooO0Oo = new o000Oo0(openAuthManager);
        return twitterOAuth;
    }
}
