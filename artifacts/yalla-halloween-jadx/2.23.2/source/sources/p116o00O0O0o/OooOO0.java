package p116o00O0O0o;

import kotlin.jvm.internal.Intrinsics;
import o00O0OO.o00Ooo;
import o00O0OO0.OooOO0O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends OooOOO0<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(@NotNull OooOO0O<Boolean> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // p116o00O0O0o.OooOOO0
    public final boolean OooO0O0(@NotNull o00Ooo workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f36224OooOO0.f36132OooO0O0;
    }

    @Override // p116o00O0O0o.OooOOO0
    public final boolean OooO0OO(Boolean bool) {
        return !bool.booleanValue();
    }
}
