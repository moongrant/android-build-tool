package o00000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LayoutNode f26952OooO00o;

    public o00Ooo(@NotNull LayoutNode rootNode) {
        Intrinsics.checkNotNullParameter(rootNode, "rootNode");
        this.f26952OooO00o = rootNode;
    }

    @NotNull
    public final o00O0O OooO00o() {
        OooOo oooOoOooO0Oo = o00Oo0.OooO0Oo(this.f26952OooO00o);
        Intrinsics.checkNotNull(oooOoOooO0Oo);
        return new o00O0O(oooOoOooO0Oo, false);
    }
}
