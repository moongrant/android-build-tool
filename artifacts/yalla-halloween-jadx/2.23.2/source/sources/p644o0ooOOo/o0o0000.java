package p644o0ooOOo;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutIdParentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o0o0000 implements LayoutIdParentData {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OO f58072OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Object f58073OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function1<o0OO0oO0, Unit> f58074OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0o0000(@NotNull o0OO ref, @NotNull Function1<? super o0OO0oO0, Unit> constrain) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(constrain, "constrain");
        this.f58072OooO0Oo = ref;
        this.f58074OooO0o0 = constrain;
        this.f58073OooO0o = ref.f58020OooO00o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o0o0000) {
            o0o0000 o0o0000Var = (o0o0000) obj;
            if (Intrinsics.areEqual(this.f58072OooO0Oo.f58020OooO00o, o0o0000Var.f58072OooO0Oo.f58020OooO00o) && Intrinsics.areEqual(this.f58074OooO0o0, o0o0000Var.f58074OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    @NotNull
    public final Object getLayoutId() {
        return this.f58073OooO0o;
    }

    public final int hashCode() {
        return this.f58074OooO0o0.hashCode() + (this.f58072OooO0Oo.f58020OooO00o.hashCode() * 31);
    }
}
