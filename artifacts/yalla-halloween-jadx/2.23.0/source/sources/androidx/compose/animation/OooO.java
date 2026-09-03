package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p246o00oo0o0.o000O0O0;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements o000O0O0.OooO00o {
    public static Function2 OooO00o(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m1316setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1316setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static void OooO0O0(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker, o00O0 o00o1) {
        o00o1.OooO0OO(new oOO00O(i, str, i2, defaultConstructorMarker));
    }
}
