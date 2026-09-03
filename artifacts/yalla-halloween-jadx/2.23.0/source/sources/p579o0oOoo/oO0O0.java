package p579o0oOoo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f56563OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0(oO0O0O00 oo0o0o00) {
        super(0);
        this.f56563OooO0Oo = oo0o0o00;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        Function0<Unit> function0 = this.f56563OooO0Oo.f56578OooO0o0;
        if (function0 == null) {
            return null;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
