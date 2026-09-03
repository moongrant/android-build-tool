package p644o0ooOOo;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oO00000o extends Lambda implements Function1<oO0Ooooo, Dimension> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO00000o f58076OooO0Oo = new oO00000o();

    public oO00000o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Dimension invoke(oO0Ooooo oo0ooooo) {
        oO0Ooooo it = oo0ooooo;
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = Dimension.f4276OooO0oo;
        Dimension dimension = new Dimension();
        dimension.f4284OooO0o0 = obj;
        dimension.f4283OooO0o = true;
        Intrinsics.checkNotNullExpressionValue(dimension, "Suggested(WRAP_DIMENSION)");
        return dimension;
    }
}
