package p644o0ooOOo;

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

/* JADX INFO: loaded from: classes.dex */
public final class o0OOo000 {
    public static final void OooO00o(@NotNull oO0Ooooo state, @NotNull List<? extends Measurable> measurables) {
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
                oO0Oo oo0oo = parentData instanceof oO0Oo ? (oO0Oo) parentData : null;
                layoutId = oo0oo == null ? null : oo0oo.OooO00o();
                if (layoutId == null) {
                    layoutId = new o0OOO0OO();
                }
            }
            OooO00o OooO00o2 = state.OooO00o(layoutId);
            if (OooO00o2 instanceof OooO00o) {
                OooO00o2.f4320Oooo0O0 = measurable;
                ConstraintWidget constraintWidget = OooO00o2.f4321Oooo0OO;
                if (constraintWidget != null) {
                    constraintWidget.f4400Ooooooo = measurable;
                }
            }
            Intrinsics.checkNotNullParameter(measurable, "<this>");
            Object parentData2 = measurable.getParentData();
            oO0Oo oo0oo2 = parentData2 instanceof oO0Oo ? (oO0Oo) parentData2 : null;
            String strOooO0O0 = oo0oo2 != null ? oo0oo2.OooO0O0() : null;
            if (strOooO0O0 != null && (layoutId instanceof String)) {
                String str = (String) layoutId;
                OooO00o OooO00o3 = state.OooO00o(str);
                if (OooO00o3 instanceof OooO00o) {
                    OooO00o3.getClass();
                    HashMap<String, ArrayList<String>> map = state.f4328OooO0OO;
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
    public static final Pair OooO0O0(@NotNull ConstraintLayoutScope scope, @NotNull MutableState remeasureRequesterState, @NotNull oO000O0 measurer, @Nullable Composer composer) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remeasureRequesterState, "remeasureRequesterState");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        composer.startReplaceableGroup(-441911751);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new ooo0Oo0(scope);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ooo0Oo0 ooo0oo0 = (ooo0Oo0) objRememberedValue;
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed((Object) 257);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = TuplesKt.to(new o0OOOO00(measurer, ooo0oo0, remeasureRequesterState), new o0OOOO0o(remeasureRequesterState, ooo0oo0));
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Pair pair = (Pair) objRememberedValue2;
        composer.endReplaceableGroup();
        return pair;
    }
}
