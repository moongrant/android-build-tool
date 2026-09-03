package o000000;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo implements Comparator<LayoutNode> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final oo0o0Oo f26737Oooo0o = new oo0o0Oo();

    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode a = layoutNode;
        LayoutNode b = layoutNode2;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        int iCompare = Intrinsics.compare(b.f6140OoooO, a.f6140OoooO);
        return iCompare != 0 ? iCompare : Intrinsics.compare(a.hashCode(), b.hashCode());
    }
}
