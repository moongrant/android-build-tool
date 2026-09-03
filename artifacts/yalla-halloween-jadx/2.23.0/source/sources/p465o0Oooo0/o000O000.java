package p465o0Oooo0;

import com.yalla.yalla.open_auth.InstagramOAuth;
import com.yalla.yalla.open_auth.OooO0O0;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function0<InstagramOAuth> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f46873OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(OpenAuthManager openAuthManager) {
        super(0);
        this.f46873OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InstagramOAuth invoke() {
        OpenAuthManager openAuthManager = this.f46873OooO0Oo;
        InstagramOAuth instagramOAuth = new InstagramOAuth(openAuthManager.f24729OooO00o);
        instagramOAuth.f24720OooO0O0 = new OooO0O0(openAuthManager);
        instagramOAuth.f24721OooO0OO = new o0000OO0(openAuthManager);
        new o000(openAuthManager);
        return instagramOAuth;
    }
}
