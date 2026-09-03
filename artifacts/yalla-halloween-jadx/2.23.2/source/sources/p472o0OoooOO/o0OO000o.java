package p472o0OoooOO;

import com.yalla.yalla.open_auth.FecebookOAuth;
import com.yalla.yalla.open_auth.OooO00o;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function0<FecebookOAuth> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f47903OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(OpenAuthManager openAuthManager) {
        super(0);
        this.f47903OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FecebookOAuth invoke() {
        OpenAuthManager openAuthManager = this.f47903OooO0Oo;
        FecebookOAuth fecebookOAuth = new FecebookOAuth(openAuthManager.f24266OooO00o);
        fecebookOAuth.f24251OooO0OO = new OooO00o(openAuthManager);
        fecebookOAuth.f24252OooO0Oo = new o0O(openAuthManager);
        fecebookOAuth.f24253OooO0o0 = new o0OO000(openAuthManager);
        return fecebookOAuth;
    }
}
