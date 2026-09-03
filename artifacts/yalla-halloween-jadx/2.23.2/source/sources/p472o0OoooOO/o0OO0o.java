package p472o0OoooOO;

import com.yalla.yalla.open_auth.OooO0o;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o extends Lambda implements Function0<o0OOO00> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f47907OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(OpenAuthManager openAuthManager) {
        super(0);
        this.f47907OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o0OOO00 invoke() {
        OpenAuthManager openAuthManager = this.f47907OooO0Oo;
        o0OOO00 o0ooo00 = new o0OOO00(openAuthManager.f24266OooO00o);
        o0ooo00.f47911OooO0O0 = new OooO0o(openAuthManager);
        o0ooo00.f47912OooO0OO = new o0OOooO0(openAuthManager);
        new o0OO0o00(openAuthManager);
        return o0ooo00;
    }
}
