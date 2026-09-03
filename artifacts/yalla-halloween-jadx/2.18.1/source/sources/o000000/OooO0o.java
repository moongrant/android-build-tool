package o000000;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TreeSet;
import java.util.Comparator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f26589OooO00o = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) OooO0OO.f26588Oooo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Comparator<LayoutNode> f26590OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final TreeSet<LayoutNode> f26591OooO0OO;

    public OooO0o() {
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f26590OooO0O0 = oooO0O0;
        this.f26591OooO0OO = new TreeSet<>(oooO0O0);
    }

    public final void OooO00o(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.OooOoo0()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f26591OooO0OO.add(node);
    }

    public final boolean OooO0O0() {
        return this.f26591OooO0OO.isEmpty();
    }

    public final boolean OooO0OO(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.OooOoo0()) {
            return this.f26591OooO0OO.remove(node);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    public final String toString() {
        String string = this.f26591OooO0OO.toString();
        Intrinsics.checkNotNullExpressionValue(string, "set.toString()");
        return string;
    }
}
