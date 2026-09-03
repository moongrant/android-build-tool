package p465o0Oooo0;

import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f46871OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(OpenAuthManager openAuthManager) {
        super(0);
        this.f46871OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.f46871OooO0Oo.f24731OooO0OO;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
