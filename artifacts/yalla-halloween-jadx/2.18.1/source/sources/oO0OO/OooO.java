package oO0OO;

import com.yalla.yalla.open_auth.FecebookOAuth;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends Lambda implements Function0<FecebookOAuth> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f52728Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OpenAuthManager openAuthManager) {
        super(0);
        this.f52728Oooo0o = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FecebookOAuth invoke() {
        FecebookOAuth fecebookOAuth = new FecebookOAuth(this.f52728Oooo0o.f21647OooO00o);
        OpenAuthManager openAuthManager = this.f52728Oooo0o;
        fecebookOAuth.f21636OooO0OO = new OooO0O0(openAuthManager);
        fecebookOAuth.f21637OooO0Oo = new OooO0OO(openAuthManager);
        fecebookOAuth.f21638OooO0o0 = new OooO0o(openAuthManager);
        return fecebookOAuth;
    }
}
