package p642o0ooOOo;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oO0Oo extends Lambda implements Function1<oO0000O, Dimension> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0Oo f59596OooO0Oo = new oO0Oo();

    public oO0Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Dimension invoke(oO0000O oo0000o) {
        oO0000O it = oo0000o;
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = Dimension.f4270OooO0oo;
        Dimension dimension = new Dimension();
        dimension.f4278OooO0o0 = obj;
        dimension.f4277OooO0o = true;
        Intrinsics.checkNotNullExpressionValue(dimension, "Suggested(WRAP_DIMENSION)");
        return dimension;
    }
}
