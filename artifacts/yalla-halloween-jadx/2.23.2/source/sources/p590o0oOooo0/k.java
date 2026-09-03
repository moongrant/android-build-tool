package p590o0oOooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ l f57126OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(0);
        this.f57126OooO0Oo = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        Function0<Unit> function0 = this.f57126OooO0Oo.f57135OooO0o0;
        if (function0 == null) {
            return null;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
