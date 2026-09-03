package p465o0Oooo0;

import com.yalla.yalla.open_auth.OooO0o;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function0<o000O0O0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f46880OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(OpenAuthManager openAuthManager) {
        super(0);
        this.f46880OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o000O0O0 invoke() {
        OpenAuthManager openAuthManager = this.f46880OooO0Oo;
        o000O0O0 o000o0o1 = new o000O0O0(openAuthManager.f24729OooO00o);
        o000o0o1.f46876OooO0O0 = new OooO0o(openAuthManager);
        o000o0o1.f46877OooO0OO = new o000O00O(openAuthManager);
        new o000O0(openAuthManager);
        return o000o0o1;
    }
}
