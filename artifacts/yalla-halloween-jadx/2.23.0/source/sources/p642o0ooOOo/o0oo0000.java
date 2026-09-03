package p642o0ooOOo;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0oo0000 extends Lambda implements Function1<oO0000O, Dimension> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0oo0000 f59576OooO0Oo = new o0oo0000();

    public o0oo0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Dimension invoke(oO0000O oo0000o) {
        oO0000O it = oo0000o;
        Intrinsics.checkNotNullParameter(it, "it");
        Dimension dimensionOooO00o = Dimension.OooO00o();
        Intrinsics.checkNotNullExpressionValue(dimensionOooO00o, "Fixed(WRAP_DIMENSION)");
        return dimensionOooO00o;
    }
}
