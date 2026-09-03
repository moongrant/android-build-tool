package p644o0ooOOo;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oO0000O extends Lambda implements Function1<oO0Ooooo, Dimension> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0000O f58077OooO0Oo = new oO0000O();

    public oO0000O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Dimension invoke(oO0Ooooo oo0ooooo) {
        oO0Ooooo it = oo0ooooo;
        Intrinsics.checkNotNullParameter(it, "it");
        Dimension dimensionOooO00o = Dimension.OooO00o();
        Intrinsics.checkNotNullExpressionValue(dimensionOooO00o, "Fixed(WRAP_DIMENSION)");
        return dimensionOooO00o;
    }
}
