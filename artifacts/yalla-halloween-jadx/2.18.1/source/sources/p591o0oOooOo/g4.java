package p591o0oOooOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f47241Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(Function0<Unit> function0) {
        super(0);
        this.f47241Oooo0o = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        Function0<Unit> function0 = this.f47241Oooo0o;
        if (function0 == null) {
            return null;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
