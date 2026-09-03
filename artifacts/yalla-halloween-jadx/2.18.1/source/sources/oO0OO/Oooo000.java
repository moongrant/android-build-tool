package oO0OO;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.open_auth.TwitterOAuth;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends Lambda implements Function0<TwitterOAuth> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f52741Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(OpenAuthManager openAuthManager) {
        super(0);
        this.f52741Oooo0o = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TwitterOAuth invoke() {
        TwitterOAuth twitterOAuth = new TwitterOAuth(this.f52741Oooo0o.f21647OooO00o);
        OpenAuthManager openAuthManager = this.f52741Oooo0o;
        twitterOAuth.f21657OooO0O0 = new OooOOOO(openAuthManager);
        new OooOo00(openAuthManager);
        twitterOAuth.f21658OooO0OO = new OooOo(openAuthManager);
        return twitterOAuth;
    }
}
