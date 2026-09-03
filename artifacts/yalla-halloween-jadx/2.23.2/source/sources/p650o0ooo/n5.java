package p650o0ooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.Nullable;
import p590o0oOooo0.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class n5 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58419OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(Function0<Unit> function0) {
        super(0);
        this.f58419OooO0Oo = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        k0.OooO00o(true, false, null);
        OooO00o.OooO0O0("102325");
        Function0<Unit> function0 = this.f58419OooO0Oo;
        if (function0 == null) {
            return null;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
