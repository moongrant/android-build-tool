package oO0OO;

import com.yalla.yalla.open_auth.InstagramOAuth;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends Lambda implements Function0<InstagramOAuth> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f52735Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OpenAuthManager openAuthManager) {
        super(0);
        this.f52735Oooo0o = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InstagramOAuth invoke() {
        InstagramOAuth instagramOAuth = new InstagramOAuth(this.f52735Oooo0o.f21647OooO00o);
        OpenAuthManager openAuthManager = this.f52735Oooo0o;
        instagramOAuth.f21642OooO0O0 = new OooOO0(openAuthManager);
        instagramOAuth.f21643OooO0OO = new OooOO0O(openAuthManager);
        new OooOOO0(openAuthManager);
        return instagramOAuth;
    }
}
