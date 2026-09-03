package oO0OO;

import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f52731Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OpenAuthManager openAuthManager) {
        super(0);
        this.f52731Oooo0o = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.f52731Oooo0o.f21650OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
