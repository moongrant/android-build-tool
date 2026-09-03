package o000000;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Comparator<LayoutNode> {
    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode l1 = layoutNode;
        LayoutNode l2 = layoutNode2;
        Intrinsics.checkNotNullParameter(l1, "l1");
        Intrinsics.checkNotNullParameter(l2, "l2");
        int iCompare = Intrinsics.compare(l1.f6140OoooO, l2.f6140OoooO);
        return iCompare != 0 ? iCompare : Intrinsics.compare(l1.hashCode(), l2.hashCode());
    }
}
