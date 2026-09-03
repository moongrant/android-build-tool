package o0000OO;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends Lambda implements Function1<o00000, Dimension> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0Oo0oo f27419Oooo0o = new o0Oo0oo();

    public o0Oo0oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Dimension invoke(o00000 o00000Var) {
        o00000 it = o00000Var;
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = Dimension.f6837OooO0oO;
        Dimension dimensionOooO00o = Dimension.OooO00o();
        Intrinsics.checkNotNullExpressionValue(dimensionOooO00o, "Fixed(WRAP_DIMENSION)");
        return dimensionOooO00o;
    }
}
