package p710ooOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements Function1<o00000O0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o000000 f53438Oooo0o;

    public o00000(@NotNull o000000 modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f53438Oooo0o = modifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000O0 o00000o1) {
        o00000O0 focusProperties = o00000o1;
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        o000000 o000000Var = this.f53438Oooo0o;
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        o000000Var.o0OOO0o();
        return Unit.INSTANCE;
    }
}
