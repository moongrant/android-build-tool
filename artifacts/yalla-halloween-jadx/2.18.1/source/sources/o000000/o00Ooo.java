package o000000;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {
    @NotNull
    public static final o00000 OooO00o(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        o00000 o00000Var = layoutNode.f6143OoooO0O;
        if (o00000Var != null) {
            return o00000Var;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
