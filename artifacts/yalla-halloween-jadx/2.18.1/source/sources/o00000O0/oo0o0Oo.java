package o00000O0;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.NodeLocationHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {
    @Nullable
    public static final LayoutNode OooO00o(@NotNull LayoutNode layoutNode, @NotNull Function1<? super LayoutNode, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(layoutNode).booleanValue()) {
            return layoutNode;
        }
        o000OOo.OooO00o oooO00o = (o000OOo.OooO00o) layoutNode.OooOOo0();
        int i = oooO00o.f3665Oooo0o.f3664Oooo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNodeOooO00o = OooO00o((LayoutNode) oooO00o.get(i2), predicate);
            if (layoutNodeOooO00o != null) {
                return layoutNodeOooO00o;
            }
        }
        return null;
    }

    @NotNull
    public static final List<OooOo> OooO0O0(@NotNull LayoutNode layoutNode, @NotNull List<OooOo> list) {
        List mutableList;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        if (!layoutNode.OooOoo0()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        o000OOo.OooO00o oooO00o = (o000OOo.OooO00o) layoutNode.OooOOo0();
        int i = oooO00o.f3665Oooo0o.f3664Oooo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) oooO00o.get(i2);
            if (layoutNode2.OooOoo0()) {
                arrayList.add(new NodeLocationHolder(layoutNode, layoutNode2));
            }
        }
        try {
            NodeLocationHolder.OooO00o oooO00o2 = NodeLocationHolder.f6648OoooO00;
            NodeLocationHolder.ComparisonStrategy comparisonStrategy = NodeLocationHolder.ComparisonStrategy.Stripe;
            Intrinsics.checkNotNullParameter(comparisonStrategy, "<set-?>");
            NodeLocationHolder.f6647OoooO0 = comparisonStrategy;
            mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            CollectionsKt.sort(mutableList);
        } catch (IllegalArgumentException unused) {
            NodeLocationHolder.OooO00o oooO00o3 = NodeLocationHolder.f6648OoooO00;
            NodeLocationHolder.ComparisonStrategy comparisonStrategy2 = NodeLocationHolder.ComparisonStrategy.Location;
            Intrinsics.checkNotNullParameter(comparisonStrategy2, "<set-?>");
            NodeLocationHolder.f6647OoooO0 = comparisonStrategy2;
            mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            CollectionsKt.sort(mutableList);
        }
        ArrayList arrayList2 = new ArrayList(mutableList.size());
        int size = mutableList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((NodeLocationHolder) mutableList.get(i3)).f6651Oooo0oO);
        }
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i4);
            OooOo oooOoOooO0Oo = o00Oo0.OooO0Oo(layoutNode3);
            if (oooOoOooO0Oo != null) {
                list.add(oooOoOooO0Oo);
            } else {
                OooO0O0(layoutNode3, list);
            }
        }
        return list;
    }

    @NotNull
    public static final o000000.oo000o OooO0OO(@NotNull LayoutNode layoutNode) {
        o000000.oo000o oo000oVar;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        OooOo oooOoOooO0OO = o00Oo0.OooO0OO(layoutNode);
        if (oooOoOooO0OO == null) {
            oooOoOooO0OO = o00Oo0.OooO0Oo(layoutNode);
        }
        return (oooOoOooO0OO == null || (oo000oVar = oooOoOooO0OO.f26652Oooo0o) == null) ? layoutNode.f6165o00Ooo : oo000oVar;
    }
}
