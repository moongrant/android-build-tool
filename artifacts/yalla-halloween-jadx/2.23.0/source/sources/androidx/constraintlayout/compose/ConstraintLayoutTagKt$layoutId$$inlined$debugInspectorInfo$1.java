package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    public ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1() {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InspectorInfo inspectorInfo) {
        InspectorInfo inspectorInfo2 = inspectorInfo;
        Intrinsics.checkNotNullParameter(inspectorInfo2, "$this$null");
        inspectorInfo2.setName("constraintLayoutId");
        inspectorInfo2.setValue(null);
        return Unit.INSTANCE;
    }
}
