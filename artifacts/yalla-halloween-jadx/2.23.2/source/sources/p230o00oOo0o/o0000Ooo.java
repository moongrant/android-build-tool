package p230o00oOo0o;

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
public final class o0000Ooo extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<TabPosition> f39784OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000000O f39785OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Integer> f39786OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(List list, Function1 function1, o0000 o0000Var) {
        super(3);
        this.f39784OooO0Oo = list;
        this.f39786OooO0o0 = function1;
        this.f39785OooO0o = o0000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int iMo320roundToPx0680j_4;
        int iMo320roundToPx0680j_5;
        MeasureScope layout = measureScope;
        Measurable measurable2 = measurable;
        long value = constraints.getValue();
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable2, "measurable");
        List<TabPosition> list = this.f39784OooO0Oo;
        if (list.isEmpty()) {
            return MeasureScope.CC.OooOOo0(layout, Constraints.m3743getMaxWidthimpl(value), 0, null, o00000O.f39779OooO0Oo, 4, null);
        }
        int lastIndex = CollectionsKt.getLastIndex(list);
        o000000O o000000o2 = this.f39785OooO0o;
        int iMin = Math.min(lastIndex, this.f39786OooO0o0.invoke(Integer.valueOf(o000000o2.OooO00o())).intValue());
        TabPosition tabPosition = list.get(iMin);
        TabPosition tabPosition2 = (TabPosition) CollectionsKt.getOrNull(list, iMin - 1);
        TabPosition tabPosition3 = (TabPosition) CollectionsKt.getOrNull(list, iMin + 1);
        float fOooO0O0 = o000000o2.OooO0O0();
        if (fOooO0O0 <= 0.0f || tabPosition3 == null) {
            iMo320roundToPx0680j_4 = (fOooO0O0 >= 0.0f || tabPosition2 == null) ? layout.mo320roundToPx0680j_4(tabPosition.getWidth()) : layout.mo320roundToPx0680j_4(DpKt.m3818lerpMdfbLM(tabPosition.getWidth(), tabPosition2.getWidth(), -fOooO0O0));
        } else {
            iMo320roundToPx0680j_4 = layout.mo320roundToPx0680j_4(DpKt.m3818lerpMdfbLM(tabPosition.getWidth(), tabPosition3.getWidth(), fOooO0O0));
        }
        if (fOooO0O0 <= 0.0f || tabPosition3 == null) {
            iMo320roundToPx0680j_5 = (fOooO0O0 >= 0.0f || tabPosition2 == null) ? layout.mo320roundToPx0680j_4(tabPosition.getLeft()) : layout.mo320roundToPx0680j_4(DpKt.m3818lerpMdfbLM(tabPosition.getLeft(), tabPosition2.getLeft(), -fOooO0O0));
        } else {
            iMo320roundToPx0680j_5 = layout.mo320roundToPx0680j_4(DpKt.m3818lerpMdfbLM(tabPosition.getLeft(), tabPosition3.getLeft(), fOooO0O0));
        }
        Placeable placeableMo2804measureBRTryo0 = measurable2.mo2804measureBRTryo0(ConstraintsKt.Constraints(iMo320roundToPx0680j_4, iMo320roundToPx0680j_4, 0, Constraints.m3742getMaxHeightimpl(value)));
        return MeasureScope.CC.OooOOo0(layout, Constraints.m3743getMaxWidthimpl(value), Math.max(placeableMo2804measureBRTryo0.getHeight(), Constraints.m3744getMinHeightimpl(value)), null, new o00000OO(placeableMo2804measureBRTryo0, iMo320roundToPx0680j_5, value), 4, null);
    }
}
