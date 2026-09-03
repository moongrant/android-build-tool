package p630o0ooO00;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p089o000o000.o00O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0Oo extends Lambda implements Function0<o00O00o0<Integer, Object>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0<Object> f48694Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o000O0<Object> o000o0) {
        super(0);
        this.f48694Oooo0o = o000o0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o00O00o0<Integer, Object> invoke() {
        o000O0<Object> o000o0 = this.f48694Oooo0o;
        o000o0.f48685OooO0oO = new o000O0.OooO00o();
        o000O0<Object>.OooO00o oooO00o = this.f48694Oooo0o.f48685OooO0oO;
        if (oooO00o != null) {
            return oooO00o;
        }
        Intrinsics.throwUninitializedPropertyAccessException("innerPagingSource");
        return null;
    }
}
