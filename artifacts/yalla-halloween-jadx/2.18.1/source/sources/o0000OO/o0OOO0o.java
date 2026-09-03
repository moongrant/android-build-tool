package o0000OO;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends Lambda implements Function1<o00000, Dimension> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0OOO0o f27418Oooo0o = new o0OOO0o();

    public o0OOO0o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Dimension invoke(o00000 o00000Var) {
        o00000 it = o00000Var;
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = Dimension.f6837OooO0oO;
        Dimension dimension = new Dimension();
        dimension.f6843OooO0Oo = obj;
        dimension.f6844OooO0o0 = true;
        Intrinsics.checkNotNullExpressionValue(dimension, "Suggested(WRAP_DIMENSION)");
        return dimension;
    }
}
