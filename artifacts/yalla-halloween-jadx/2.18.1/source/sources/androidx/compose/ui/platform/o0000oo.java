package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000oo implements o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ViewConfiguration f6426OooO00o;

    public o0000oo(@NotNull ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f6426OooO00o = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.o00OOOOo
    public final long OooO00o() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.o00OOOOo
    public final void OooO0O0() {
    }

    @Override // androidx.compose.ui.platform.o00OOOOo
    public final long OooO0OO() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.o00OOOOo
    public final long OooO0Oo() {
        float f = 48;
        return o0000O0O.OooOOO.OooO0O0(f, f);
    }

    @Override // androidx.compose.ui.platform.o00OOOOo
    public final float OooO0o0() {
        return this.f6426OooO00o.getScaledTouchSlop();
    }
}
