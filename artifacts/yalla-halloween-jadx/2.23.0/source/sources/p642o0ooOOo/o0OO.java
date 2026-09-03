package p642o0ooOOo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.core.state.OooO00o;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p117o00O0Oo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO {
    public static final void OooO00o(@NotNull oO0000O state, @NotNull List<? extends Measurable> measurables) {
        ArrayList<String> arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Measurable measurable = measurables.get(i);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null) {
                Intrinsics.checkNotNullParameter(measurable, "<this>");
                Object parentData = measurable.getParentData();
                o0OOO0 o0ooo1 = parentData instanceof o0OOO0 ? (o0OOO0) parentData : null;
                layoutId = o0ooo1 == null ? null : o0ooo1.OooO00o();
                if (layoutId == null) {
                    layoutId = new OooOo00();
                }
            }
            OooO00o OooO00o2 = state.OooO00o(layoutId);
            if (OooO00o2 instanceof OooO00o) {
                OooO00o2.f4314Oooo0O0 = measurable;
                ConstraintWidget constraintWidget = OooO00o2.f4315Oooo0OO;
                if (constraintWidget != null) {
                    constraintWidget.f4394Ooooooo = measurable;
                }
            }
            Intrinsics.checkNotNullParameter(measurable, "<this>");
            Object parentData2 = measurable.getParentData();
            o0OOO0 o0ooo2 = parentData2 instanceof o0OOO0 ? (o0OOO0) parentData2 : null;
            String strOooO0O0 = o0ooo2 != null ? o0ooo2.OooO0O0() : null;
            if (strOooO0O0 != null && (layoutId instanceof String)) {
                String str = (String) layoutId;
                OooO00o OooO00o3 = state.OooO00o(str);
                if (OooO00o3 instanceof OooO00o) {
                    OooO00o3.getClass();
                    HashMap<String, ArrayList<String>> map = state.f4322OooO0OO;
                    if (map.containsKey(strOooO0O0)) {
                        arrayList = map.get(strOooO0O0);
                    } else {
                        arrayList = new ArrayList<>();
                        map.put(strOooO0O0, arrayList);
                    }
                    arrayList.add(str);
                }
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final Pair OooO0O0(@NotNull ConstraintLayoutScope scope, @NotNull MutableState remeasureRequesterState, @NotNull oO00000 measurer, @Nullable Composer composer) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remeasureRequesterState, "remeasureRequesterState");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        composer.startReplaceableGroup(-441911751);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new o0OOOO00(scope);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        o0OOOO00 o0oooo01 = (o0OOOO00) objRememberedValue;
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed((Object) 257);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = TuplesKt.to(new o0OO0o(measurer, o0oooo01, remeasureRequesterState), new o0OO0oO0(remeasureRequesterState, o0oooo01));
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Pair pair = (Pair) objRememberedValue2;
        composer.endReplaceableGroup();
        return pair;
    }
}
