package p465o0Oooo0;

import com.yalla.yalla.open_auth.FecebookOAuth;
import com.yalla.yalla.open_auth.OooO00o;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function0<FecebookOAuth> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f46867OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(OpenAuthManager openAuthManager) {
        super(0);
        this.f46867OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FecebookOAuth invoke() {
        OpenAuthManager openAuthManager = this.f46867OooO0Oo;
        FecebookOAuth fecebookOAuth = new FecebookOAuth(openAuthManager.f24729OooO00o);
        fecebookOAuth.f24714OooO0OO = new OooO00o(openAuthManager);
        fecebookOAuth.f24715OooO0Oo = new o0000O0O(openAuthManager);
        fecebookOAuth.f24716OooO0o0 = new o000OO(openAuthManager);
        return fecebookOAuth;
    }
}
