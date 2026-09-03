package o0O0O00;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo {
    public static int OooO00o(o000000 o000000Var, @NotNull OooOo00 oooOo00, @NotNull List measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new OooOO0O((OooOOOO) measurables.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return o000000Var.OooO00o(new OooOo(oooOo00, oooOo00.getLayoutDirection()), arrayList, o0000O0O.OooO0OO.OooO0O0(i, 0, 13)).getHeight();
    }

    public static int OooO0O0(o000000 o000000Var, @NotNull OooOo00 oooOo00, @NotNull List measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new OooOO0O((OooOOOO) measurables.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return o000000Var.OooO00o(new OooOo(oooOo00, oooOo00.getLayoutDirection()), arrayList, o0000O0O.OooO0OO.OooO0O0(0, i, 7)).getWidth();
    }

    public static int OooO0OO(o000000 o000000Var, @NotNull OooOo00 oooOo00, @NotNull List measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new OooOO0O((OooOOOO) measurables.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return o000000Var.OooO00o(new OooOo(oooOo00, oooOo00.getLayoutDirection()), arrayList, o0000O0O.OooO0OO.OooO0O0(i, 0, 13)).getHeight();
    }

    public static int OooO0Oo(o000000 o000000Var, @NotNull OooOo00 oooOo00, @NotNull List measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new OooOO0O((OooOOOO) measurables.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return o000000Var.OooO00o(new OooOo(oooOo00, oooOo00.getLayoutDirection()), arrayList, o0000O0O.OooO0OO.OooO0O0(0, i, 7)).getWidth();
    }
}
