package p184o00o00o;

import androidx.compose.material.TabPosition;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DpKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<TabPosition> f38675OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f38676OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Integer> f38677OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(List list, Function1 function1, oo000o oo000oVar) {
        super(3);
        this.f38675OooO0Oo = list;
        this.f38677OooO0o0 = function1;
        this.f38676OooO0o = oo000oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int iMo318roundToPx0680j_4;
        int iMo318roundToPx0680j_5;
        MeasureScope layout = measureScope;
        Measurable measurable2 = measurable;
        long value = constraints.getValue();
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable2, "measurable");
        List<TabPosition> list = this.f38675OooO0Oo;
        if (list.isEmpty()) {
            return MeasureScope.CC.OooOOo0(layout, Constraints.m3733getMaxWidthimpl(value), 0, null, o00O0O.f38671OooO0Oo, 4, null);
        }
        int lastIndex = CollectionsKt.getLastIndex(list);
        Oooo0 oooo0 = this.f38676OooO0o;
        int iMin = Math.min(lastIndex, this.f38677OooO0o0.invoke(Integer.valueOf(oooo0.OooO00o())).intValue());
        TabPosition tabPosition = list.get(iMin);
        TabPosition tabPosition2 = (TabPosition) CollectionsKt.getOrNull(list, iMin - 1);
        TabPosition tabPosition3 = (TabPosition) CollectionsKt.getOrNull(list, iMin + 1);
        float fOooO0O0 = oooo0.OooO0O0();
        if (fOooO0O0 <= 0.0f || tabPosition3 == null) {
            iMo318roundToPx0680j_4 = (fOooO0O0 >= 0.0f || tabPosition2 == null) ? layout.mo318roundToPx0680j_4(tabPosition.getWidth()) : layout.mo318roundToPx0680j_4(DpKt.m3808lerpMdfbLM(tabPosition.getWidth(), tabPosition2.getWidth(), -fOooO0O0));
        } else {
            iMo318roundToPx0680j_4 = layout.mo318roundToPx0680j_4(DpKt.m3808lerpMdfbLM(tabPosition.getWidth(), tabPosition3.getWidth(), fOooO0O0));
        }
        if (fOooO0O0 <= 0.0f || tabPosition3 == null) {
            iMo318roundToPx0680j_5 = (fOooO0O0 >= 0.0f || tabPosition2 == null) ? layout.mo318roundToPx0680j_4(tabPosition.getLeft()) : layout.mo318roundToPx0680j_4(DpKt.m3808lerpMdfbLM(tabPosition.getLeft(), tabPosition2.getLeft(), -fOooO0O0));
        } else {
            iMo318roundToPx0680j_5 = layout.mo318roundToPx0680j_4(DpKt.m3808lerpMdfbLM(tabPosition.getLeft(), tabPosition3.getLeft(), fOooO0O0));
        }
        Placeable placeableMo2794measureBRTryo0 = measurable2.mo2794measureBRTryo0(ConstraintsKt.Constraints(iMo318roundToPx0680j_4, iMo318roundToPx0680j_4, 0, Constraints.m3732getMaxHeightimpl(value)));
        return MeasureScope.CC.OooOOo0(layout, Constraints.m3733getMaxWidthimpl(value), Math.max(placeableMo2794measureBRTryo0.getHeight(), Constraints.m3734getMinHeightimpl(value)), null, new o00Oo0(placeableMo2794measureBRTryo0, iMo318roundToPx0680j_5, value), 4, null);
    }
}
