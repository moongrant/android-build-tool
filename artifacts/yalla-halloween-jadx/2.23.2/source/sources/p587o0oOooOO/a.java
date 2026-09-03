package p587o0oOooOO;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OooO;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nBottomSheetDialogProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt$BottomSheetDialogLayout$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1549#2:595\n1620#2,3:596\n1963#2,14:599\n1963#2,14:613\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt$BottomSheetDialogLayout$1\n*L\n571#1:595\n571#1:596,3\n572#1:599,14\n573#1:613,14\n*E\n"})
public final class a implements MeasurePolicy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final a f56738OooO00o = new a();

    @SourceDebugExtension({"SMAP\nBottomSheetDialogProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt$BottomSheetDialogLayout$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1855#2,2:595\n*S KotlinDebug\n*F\n+ 1 BottomSheetDialogProperties.kt\ncom/yalla/yalla/ui/view/BottomSheetDialogPropertiesKt$BottomSheetDialogLayout$1$1\n*L\n575#1:595,2\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Placeable> f56739OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ArrayList arrayList) {
            super(1);
            this.f56739OooO0Oo = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Iterator<T> it = this.f56739OooO0Oo.iterator();
            while (it.hasNext()) {
                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) it.next(), 0, 0, 0.0f, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return OooO.OooO00o(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return OooO.OooO0O0(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo3measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
        Object next;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(measurables));
        Iterator<T> it = measurables.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo2804measureBRTryo0(j));
        }
        Iterator it2 = arrayList.iterator();
        Object next2 = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int width = ((Placeable) next).getWidth();
                do {
                    Object next3 = it2.next();
                    int width2 = ((Placeable) next3).getWidth();
                    if (width < width2) {
                        next = next3;
                        width = width2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Placeable placeable = (Placeable) next;
        int width3 = placeable != null ? placeable.getWidth() : Constraints.m3745getMinWidthimpl(j);
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                int height = ((Placeable) next2).getHeight();
                do {
                    Object next4 = it3.next();
                    int height2 = ((Placeable) next4).getHeight();
                    if (height < height2) {
                        next2 = next4;
                        height = height2;
                    }
                } while (it3.hasNext());
            }
        }
        Placeable placeable2 = (Placeable) next2;
        return MeasureScope.CC.OooOOo0(Layout, width3, placeable2 != null ? placeable2.getHeight() : Constraints.m3744getMinHeightimpl(j), null, new OooO00o(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return OooO.OooO0OO(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return OooO.OooO0Oo(this, intrinsicMeasureScope, list, i);
    }
}
