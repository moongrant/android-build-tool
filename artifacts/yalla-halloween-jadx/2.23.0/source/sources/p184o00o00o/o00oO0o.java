package p184o00o00o;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o {
    public static Modifier OooO00o(Modifier.Companion companion, Oooo000 pagerState, List tabPositions) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        o0OoOo0 pageIndexMapping = o0OoOo0.f38678OooO0Oo;
        Intrinsics.checkNotNullParameter(pageIndexMapping, "pageIndexMapping");
        return LayoutModifierKt.layout(companion, new o00Ooo(tabPositions, pageIndexMapping, new oo000o(pagerState)));
    }
}
