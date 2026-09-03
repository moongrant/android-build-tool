package p230o00oOo0o;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 {
    public static Modifier OooO00o(Modifier.Companion companion, o000000 pagerState, List tabPositions) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        o00000O0 pageIndexMapping = o00000O0.f39780OooO0Oo;
        Intrinsics.checkNotNullParameter(pageIndexMapping, "pageIndexMapping");
        return LayoutModifierKt.layout(companion, new o0000Ooo(tabPositions, pageIndexMapping, new o0000(pagerState)));
    }
}
