package p472o0OoooOO;

import com.yalla.yalla.open_auth.InstagramOAuth;
import com.yalla.yalla.open_auth.OooO0O0;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends Lambda implements Function0<InstagramOAuth> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f47904OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(OpenAuthManager openAuthManager) {
        super(0);
        this.f47904OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InstagramOAuth invoke() {
        OpenAuthManager openAuthManager = this.f47904OooO0Oo;
        InstagramOAuth instagramOAuth = new InstagramOAuth(openAuthManager.f24266OooO00o);
        instagramOAuth.f24257OooO0O0 = new OooO0O0(openAuthManager);
        instagramOAuth.f24258OooO0OO = new oo0oO0(openAuthManager);
        new oo0ooO(openAuthManager);
        return instagramOAuth;
    }
}
