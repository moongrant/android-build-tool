package oO0OO;

import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends Lambda implements Function0<o00Ooo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f52743Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(OpenAuthManager openAuthManager) {
        super(0);
        this.f52743Oooo0o = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o00Ooo invoke() {
        o00Ooo o00ooo2 = new o00Ooo(this.f52743Oooo0o.f21647OooO00o);
        OpenAuthManager openAuthManager = this.f52743Oooo0o;
        o00ooo2.f52746OooO0O0 = new Oooo0(openAuthManager);
        o00ooo2.f52747OooO0OO = new o000oOoO(openAuthManager);
        new o0OoOo0(openAuthManager);
        return o00ooo2;
    }
}
