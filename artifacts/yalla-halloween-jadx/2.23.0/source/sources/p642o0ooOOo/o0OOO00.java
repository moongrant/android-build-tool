package p642o0ooOOo;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutIdParentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o0OOO00 implements LayoutIdParentData {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OO0O0 f59557OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Object f59558OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function1<o0OO0, Unit> f59559OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO00(@NotNull o0OO0O0 ref, @NotNull Function1<? super o0OO0, Unit> constrain) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(constrain, "constrain");
        this.f59557OooO0Oo = ref;
        this.f59559OooO0o0 = constrain;
        this.f59558OooO0o = ref.f59539OooO00o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o0OOO00) {
            o0OOO00 o0ooo00 = (o0OOO00) obj;
            if (Intrinsics.areEqual(this.f59557OooO0Oo.f59539OooO00o, o0ooo00.f59557OooO0Oo.f59539OooO00o) && Intrinsics.areEqual(this.f59559OooO0o0, o0ooo00.f59559OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    @NotNull
    public final Object getLayoutId() {
        return this.f59558OooO0o;
    }

    public final int hashCode() {
        return this.f59559OooO0o0.hashCode() + (this.f59557OooO0Oo.f59539OooO00o.hashCode() * 31);
    }
}
